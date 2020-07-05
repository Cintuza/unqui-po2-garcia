package ar.edu.unq.po2.tp6.solicitudesCredito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class BancoTest {
	
	private Banco banco;
	private SolicitudDeCreditoHipotecario solicitud1;
	private SolicitudDeCreditoHipotecario solicitud2;
	private SolicitudDeCreditoHipotecario solicitud3;
	private SolicitudDeCreditoPersonal solicitud4;
	private SolicitudDeCreditoPersonal solicitud5;
	private SolicitudDeCreditoPersonal solicitud6;

	@Test
	void testObtieneMontoTotalDeCreditosAprobados() {
		banco = new Banco();
		solicitud1 = mock(SolicitudDeCreditoHipotecario.class);
		solicitud2 = mock(SolicitudDeCreditoHipotecario.class);
		solicitud3 = mock(SolicitudDeCreditoHipotecario.class);
		solicitud4 = mock(SolicitudDeCreditoPersonal.class);
		solicitud5 = mock(SolicitudDeCreditoPersonal.class);
		solicitud6 = mock(SolicitudDeCreditoPersonal.class);

		when(solicitud1.esAceptable()).thenReturn(true);
		when(solicitud2.esAceptable()).thenReturn(false);
		when(solicitud3.esAceptable()).thenReturn(true);
		when(solicitud4.esAceptable()).thenReturn(true);
		when(solicitud5.esAceptable()).thenReturn(false);
		when(solicitud6.esAceptable()).thenReturn(false);
		
		when(solicitud1.getMontoSolicitado()).thenReturn(50000d);
		when(solicitud2.getMontoSolicitado()).thenReturn(120000d);
		when(solicitud3.getMontoSolicitado()).thenReturn(200000d);
		when(solicitud4.getMontoSolicitado()).thenReturn(5000d);
		when(solicitud5.getMontoSolicitado()).thenReturn(16000d);
		when(solicitud6.getMontoSolicitado()).thenReturn(39000d);

		banco.registrar(solicitud1);
		banco.registrar(solicitud2);
		banco.registrar(solicitud3);
		banco.registrar(solicitud4);
		banco.registrar(solicitud5);
		banco.registrar(solicitud6);
		
		assertEquals(255000, banco.obtenerMontoTotalSolicitudesAceptadas());
	}

}
