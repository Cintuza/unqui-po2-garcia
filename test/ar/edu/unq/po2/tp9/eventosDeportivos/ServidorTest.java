package ar.edu.unq.po2.tp9.eventosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;
import org.mockito.*;

class ServidorTest {
	
	private Servidor servidor;
	
	@BeforeEach
	public void setUp() {
		servidor = new Servidor();
	}

	@Test
	public void testServidorSeSuscribeADeportesYDeportesLoAgreganComoObservador() {
		Deporte futbol = mock(Deporte.class);
		Deporte voley = mock(Deporte.class);
		
		servidor.subscribirseADeporte(voley);
		servidor.subscribirseADeporte(futbol);
		
		verify(voley).agregarServidor(servidor);
		verify(futbol).agregarServidor(servidor);
	}
	
	@Test
	public void testServidorNotificaALasAplicacionesInteresadas() {
		AplicacionMovil aplicacion1 = mock(AplicacionMovil.class);
		AplicacionMovil aplicacion2 = mock(AplicacionMovil.class);
		AplicacionMovil aplicacion3 = mock(AplicacionMovil.class);
		Partido atlantaVsChacarita = mock(Partido.class);

		when(aplicacion1.estaInteresadaEn(atlantaVsChacarita)).thenReturn(true);
		when(aplicacion2.estaInteresadaEn(atlantaVsChacarita)).thenReturn(false);
		when(aplicacion3.estaInteresadaEn(atlantaVsChacarita)).thenReturn(true);

		servidor.agregarAplicacionMovil(aplicacion1);
		servidor.agregarAplicacionMovil(aplicacion2);
		servidor.agregarAplicacionMovil(aplicacion3);
		
		servidor.agregarPartido(atlantaVsChacarita);

		verify(aplicacion1).updateAplicacionMovil(atlantaVsChacarita);
		verify(aplicacion2, never()).updateAplicacionMovil(atlantaVsChacarita);
		verify(aplicacion3).updateAplicacionMovil(atlantaVsChacarita);
	}

}
