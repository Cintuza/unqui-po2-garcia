package ar.edu.unq.po2.tp8.poker;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;

public class PokerStatus {
	
	/**
	 *  Constructor de la clase PokerStatus
	 */
	public PokerStatus() {}

	/**
	 * Verifica cual de las dos jugadas gana la partida
	 * @return la jugada ganadora
	 */
	public Jugada verificar(Jugada jugada1, Jugada jugada2) {
		String[] jugadas = {"Poker", "Color", "Trio"};
		
		if (esEmpate(jugada1, jugada2)) {
			return resolverEmpate(jugada1, jugada2);
		}
		else {
			return resolverJugadas(jugada1, jugada2);
		}
		
	}
	
	/**
	 * Verifica si la jugada es poker, color, trio o nada
	 * @param jugada Jugada a evaluar
	 * @return un string que indica si la jugada es poker, color, trio o nada 
	 */
	public String verificarJugada(Jugada jugada) {
		if (esPoker(jugada)) {
			return "Poker";
		}
		else if (esColor(jugada)) {
			return "Color";
		}
		else if (esTrio(jugada)) {
			return "Trio";
		}
		
		return "Nada";
	}

	/**
	 * Chequea si la jugada tiene poker
	 * @param jugada
	 * @return true si la jugada es poker
	 */
	private Boolean esPoker(Jugada jugada) {
		// Obtiene los valores de las cartas de una jugada y los tranforma en lista
		List<String> valoresDeCartas = Arrays.asList(jugada.getValores());
		Boolean esPoker = false;
		
		for (String valor : valoresDeCartas) {
			esPoker = esPoker || (Collections.frequency(valoresDeCartas, valor) == 4);
		}
		return esPoker;
	}

	/**
	 * Chequea si la jugada tiene trio
	 * @param jugada
	 * @return true si la jugada es trio
	 */
	private Boolean esTrio(Jugada jugada) {
		// Obtiene los valores de las cartas de una jugada y los tranforma en lista
		List<String> valoresDeCartas = Arrays.asList(jugada.getValores());
		Boolean esTrio = false;
		
		for (String valor : valoresDeCartas) {
			esTrio = esTrio || (Collections.frequency(valoresDeCartas, valor) == 3);
		}
		return esTrio;
	}

	/**
	 * Chequea si la jugada tiene color
	 * @param jugada
	 * @return true si la jugada es color
	 */
	private Boolean esColor(Jugada jugada) {
		// Obtiene los palos de las cartas de una jugada y los transforma en set
		Set<String> palosDeCartas = Stream.of(jugada.getPalos()).collect(Collectors.toSet());
		Boolean esColor = palosDeCartas.size() == 1;
		
		return esColor;
	}
	
	/**
	 * Resuelve cual de las dos jugadas ganan ante un no empate. 
	 * Asigna un valor numerico a cada jugada de acuerdo a su importancia y compara 
	 * con ese valor que jugada gana.
	 * @param jugada1
	 * @param jugada2
	 * @return la jugada ganadora
	 */
	private Jugada resolverJugadas(Jugada jugada1, Jugada jugada2) {
		Map<String, Integer> jugadas = new HashMap<String, Integer>();
		jugadas.put("Poker", 1);
		jugadas.put("Color", 2);
		jugadas.put("Trio", 3);
		jugadas.put("Nada", 4);

		String resultadoJugada1 = verificarJugada(jugada1);
		String resultadoJugada2 = verificarJugada(jugada2);

		Integer posicionJugada1 = jugadas.get(resultadoJugada1);
		Integer posicionJugada2 = jugadas.get(resultadoJugada2);
		
		if (posicionJugada1 < posicionJugada2) {
			return jugada1;
		}
		else {
			return jugada2;
		}
	}
	
	/**
	 * Chequea si las jugadas estan empatadas.
	 * @param jugada1
	 * @param jugada2
	 * @return true si hay empate ante las jugadas
	 */
	public Boolean esEmpate(Jugada jugada1, Jugada jugada2) {
		String resultadoJugada1 = verificarJugada(jugada1);
		String resultadoJugada2 = verificarJugada(jugada2);
		
		return (resultadoJugada1 == resultadoJugada2);
	}
	
	/**
	 * Resuelve que jugada gana cuando hay un empate. 
	 * Si las jugadas empatan poker o trio, compara el valor de poker/trio y gana la 
	 * partida con valor mayor.
	 * Si las jugadas empatan con color o nada, suma los valores de todas las cartas 
	 * y gana la jugada con sumatoria mayor.
	 * @param jugada1
	 * @param jugada2
	 * @return la jugada ganadora de acuerdo a los valores precedentes
	 */
	public Jugada resolverEmpate(Jugada jugada1, Jugada jugada2) {
		List<Integer> valoresDeCartas1 = Arrays.asList(jugada1.getValoresNumericos());
		List<Integer> valoresDeCartas2 = Arrays.asList(jugada2.getValoresNumericos());
		
		if (verificarJugada(jugada1) == "Poker" || verificarJugada(jugada1) == "Trio") {
			Integer valorCartaPokerJugada1 = valoresDeCartas1.stream()
		          .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
		          .entrySet()
		          .stream()
		          .max(Comparator.comparing(Entry::getValue))
		          .get()
		          .getKey();
			
			Integer valorCartaPokerJugada2 = valoresDeCartas2.stream()
		          .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
		          .entrySet()
		          .stream()
		          .max(Comparator.comparing(Entry::getValue))
		          .get()
		          .getKey();
			if (valorCartaPokerJugada2 == 1) {
				return jugada2;
			}
			else if (valorCartaPokerJugada1 > valorCartaPokerJugada2 || valorCartaPokerJugada1 == 1) {
				return jugada1;
			} else {
				return jugada2;
			}
		}
		else {
			int sumaValoresJugada1 = valoresDeCartas1.stream().mapToInt(Integer::intValue).sum();
			int sumaValoresJugada2 = valoresDeCartas2.stream().mapToInt(Integer::intValue).sum();
			
			if (sumaValoresJugada1 > sumaValoresJugada2) {
				return jugada1;
			} else {
				return jugada2;
			}
		}
	}
	
	
}
