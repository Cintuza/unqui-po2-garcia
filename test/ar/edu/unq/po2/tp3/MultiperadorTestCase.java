package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiperadorTestCase {
	
	private Multioperador multioperador;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		// Se crea el multioperador vacio
		multioperador = new Multioperador();
		
		// Se agregan numeros al multioperador
		multioperador.addNumber(1);
		multioperador.addNumber(3);
		multioperador.addNumber(5);
		multioperador.addNumber(7);
		multioperador.addNumber(9);
		multioperador.addNumber(1);
		multioperador.addNumber(1);
		multioperador.addNumber(1);
		multioperador.addNumber(1);
		multioperador.addNumber(4);
	}

	@Test
	public void testSumOfAll() {
		// Obtengo la suma de todos los numeros de la lista
		int amount = multioperador.sumOfAll();
		
		// Corroboro que el resultado obtenido es correcto
		assertEquals(33, amount);
	}
	
	public void testSubstractOfAll() {
		// Obtengo la suma de todos los numeros de la lista
		int amount = multioperador.substractOfAll();
		
		// Corroboro que el resultado obtenido es correcto
		assertEquals(-33, amount);
	}
	
	public void testMultiplicationOfAll() {
		// Obtengo la multiplicacion de todos los numeros de la lista
		int amount = multioperador.multiplicationOfAll();
		
		// Corroboro que el resultado es el correcto
		assertEquals(3780, amount);
	}

}
