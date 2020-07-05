package ar.edu.unq.po2.tp9.eventosDeportivos;

import java.util.*;

public class Partido {
	
	private String deporte;
	private List<String> contrincantes;
	private String resultado;
	
	public Partido(String deporte, List<String> contrincantes, String resultado) {
		this.deporte = deporte;
		this.contrincantes = contrincantes;
		this.resultado = resultado;
	}

	/**
	 * Devuelve el deporte al que corresponde el partido en string
	 */
	public String getDeporte() {
		return deporte;
	}
	
	/**
	 * Corrobora si un contrincante participo del partido.
	 * @param contrincante Contrincante en String a corroborar
	 * @return true si el contrincante se encuentra en la lista de contrincantes del partido
	 */
	public Boolean jugoContrincante(String contrincante) {
		return contrincantes.contains(contrincante);
	}

}
