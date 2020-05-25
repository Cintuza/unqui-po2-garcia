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
		solicitud = new SolicitudDeCreditoPersonal(cliente, 20000d, 5);
		
		when(this.cliente.getSueldoNeto()).thenReturn(30000d);
		when(this.cliente.sueldoNetoAnual()).thenReturn(360000d);
	}

	//Testeo de constructor de SUT con parametros correctos
	@Test
	public void testCreacionSolicitudDeCreditoPersonal() {
		Double montoSolicitado = solicitud.getMontoSolicitado();
		Integer plazoDePago = solicitud.getPlazoDePago();
		
		assertEquals(20000, montoSolicitado);
		assertEquals(5, plazoDePago);
	}
	
	//Testeo de metodo montoCuotaMensual
	@Test
	public void testMontoCuotaMensual() {
		Double montoCuotaMensual = solicitud.montoCuotaMensual();
		
		assertEquals(4000d, montoCuotaMensual);
	}
	
	//Testeo del metodo esAceptable para caso donde la solicitud es aceptable
	@Test
	public void testEsAceptable() {
		when(this.cliente.getSueldoNeto()).thenReturn(30000d);
		when(this.cliente.sueldoNetoAnual()).thenReturn(360000d);
		
		assertTrue(solicitud.esAceptable());
	}
	
	//Testeo del metodo esAceptable para caso donde la solicitud es denegada por ingreso anual insuficiente
	@Test
	public void testNoEsAceptablePorIngresoAnual() {
		SolicitudDeCreditoPersonal otraSolicitud = new SolicitudDeCreditoPersonal(cliente, 400000d, 5);
		
		assertFalse(otraSolicitud.esAceptable());
	}
	
	//Testeo del metodo esAceptable para caso donde la solicitud es denegada por ingreso anual insuficiente
	@Test
	public void testNoEsAceptablePorSueldoMensual() {
		SolicitudDeCreditoPersonal otraSolicitud = new SolicitudDeCreditoPersonal(cliente, 150000d, 5);
		
		assertFalse(otraSolicitud.esAceptable());
	}

}
