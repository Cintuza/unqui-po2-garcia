package ar.edu.unq.po2.tp8.poker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class PokerStatusTest {
	
	private PokerStatus pokerStatus;
	
	private Carta ochoC;
	private Carta cincoT;
	private Carta ochoD;
	private Carta ochoP;
	private Carta ochoT;
	private Carta asC;
	private Carta diezD;
	private Carta diezC;
	private Carta diezP;
	private Carta diezT;
	private Carta jackP;
	private Carta jackC;
	private Carta jackD;
	private Carta jackT;
	private Carta kingC;
	private Carta kingP;
	private Carta kingT;
	private Carta asT;
	private Carta tresT;
	private Carta tresD;
	
	
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus();
		
		ochoC = new Carta(ValorCartas.OCHO, PaloCartas.CORAZON);
		cincoT = new Carta(ValorCartas.CINCO, PaloCartas.TREBOL);
		ochoD = new Carta(ValorCartas.OCHO, PaloCartas.DIAMANTE);
		ochoP = new Carta(ValorCartas.OCHO, PaloCartas.PICA);
		ochoT = new Carta(ValorCartas.OCHO, PaloCartas.TREBOL);
		asC = new Carta(ValorCartas.AS, PaloCartas.CORAZON);
		diezD = new Carta(ValorCartas.DIEZ, PaloCartas.DIAMANTE);
		diezC = new Carta(ValorCartas.DIEZ, PaloCartas.CORAZON);
		diezP = new Carta(ValorCartas.DIEZ, PaloCartas.PICA);
		diezT = new Carta(ValorCartas.DIEZ, PaloCartas.TREBOL);
		jackP = new Carta(ValorCartas.JACK, PaloCartas.PICA);
		jackC = new Carta(ValorCartas.JACK, PaloCartas.CORAZON);
		jackD = new Carta(ValorCartas.JACK, PaloCartas.DIAMANTE);
		jackT = new Carta(ValorCartas.JACK, PaloCartas.TREBOL);
		kingC = new Carta(ValorCartas.KING, PaloCartas.CORAZON);
		kingP = new Carta(ValorCartas.KING, PaloCartas.PICA);
		kingT = new Carta(ValorCartas.KING, PaloCartas.TREBOL);
		asT = new Carta(ValorCartas.AS, PaloCartas.TREBOL);
		tresT = new Carta(ValorCartas.TRES, PaloCartas.TREBOL);
		tresD = new Carta(ValorCartas.TRES, PaloCartas.DIAMANTE);
	}

	@Test
	public void testEsPokerCon8() {
		// exercise
		String esPoker = pokerStatus.verificar(ochoC, cincoT, ochoD, ochoP, ochoT);
		
		// verify
		assertEquals("Poker", esPoker);
	}

	@Test
	public void testEsPokerCon10() {
		// exercise
		String esPoker = pokerStatus.verificar(asC, diezD, diezC, diezP, diezT);

		// verify
		assertEquals("Poker", esPoker);
	}

	@Test
	public void testEsPokerConJ() {
		// exercise
		String esPoker = pokerStatus.verificar(jackC, jackT, jackD, jackP, diezT);

		// verify
		assertEquals("Poker", esPoker);
	}

	@Test
	public void testNoEsNada() {
		// exercise
		String esPoker = pokerStatus.verificar(kingC, cincoT, tresD, kingP, diezT);

		// verify
		assertEquals("Nada", esPoker);
	}
	
	@Test
	public void esTrioConK() {
		// exercise
		String esTrio = pokerStatus.verificar(kingC, cincoT, tresD, kingP, kingT);

		// verify
		assertEquals("Trio", esTrio);
	}
	
	@Test
	public void esColorConTrebol() {
		// exercise
		String esColor = pokerStatus.verificar(asT, cincoT, tresT, diezT, kingT);
		
		// verify
		assertEquals("Color", esColor);
	}

}
