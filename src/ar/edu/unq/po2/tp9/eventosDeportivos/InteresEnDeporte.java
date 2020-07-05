package ar.edu.unq.po2.tp9.eventosDeportivos;

import java.util.*;

public class InteresEnDeporte extends Interes {
	
	private List<String> deportesDeInteres;

	/**
	 * Crea una instancia InteresEnDeporte con una lista vacia de deportes de interes. 
	 * A su vez, se agrega a si mismo a la lista de intereses de la aplicacion pasada 
	 * como parametro.
	 * @param aplicacionMovil Aplicacion a la que corresponde este interes
	 */
	public InteresEnDeporte(AplicacionMovil aplicacionMovil) {
		super(aplicacionMovil);
		this.deportesDeInteres = new ArrayList<String>();
	}

	/**
	 * Devuelve true si el deporte del partido se encuentra entre los deportes 
	 * de interes
	 */
	@Override
	public Boolean esDeInteres(Partido partido) {
		String deporte = partido.getDeporte();
		return deportesDeInteres.contains(deporte);
	}
	
	/**
	 * Agrega un deporte a la lista de deportes de interes
	 * @param deporte Deporte de interes en String
	 */
	public void agregarDeporte(String deporte) {
		deportesDeInteres.add(deporte);
	}
	
	/**
	 * Elimina un deporte de la lista de deportes de interes
	 * @param deporte Deporte a eliminar en String
	 */
	public void eliminarDeporte(String deporte) {
		deportesDeInteres.remove(deporte);
	}

}
