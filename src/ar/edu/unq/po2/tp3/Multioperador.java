package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> numbers;

	// Crea la clase Multioperador, lista de tipo Integer vacia
	public Multioperador() {
		numbers = new ArrayList<Integer>();
	}
	
	// Agrega un numero a la lista
	public void addNumber(Integer number) {
		this.getNumbers().add(number);
	}

	// Devuelve la lista de numeros del Multiplicador
	private ArrayList<Integer> getNumbers() {
		return numbers;
	}
	
	/**
	 *  Devuelve un numero int resultante de la suma de todos los numeros de la lista
	 */
	public int sumOfAll() {
		int sumOfAll = 0;
		for (int i = 0; i < this.getNumbers().size(); i++) {
			Integer number = this.getNumbers().get(i);
			sumOfAll += number;
		}
		return sumOfAll;
	}

	/**
	 *  Devuelve un numero de tipo int resultante de la resta de todos los numeros de la lista
	 *  Calcula la resta convirtiendo la suma en negativo
	 */
	public int substractOfAll() {
		int suma = this.sumOfAll();
		return -suma;
	}

	/**
	 * Devuelve un numero int resultado de multiplicar entre si todos los numeros de la lista
	 * Ej. lista 1, 2, 3, 4 devuelve 24
	 */
	public int multiplicationOfAll() {
		int multiplicationOfAll = 0;
		for (int i = 0; i < this.getNumbers().size(); i++) {
			Integer number = this.getNumbers().get(i);
			multiplicationOfAll = multiplicationOfAll * number;
		}
		return multiplicationOfAll;
	}
	

}
