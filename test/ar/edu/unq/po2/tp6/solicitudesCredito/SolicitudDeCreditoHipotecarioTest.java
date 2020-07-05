package ar.edu.unq.po2.tp6.solicitudesCredito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoHipotecarioTest {
	
	private Cliente cliente;
	private PropiedadInmobiliaria propiedad;
	private SolicitudDeCreditoHipotecario solicitud;
	
	@BeforeEach
	public void setUp() {
		cliente = mock(Cliente.class);
		propiedad = mock(PropiedadInmobiliaria.class);
		solicitud = new SolicitudDeCreditoHipotecario(cliente, 100000d, 20, propiedad); 
	}

	// Testeo del metodo esAceptable para caso donde la solicitud es aceptable
	@Test
	public void testEsAceptable() {
		when(cliente.getSueldoNeto()).thenReturn(15000d);
		when(cliente.getEdad()).thenReturn(37);
		when(propiedad.getValorFiscal()).thenReturn(200000d);
		
		assertTrue(solicitud.esAceptable());
	}
	
	// Testeo del metodo esAceptable para caso donde la solicitud no es aceptable
	// por ingreso mensual insuficiente
	@Test
	public void testNoEsAceptablePorIngresoMensualInsuficiente() {
		when(cliente.getSueldoNeto()).thenReturn(9000d);
		when(cliente.getEdad()).thenReturn(37);
		when(propiedad.getValorFiscal()).thenReturn(200000d);
		
		assertFalse(solicitud.esAceptable());
	}
	
	// Testeo del metodo esAceptable para caso donde la solicitud no es aceptable 
	// por edad 
	@Test
	public void testNoEsAceptablePorEdadCliente() {
		when(cliente.getSueldoNeto()).thenReturn(15000d);
		when(cliente.getEdad()).thenReturn(64);
		when(propiedad.getValorFiscal()).thenReturn(200000d);
		
		assertFalse(solicitud.esAceptable());
	}
	
	// Testeo del metodo esAceptable para caso donde la solicitud no es aceptable 
	// por bajo valor fiscal de la propiedad 
	@Test
	public void testNoEsAceptablePorValorFiscalInsuficiente() {
		when(cliente.getSueldoNeto()).thenReturn(15000d);
		when(cliente.getEdad()).thenReturn(37);
		when(propiedad.getValorFiscal()).thenReturn(120000d);
		
		assertFalse(solicitud.esAceptable());
	}

}
