package ar.edu.unq.po2.tp9.eventosDeportivos;

import java.util.*;

public class AplicacionMovil {
	
	private List<Interes> intereses;
	
	/**
	 * Crea una aplicacion movil con una lista vacia de intereses
	 */
	public AplicacionMovil() {
		this.intereses = new ArrayList<Interes>();
	}
	
	/**
	 * Suscribe la aplicacion al servidor de interes
	 * @param servidor Instancia clase servidor a la que se suscribe la aplicacion
	 */
	public void suscribirseAServidor(Servidor servidor) {
		servidor.agregarAplicacionMovil(this);
	}
	
	/**
	 * Agrega interes a la lista de intereses; es llamado por la clase Interes 
	 * cuando se instancia.
	 * @param interes Instancia clase interes a agregarse
	 */
	public void agregarInteres(Interes interes) {
		intereses.add(interes);
	}

	/**
	 * Elimina interes de la lista de intereses.
	 * @param interes Instancia clase interes a eliminarse
	 */
	public void eliminarInteres(Interes interes) {
		intereses.remove(interes);
	}
	
	/**
	 * Recorre la lista de intereses de la aplicacion y devuelve true si algun interes 
	 * dice que el partido es de interes.
	 * @param partido Partido a evaluar si es de interes 
	 * @return True Si el partido es de interes
	 */
	public Boolean estaInteresadaEn(Partido partido) {
		Boolean estaInteresada = false;
		for (Interes interes : intereses) {
			estaInteresada = estaInteresada || interes.esDeInteres(partido);
		}
		return estaInteresada;
	}

	/**
	 * Avisa sobre la llegada al servidor de un partido de interes. 
	 * Es llamado por alguno de los servidores a los que esta suscripta la aplicacion 
	 * despues de chequear que el partido es de interes para la misma
	 * @param partido
	 */
	public void updateAplicacionMovil(Partido partido) {
		
	}

}
