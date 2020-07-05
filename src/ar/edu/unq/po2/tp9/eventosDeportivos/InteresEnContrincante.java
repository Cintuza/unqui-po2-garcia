package ar.edu.unq.po2.tp9.eventosDeportivos;

import java.util.*;

public class InteresEnContrincante extends Interes {
	
	private List<String> contrincantesDeInteres;

	/**
	 * Crea una instancia InteresEnContrincante con una lista vacia de contrincantes 
	 * de interes. 
	 * A su vez, se agrega a si mismo a la lista de intereses de la aplicacion pasada 
	 * como parametro.
	 * @param aplicacionMovil Aplicacion a la que corresponde este interes
	 */
	public InteresEnContrincante(AplicacionMovil aplicacionMovil) {
		super(aplicacionMovil);
		this.contrincantesDeInteres = new ArrayList<String>();
	}

	/**
	 * Devuelve true si alguno de los contrincantes del partido se encuentra entre 
	 * los contrincantes de interes
	 */
	@Override
	public Boolean esDeInteres(Partido partido) {
		Boolean esDeInteres = false;
		for (String contrincante : contrincantesDeInteres) {
			esDeInteres = esDeInteres || partido.jugoContrincante(contrincante);
		}
		return esDeInteres;
	}
	
	/**
	 * Agrega contrincante a la lista de contrincantes de interes
	 * @param contrincante Contrincante de interes en String
	 */
	public void agregarContrincante(String contrincante) {
		contrincantesDeInteres.add(contrincante);
	}

	/**
	 * Elimiina contrincante de la lista de contrincantes de interes
	 * @param contrincante Contrincante a eliminar en String
	 */
	public void eliminarContrincante(String contrincante) {
		contrincantesDeInteres.remove(contrincante);
	}

}
