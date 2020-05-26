package ar.edu.unq.po2.tp6.SolicitudesCredito;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;

class SolicitudDeCreditoPersonalTest {
	
	private Cliente cliente;
	private SolicitudDeCreditoPersonal solicitud;
	
	@BeforeEach
	public void setUp() {
		cliente = mock(Cliente.class);
		solicitud = new SolicitudDeCreditoPersonal(cliente, 20000d, 20); 
	}

	//Testeo de constructor de SUT con parametros correctos
	@Test
	public void testCreacionSolicitudDeCreditoPersonal() {
		Double montoSolicitado = solicitud.getMontoSolicitado();
		Integer plazoDePago = solicitud.getPlazoDePago();
		
		assertEquals(20000, montoSolicitado);
		assertEquals(20, plazoDePago);
	}
	
	//Testeo de metodo montoCuotaMensual
	@Test
	public void testMontoCuotaMensual() {
		Double montoCuotaMensual = solicitud.montoCuotaMensual();
		
		assertEquals(1000d, montoCuotaMensual);
	}
	
	//Testeo del metodo esAceptable para caso donde la solicitud es aceptable
	@Test
	public void testEsAceptable() {
		when(this.cliente.getSueldoNeto()).thenReturn(3000d);
		when(this.cliente.sueldoNetoAnual()).thenReturn(36000d);
		
		assertTrue(solicitud.esAceptable());
	}
	
	//Testeo del metodo esAceptable para caso donde la solicitud es denegada por ingreso anual insuficiente
	@Test
	public void testNoEsAceptablePorIngresoAnual() {
		when(this.cliente.getSueldoNeto()).thenReturn(1250d);
		when(this.cliente.sueldoNetoAnual()).thenReturn(14000d);
		
		assertFalse(solicitud.esAceptable());
	}
	
	//Testeo del metodo esAceptable para caso donde la solicitud es denegada por ingreso mensual insuficiente
	@Test
	public void testNoEsAceptablePorSueldoMensual() {
		SolicitudDeCreditoPersonal otraSolicitud = new SolicitudDeCreditoPersonal(cliente, 20000d, 5); 

		when(this.cliente.getSueldoNeto()).thenReturn(3000d);
		when(this.cliente.sueldoNetoAnual()).thenReturn(36000d);
		
		assertFalse(otraSolicitud.esAceptable());
	}

}
