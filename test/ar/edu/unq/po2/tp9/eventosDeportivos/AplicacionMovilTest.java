package ar.edu.unq.po2.tp9.eventosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

class AplicacionMovilTest {
	
	private AplicacionMovil aplicacion;
	private Partido atlantaVsChacarita;
	private InteresEnContrincante interesContrincante;
	private InteresEnDeporte interesDeporte;
	
	@BeforeEach
	public void setUp() {
		atlantaVsChacarita = mock(Partido.class);
		aplicacion = new AplicacionMovil();
		interesContrincante = new InteresEnContrincante(aplicacion);
		interesDeporte = new InteresEnDeporte(aplicacion);
	}

	@Test
	void testPartidoEsDeInteresPorContrincante() {
		interesContrincante.agregarContrincante("Atenas");
		interesContrincante.agregarContrincante("Atlanta");
		interesContrincante.agregarContrincante("Ferro");

		interesDeporte.agregarDeporte("Voley");
		interesDeporte.agregarDeporte("Basquet");

		when(atlantaVsChacarita.getDeporte()).thenReturn("Futbol");
		when(atlantaVsChacarita.jugoContrincante("Atenas")).thenReturn(false);
		when(atlantaVsChacarita.jugoContrincante("Atlanta")).thenReturn(true);
		when(atlantaVsChacarita.jugoContrincante("Ferro")).thenReturn(false);
		
		assertTrue(aplicacion.estaInteresadaEn(atlantaVsChacarita));
	}

	@Test
	void testPartidoEsDeInteresPorDeporte() {
		interesContrincante.agregarContrincante("Chicago");
		interesContrincante.agregarContrincante("Ferro");
		interesContrincante.agregarContrincante("Platense");

		interesDeporte.agregarDeporte("Futbol");
		interesDeporte.agregarDeporte("Basquet");

		when(atlantaVsChacarita.getDeporte()).thenReturn("Futbol");
		when(atlantaVsChacarita.jugoContrincante("Chicago")).thenReturn(false);
		when(atlantaVsChacarita.jugoContrincante("Ferro")).thenReturn(false);
		when(atlantaVsChacarita.jugoContrincante("Platense")).thenReturn(false);
		
		assertTrue(aplicacion.estaInteresadaEn(atlantaVsChacarita));
	}

	@Test
	void testPartidoEsDeInteresPorContrincanteYDeporte() {
		interesContrincante.agregarContrincante("Chicago");
		interesContrincante.agregarContrincante("Atlanta");
		interesContrincante.agregarContrincante("Platense");

		interesDeporte.agregarDeporte("Futbol");
		interesDeporte.agregarDeporte("Basquet");

		when(atlantaVsChacarita.getDeporte()).thenReturn("Futbol");
		when(atlantaVsChacarita.jugoContrincante("Chicago")).thenReturn(false);
		when(atlantaVsChacarita.jugoContrincante("Atlanta")).thenReturn(true);
		when(atlantaVsChacarita.jugoContrincante("Platense")).thenReturn(false);
		
		assertTrue(aplicacion.estaInteresadaEn(atlantaVsChacarita));
	}

	@Test
	void testPartidoNoEsDeInteres() {
		interesContrincante.agregarContrincante("Chicago");
		interesContrincante.agregarContrincante("Ferro");
		interesContrincante.agregarContrincante("Platense");

		interesDeporte.agregarDeporte("Voley");
		interesDeporte.agregarDeporte("Basquet");

		when(atlantaVsChacarita.getDeporte()).thenReturn("Futbol");
		when(atlantaVsChacarita.jugoContrincante("Chicago")).thenReturn(false);
		when(atlantaVsChacarita.jugoContrincante("Ferro")).thenReturn(false);
		when(atlantaVsChacarita.jugoContrincante("Platense")).thenReturn(false);
		
		assertFalse(aplicacion.estaInteresadaEn(atlantaVsChacarita));
	}

}
