package ar.edu.unq.po2.tp8.poker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class CartaTest {
	
	private Carta carta;
	
	@BeforeEach
	public void setUp() {
		carta = new Carta(ValorCartas.JACK, PaloCartas.PICA);
	}

	@Test
	public void testConstructorCarta() {
		// exercise
		String valor = carta.getValor();
		String palo = carta.getPalo();
		
		// verify
		assertEquals("JACK", valor);
		assertEquals("PICA", palo);
	}
	
	@Test 
	public void testEsMayorA() {
		// setUp
		Carta otraCarta = new Carta(ValorCartas.KING, PaloCartas.CORAZON);
		
		// exercice
		Boolean esMayor = otraCarta.esMayorA(carta);
		
		//verify
		assertTrue(esMayor);
	}

}
