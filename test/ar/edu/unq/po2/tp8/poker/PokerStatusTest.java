package ar.edu.unq.po2.tp8.poker;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;

class PokerStatusTest {
	
	private PokerStatus pokerStatus;
	
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus();

		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
		
	}

	@Test
	public void testEsPokerCon8() {
		// setUp
		when(carta1.getValor()).thenReturn("OCHO");
		when(carta2.getValor()).thenReturn("CINCO");
		when(carta3.getValor()).thenReturn("OCHO");
		when(carta4.getValor()).thenReturn("OCHO");
		when(carta5.getValor()).thenReturn("OCHO");
		
		// exercise
		String esPoker = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
		
		// verify
		assertEquals("Poker", esPoker);
	}

	@Test
	public void testEsPokerCon10() {
		// setUp
		when(carta1.getValor()).thenReturn("AS");
		when(carta2.getValor()).thenReturn("DIEZ");
		when(carta3.getValor()).thenReturn("DIEZ");
		when(carta4.getValor()).thenReturn("DIEZ");
		when(carta5.getValor()).thenReturn("DIEZ");
		
		// exercise
		String esPoker = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);

		// verify
		assertEquals("Poker", esPoker);
	}

	@Test
	public void testEsPokerConJ() {
		// setUp
		when(carta1.getValor()).thenReturn("JACK");
		when(carta2.getValor()).thenReturn("JACK");
		when(carta3.getValor()).thenReturn("JACK");
		when(carta4.getValor()).thenReturn("JACK");
		when(carta5.getValor()).thenReturn("DIEZ");
		
		// exercise
		String esPoker = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);

		// verify
		assertEquals("Poker", esPoker);
	}

	@Test
	public void testNoEsNada() {
		// setUp valores
		when(carta1.getValor()).thenReturn("KING");
		when(carta2.getValor()).thenReturn("CINCO");
		when(carta3.getValor()).thenReturn("TRES");
		when(carta4.getValor()).thenReturn("KING");
		when(carta5.getValor()).thenReturn("DIEZ");
		// setUp palos
		when(carta1.
				getPalo()).thenReturn("CORAZON");
		when(carta2.getPalo()).thenReturn("TREBOL");
		when(carta3.getPalo()).thenReturn("DIAMANTE");
		when(carta4.getPalo()).thenReturn("PICA");
		when(carta5.getPalo()).thenReturn("TREBOL");
		
		// exercise
		String esPoker = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);

		// verify
		assertEquals("Nada", esPoker);
	}
	
	@Test
	public void esTrioConK() {
		// setUp
		when(carta1.getValor()).thenReturn("KING");
		when(carta2.getValor()).thenReturn("CINCO");
		when(carta3.getValor()).thenReturn("TRES");
		when(carta4.getValor()).thenReturn("KING");
		when(carta5.getValor()).thenReturn("KING");
		
		// exercise
		String esTrio = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);

		// verify
		assertEquals("Trio", esTrio);
	}
	
	@Test
	public void esColorConTrebol() {
		// setUp
		when(carta1.getPalo()).thenReturn("TREBOL");
		when(carta2.getPalo()).thenReturn("TREBOL");
		when(carta3.getPalo()).thenReturn("TREBOL");
		when(carta4.getPalo()).thenReturn("TREBOL");
		when(carta5.getPalo()).thenReturn("TREBOL");
		
		// exercise
		String esColor = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
		
		// verify
		assertEquals("Color", esColor);
	}

}
