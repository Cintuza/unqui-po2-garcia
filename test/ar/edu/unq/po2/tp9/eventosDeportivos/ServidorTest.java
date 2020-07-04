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
	void testServidorSeSuscribeADeportesYDeportesLoAgreganComoObservador() {
		Deporte futbol = mock(Deporte.class);
		Deporte voley = mock(Deporte.class);
		
		servidor.subscribirseADeporte(voley);
		servidor.subscribirseADeporte(futbol);
		
		verify(voley).agregarServidor(servidor);
		verify(futbol).agregarServidor(servidor);
	}

}
