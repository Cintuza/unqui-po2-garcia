package ar.edu.unq.po2.tp9.eventosDeportivos;

import java.util.*;

public class InteresEnContrincante extends Interes {
	
	private List<String> contrincantesDeInteres;

	public InteresEnContrincante(AplicacionMovil aplicacionMovil, Servidor servidor) {
		super(aplicacionMovil, servidor);
		this.contrincantesDeInteres = new ArrayList<String>();
	}

	@Override
	public Boolean esDeInteres(Partido partido) {
		Boolean esDeInteres = false;
		for (String contrincante : contrincantesDeInteres) {
			esDeInteres = esDeInteres || partido.jugoContrincante(contrincante);
		}
		return esDeInteres;
	}
	
	public void agregarContrincante(String contrincante) {
		contrincantesDeInteres.add(contrincante);
	}
	
	public void eliminarContrincante(String contrincante) {
		contrincantesDeInteres.remove(contrincante);
	}

}
