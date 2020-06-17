package ar.edu.unq.po2.tp8.poker;

import java.util.*;
import java.util.stream.*;

public class PokerStatus {
	
	/**
	 *  Constructor de la clase PokerStatus
	 */
	public PokerStatus() {}

	/**
	 * 
	 * @return
	 */
	public String verificar(Carta carta0, Carta carta1, Carta carta2, Carta carta3, Carta carta4) {
		// Obtiene los valores de las cartas y los tranforma en lista
		String[] valoresDeCartas = {carta0.getValor(), carta1.getValor(), carta2.getValor(), carta3.getValor(), carta4.getValor()};
		List<String> listaDeValores = Arrays.asList(valoresDeCartas);
		
		// Obtiene los palos de las cartas y los transforma en set
		String[] palosDeCartas = {carta0.getPalo(), carta1.getPalo(), carta2.getPalo(), carta3.getPalo(), carta4.getPalo()};
		Set<String> listaDePalos = Stream.of(palosDeCartas).collect(Collectors.toSet());
		
		if (esPoker(listaDeValores)) {
			return "Poker";
		}
		
		if (esTrio(listaDeValores)) {
			return "Trio";
		}
		
		if (esColor(listaDePalos)) {
			return "Color";
		}
		
		return "Nada";
	}

	private Boolean esPoker(List<String> valoresDeCartas) {
		Boolean esPoker = false;
		
		for (String valor : valoresDeCartas) {
			esPoker = esPoker || (Collections.frequency(valoresDeCartas, valor) == 4);
		}
		return esPoker;
	}

	private Boolean esTrio(List<String> valoresDeCartas) {
		Boolean esTrio = false;
		
		for (String valor : valoresDeCartas) {
			esTrio = esTrio || (Collections.frequency(valoresDeCartas, valor) == 3);
		}
		return esTrio;
	}
	
	private boolean esColor(Set<String> palosDeCartas) {
		Boolean esColor = palosDeCartas.size() == 1;
		
		return esColor;
	}

	/*
	private String obtenerValor(String carta) {
		String valorDeCarta;
		if (carta.length() == 2) {
			valorDeCarta = carta.substring(0, 1);
		} else {
			valorDeCarta = carta.substring(0, 2);
		}
		return valorDeCarta;
	}
	
	private String obtenerPalo(String carta) {
		String paloDeCarta;
		if (carta.length() == 2) {
			paloDeCarta = carta.substring(1);
		} else {
			paloDeCarta = carta.substring(2);
		}
		return paloDeCarta;
	}
	*/
}
