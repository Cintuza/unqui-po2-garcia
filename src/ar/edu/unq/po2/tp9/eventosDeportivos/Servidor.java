package ar.edu.unq.po2.tp9.eventosDeportivos;

import java.util.*;

public class Servidor {
	
	private List<Partido> partidos;
	private List<Deporte> deportes;
	private List<AplicacionMovil> aplicacionesMoviles;
	
	/**
	 * Crea una instancia de servidor con:
	 * - lista vacia de partidos (que se agregaran al server)
	 * - lista vacia de deportes (a los que se suscribira el server)
	 * - lista vacia de aplicaciones (que se suscribiran al server)
	 */
	public Servidor() {
		this.partidos = new ArrayList<Partido>();
		this.deportes = new ArrayList<Deporte>();
		this.aplicacionesMoviles = new ArrayList<AplicacionMovil>();
	}
	
	/**
	 * Agrega un partido a la lista de partidos del servidor y notifica a las 
	 * aplicaciones/observers. 
	 * Es llamado por el update cuando se agrega el partido de un deporte de interes.
	 * @param partido
	 */
	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
		notificarAplicaciones(partido);
	}

	/**
	 * Suscribe el servidor a un deporte de interes. 
	 * Hace que la clase deporte agregue al servidor como observer. 
	 * @param deporte Deporte observable por el servidor.
	 */
	public void subscribirseADeporte(Deporte deporte) {
		this.deportes.add(deporte);
		deporte.agregarServidor(this);
	}
	
	/**
	 * Elimina un deporte del servidor. 
	 * Hace que la clase deporte elimine al servidor como observer. 
	 * @param deporte Deporte a eliminar del servidor.
	 */
	public void eliminarDeporte(Deporte deporte) {
		this.deportes.remove(deporte);
		deporte.eliminarServidor(this);
	}

	/**
	 * Actualiza el servidor cuando un Deporte le avisa que se ha agregado 
	 * un nuevo partido. 
	 * Le indica al servidor que debe agregar el partido a su lista
	 * @param partido Partido nuevo a agregar
	 */
	public void updateServidores(Partido partido) {
		agregarPartido(partido);
	}
	
	/**
	 * Agrega una aplicacion movil a su lista de aplicaciones/observers cuando 
	 * una aplicacion se suscribe al mismo
	 * @param aplicacionMovil Aplicacion que se suscribe al servidor
	 */
	public void agregarAplicacionMovil(AplicacionMovil aplicacionMovil) {
		aplicacionesMoviles.add(aplicacionMovil);
	}
	
	/**
	 * Chequea a que aplicaciones suscriptas les interesa el partido nuevo y las 
	 * notifica.
	 * @param partido Partido agregado del cual se notifica a las aplicaciones
	 */
	private void notificarAplicaciones(Partido partido) {
		for (AplicacionMovil aplicacionMovil : aplicacionesMoviles) {
			if (aplicacionMovil.estaInteresadaEn(partido)) {
				aplicacionMovil.updateAplicacionMovil(partido);
			}
		}
		
	}
	

}
