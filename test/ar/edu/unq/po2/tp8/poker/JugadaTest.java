package ar.edu.unq.po2.tp8.poker;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;

class JugadaTest {
	
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	private Jugada jugada1;
	
	
	@BeforeEach
	public void setUp() {
		
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
		
		jugada1 = new Jugada(carta1, carta2, carta3, carta4, carta5);
		
		// setUp valores
		when(carta1.getValor()).thenReturn("KING");
		when(carta2.getValor()).thenReturn("CINCO");
		when(carta3.getValor()).thenReturn("TRES");
		when(carta4.getValor()).thenReturn("KING");
		when(carta5.getValor()).thenReturn("DIEZ");
		// setUp palos
		when(carta1.getPalo()).thenReturn("CORAZON");
		when(carta2.getPalo()).thenReturn("TREBOL");
		when(carta3.getPalo()).thenReturn("DIAMANTE");
		when(carta4.getPalo()).thenReturn("PICA");
		when(carta5.getPalo()).thenReturn("TREBOL");
	}

	@Test
	public void testConstructorJugada() {
		// exercise
		Integer cantValores = jugada1.getValores().length;
		Integer cantPalos = jugada1.getPalos().length;
		
		// verify
		assertTrue(cantValores == 5);
		assertTrue(cantPalos == 5);
	}

}
