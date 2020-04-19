package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numbers;

	// Crea una lista de tipo Integer vacia
	public Counter() {
		numbers = new ArrayList<Integer>();
	}

	private ArrayList<Integer> getNumbers() {
		return numbers;
	}
	
	// Agrega un numero a la lista
	public void addNumber(Integer number) {
		this.getNumbers().add(number);
	}
	
	/**
	 *  Devuelve la cantidad de numeros pares que posee la lista
	 */
	public int getEvenOccurrences() {
		int evenOccurrences = 0;
		for (int i=0; i < this.getNumbers().size(); i++) {
			Integer number = this.getNumbers().get(i);
			if (isEven(number)) {
				evenOccurrences ++;
			}
		}
		return evenOccurrences;
	}

	/**
	 *  Devuelve la cantidad de numeros impares que posee la lista
	 */
	public int getOddOccurrences() {
		int oddOccurrences = 0;
		for (int i=0; i < this.getNumbers().size(); i++) {
			Integer number = this.getNumbers().get(i);
			if (!(isEven(number))) {
				oddOccurrences ++;
			}
		}
		return oddOccurrences;
	}

	/**
	 *  Devuelve true si el numero number es par; devuelve false si es impar
	 */
	private boolean isEven(Integer number) {
		boolean isEven = true;
		if (number.intValue() % 2 == 1) {
			isEven = false;
		}
		return isEven;
	}

	/**
	 *Devuelve la cantidad de multiplos del numero otherNumber que contiene la lista
	 */
	public int getMultiplesOfAmount(int otherNumber) {
		int multiplesOfAmount = 0;
		for (int i=0; i < this.getNumbers().size(); i++) {
			Integer number = this.getNumbers().get(i);
			if (isMultipleOf(number, otherNumber)) {
				multiplesOfAmount ++;
			}
		}
		return multiplesOfAmount;
	}

	/**
	 * Chequea si un numero es multiplo de otro
	 * @param number posible multiplo, de tipo Integer
	 * @param otherNumber el divisor
	 * @return {@code true} si {@code number} es multiplo de {@code otherNumber}
	 */
	private boolean isMultipleOf(Integer number, int otherNumber) {
		boolean isMultiple = false;
		if (number.intValue() % otherNumber == 0) {
			isMultiple = true;
		}
		return isMultiple;
	}

}
