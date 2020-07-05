package ar.edu.unq.po2.tp9.eventosDeportivos;

import java.util.*;

public class Deporte {
	
	private String nombreDelDeporte;
	private List<Partido> partidos;
	private List<Servidor> servidores;

	/**
	 * Crea una instancia de deporte con: 
	 * - @param nombreDelDeporte en String
	 * - una lista vacia de partidos (del deporte que se iran agregando)
	 * - una lista vacia de servidores (que se iran agregando como observadores)
	 */
	public Deporte(String nombreDelDeporte) {
		this.nombreDelDeporte = nombreDelDeporte;
		this.partidos = new ArrayList<Partido>();
		this.servidores = new ArrayList<Servidor>();
	}

	/**
	 * Agrega al servidor a la lista de servidores/observers, cuando el servidor 
	 * se suscribe al deporte.
	 * @param servidor Servidor a suscribirse
	 */
	public void agregarServidor(Servidor servidor) {
		this.servidores.add(servidor);
	}

	/**
	 * Elimina al servidor de la lista de servidores/observers, cuando el servidor 
	 * se desuscribe del deporte.
	 * @param servidor Servidor a eliminar
	 */
	public void eliminarServidor(Servidor servidor) {
		this.servidores.remove(servidor);
	}
	
	/**
	 * Agrega un partido a la lista de partidos del deporte, y notifica a los 
	 * servidores suscriptos del mismo.
	 * @param partido Partido nuevo a agregar
	 */
	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
		notificarServidores(partido);
	}
	
	/**
	 * Le envia el mensaje a los servidores de que ha sido agregado un nuevo 
	 * partido de su interes. 
	 * Es llamado cuando se agrega un partido al deporte.
	 * @param partido
	 */
	private void notificarServidores(Partido partido) {
		for (Servidor servidor : servidores) {
			servidor.updateServidores(partido);
		}
	}
}
