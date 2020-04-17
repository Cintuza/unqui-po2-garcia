package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	
	private Counter counter;
	
	/**
	 * Crea un escenario de test basico, que consiste en un contador con 10 enteros
	 * 
	 * @throws Exception
	 */

	@BeforeEach
	public void setUp() throws Exception {
		
		//Se crea el contador
		counter = new Counter();
		
		//Se agregan los numeros. 1 par y 9 impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	/**
	 * Verifica la cantidad de pares
	 */
	
	@Test
	public void testEvenNumbers() {
		//Getting the even ocurrences
		int amount = counter.getEvenOccurrences();
		
		//I check the amount is the expected one
		assertEquals(1, amount);
	}

	@Test
	public void testOddNumbers() {
		//Getting the odd occurrences
		int amount = counter.getOddOccurrences();
		
		//I check the amount is the expected one
		assertEquals(9, amount);
	}
	
	@Test
	public void testMultiplesOfOcurrences() {
		// Obtiene la cantidad de multiplos de 3 que contiene la lista
		int amount = counter.getMultiplesOfOcurrences(3);
		
		// Chequea si la cantidad es la correcta
		assertEquals(2, amount);
	}

}
