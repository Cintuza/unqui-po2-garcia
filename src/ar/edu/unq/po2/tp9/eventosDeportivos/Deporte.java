package ar.edu.unq.po2.tp9.eventosDeportivos;

import java.util.*;

public class Deporte {
	
	private String nombreDelDeporte;
	private List<Partido> partidos;
	private List<Servidor> servidores;

	public Deporte(String nombreDelDeporte) {
		this.nombreDelDeporte = nombreDelDeporte;
		this.partidos = new ArrayList<Partido>();
		this.servidores = new ArrayList<Servidor>();
	}

	public void agregarServidor(Servidor servidor) {
		this.servidores.add(servidor);
	}
	
	public void eliminarServidor(Servidor servidor) {
		this.servidores.remove(servidor);
	}
	
	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
		notificarServidores(partido);
	}
	
	private void notificarServidores(Partido partido) {
		for (Servidor servidor : servidores) {
			servidor.updateServidores(partido);
		}
	}
}
