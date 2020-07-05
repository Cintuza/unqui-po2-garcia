package ar.edu.unq.po2.tp8.poker;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.junit.jupiter.api.*;

class PokerStatusTest {
	
	private PokerStatus pokerStatus;
	
	private Jugada jugada1;
	private Jugada jugada2;
	
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus();

		jugada1 = mock(Jugada.class);
		jugada2 = mock(Jugada.class);
		
	}

	@Test
	public void testEsPokerCon8() {
		// setUp
		String[] valores = {"OCHO", "CINCO", "OCHO", "OCHO", "OCHO"};
		when(jugada1.getValores()).thenReturn(valores);
		String[] palos = {"CORAZON", "TREBOL", "DIAMANTE", "PICA", "TREBOL"};
		when(jugada1.getPalos()).thenReturn(palos);
		
		// exercise
		String esPoker = pokerStatus.verificarJugada(jugada1);
		
		// verify
		assertEquals("Poker", esPoker);
	}

	@Test
	public void testEsPokerCon10() {
		// setUp
		String[] valores = {"AS", "DIEZ", "DIEZ", "DIEZ", "DIEZ"};
		when(jugada1.getValores()).thenReturn(valores);
		String[] palos = {"CORAZON", "TREBOL", "DIAMANTE", "PICA", "TREBOL"};
		when(jugada1.getPalos()).thenReturn(palos);
		
		// exercise
		String esPoker = pokerStatus.verificarJugada(jugada1);

		// verify
		assertEquals("Poker", esPoker);
	}

	@Test
	public void testEsPokerConJ() {
		// setUp
		String[] valores = {"JACK", "JACK", "JACK", "JACK", "DIEZ"};
		when(jugada1.getValores()).thenReturn(valores);
		String[] palos = {"CORAZON", "TREBOL", "DIAMANTE", "PICA", "TREBOL"};
		when(jugada1.getPalos()).thenReturn(palos);
		
		// exercise
		String esPoker = pokerStatus.verificarJugada(jugada1);

		// verify
		assertEquals("Poker", esPoker);
	}

	@Test
	public void testNoEsNada() {
		// setUp
		String[] valores = {"KING", "CINCO", "TRES", "KING", "DIEZ"};
		when(jugada1.getValores()).thenReturn(valores);
		String[] palos = {"CORAZON", "TREBOL", "DIAMANTE", "PICA", "TREBOL"};
		when(jugada1.getPalos()).thenReturn(palos);
		
		// exercise
		String esPoker = pokerStatus.verificarJugada(jugada1);

		// verify
		assertEquals("Nada", esPoker);
	}
	
	@Test
	public void esTrioConK() {
		// setUp
		String[] valores = {"KING", "CINCO", "TRES", "KING", "KING"};
		when(jugada1.getValores()).thenReturn(valores);
		String[] palos = {"CORAZON", "TREBOL", "DIAMANTE", "PICA", "TREBOL"};
		when(jugada1.getPalos()).thenReturn(palos);
		
		// exercise
		String esTrio = pokerStatus.verificarJugada(jugada1);

		// verify
		assertEquals("Trio", esTrio);
	}
	
	@Test
	public void esColorConTrebol() {
		// setUp
		String[] valores = {"KING", "CINCO", "TRES", "KING", "DIEZ"};
		when(jugada1.getValores()).thenReturn(valores);
		String[] palos = {"TREBOL", "TREBOL", "TREBOL", "TREBOL", "TREBOL"};
		when(jugada1.getPalos()).thenReturn(palos);
		
		// exercise
		String esColor = pokerStatus.verificarJugada(jugada1);
		
		// verify
		assertEquals("Color", esColor);
	}

	@Test
	public void ganaLaJugadaPokerContraColor() {
		// setUp
		String[] valores1 = {"KING", "KING", "TRES", "KING", "KING"};
		when(jugada1.getValores()).thenReturn(valores1);
		String[] palos1 = {"TREBOL", "TREBOL", "TREBOL", "TREBOL", "TREBOL"};
		when(jugada1.getPalos()).thenReturn(palos1);
		
		// setUp
		String[] valores2 = {"KING", "CINCO", "TRES", "AS", "DIEZ"};
		when(jugada2.getValores()).thenReturn(valores2);
		String[] palos2 = {"TREBOL", "TREBOL", "TREBOL", "TREBOL", "TREBOL"};
		when(jugada2.getPalos()).thenReturn(palos2);
		
		assertEquals(jugada1, pokerStatus.verificar(jugada1, jugada2));
	}

	@Test
	public void ganaLaJugadaPokerContraTrio() {
		// setUp
		String[] valores1 = {"KING", "KING", "TRES", "KING", "KING"};
		when(jugada1.getValores()).thenReturn(valores1);
		String[] palos1 = {"TREBOL", "DIAMANTE", "TREBOL", "PICA", "TREBOL"};
		when(jugada1.getPalos()).thenReturn(palos1);
		
		// setUp
		String[] valores2 = {"CINCO", "CINCO", "TRES", "CINCO", "DIEZ"};
		when(jugada2.getValores()).thenReturn(valores2);
		String[] palos2 = {"TREBOL", "TREBOL", "DIAMANTE", "TREBOL", "PICA"};
		when(jugada2.getPalos()).thenReturn(palos2);
		
		assertEquals(jugada1, pokerStatus.verificar(jugada1, jugada2));
	}

	@Test
	public void ganaLaJugadaColorContraTrio() {
		// setUp
		String[] valores1 = {"KING", "CINCO", "TRES", "KING", "KING"};
		when(jugada1.getValores()).thenReturn(valores1);
		String[] palos1 = {"TREBOL", "DIAMANTE", "PICA", "TREBOL", "TREBOL"};
		when(jugada1.getPalos()).thenReturn(palos1);
		
		// setUp
		String[] valores2 = {"KING", "CINCO", "TRES", "AS", "DIEZ"};
		when(jugada2.getValores()).thenReturn(valores2);
		String[] palos2 = {"TREBOL", "TREBOL", "TREBOL", "TREBOL", "TREBOL"};
		when(jugada2.getPalos()).thenReturn(palos2);
		
		assertEquals(jugada2, pokerStatus.verificar(jugada1, jugada2));
	}

	@Test
	public void anteEmpateDePokerGanaLaJugadaConAS() {
		// setUp
		String[] valores1 = {"KING", "CINCO", "KING", "KING", "KING"};
		when(jugada1.getValores()).thenReturn(valores1);
		Integer[] valoresNumericos1 = {13, 5, 13, 13, 13};
		when(jugada1.getValoresNumericos()).thenReturn(valoresNumericos1);
		String[] palos1 = {"TREBOL", "DIAMANTE", "PICA", "TREBOL", "TREBOL"};
		when(jugada1.getPalos()).thenReturn(palos1);
		
		// setUp
		String[] valores2 = {"AS", "AS", "AS", "AS", "DIEZ"};
		when(jugada2.getValores()).thenReturn(valores2);
		Integer[] valoresNumericos2 = {1, 1, 1, 1, 10};
		when(jugada2.getValoresNumericos()).thenReturn(valoresNumericos2);
		String[] palos2 = {"TREBOL", "DIAMANTE", "TREBOL", "PICA", "TREBOL"};
		when(jugada2.getPalos()).thenReturn(palos2);
		
		assertEquals(jugada2, pokerStatus.verificar(jugada2, jugada1));
	}

	@Test
	public void anteEmpateDeColorGanaLaJugadaConMayorPuntajeDeCartas() {
		// setUp
		String[] valores1 = {"KING", "CINCO", "KING", "TRES", "KING"};
		when(jugada1.getValores()).thenReturn(valores1);
		Integer[] valoresNumericos1 = {13, 5, 13, 3, 13};
		when(jugada1.getValoresNumericos()).thenReturn(valoresNumericos1);
		String[] palos1 = {"DIAMANTE", "DIAMANTE", "DIAMANTE", "DIAMANTE", "DIAMANTE"};
		when(jugada1.getPalos()).thenReturn(palos1);
		
		// setUp
		String[] valores2 = {"AS", "DOS", "AS", "CUATRO", "DIEZ"};
		when(jugada2.getValores()).thenReturn(valores2);
		Integer[] valoresNumericos2 = {1, 2, 1, 4, 10};
		when(jugada2.getValoresNumericos()).thenReturn(valoresNumericos2);
		String[] palos2 = {"TREBOL", "TREBOL", "TREBOL", "TREBOL", "TREBOL"};
		when(jugada2.getPalos()).thenReturn(palos2);
		
		assertEquals(jugada1, pokerStatus.verificar(jugada2, jugada1));
	}
	
	
	
}
