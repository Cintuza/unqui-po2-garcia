package ar.edu.unq.po2.tp9.eventosDeportivos;

import java.util.*;

public class Servidor {
	
	private List<Partido> partidos;
	private List<Deporte> deportes;
	private List<AplicacionMovil> aplicacionesMoviles;
	
	public Servidor() {
		this.partidos = new ArrayList<Partido>();
		this.deportes = new ArrayList<Deporte>();
		this.aplicacionesMoviles = new ArrayList<AplicacionMovil>();
	}
	
	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
		notificarAplicaciones(partido);
	}

	public void subscribirseADeporte(Deporte deporte) {
		this.deportes.add(deporte);
		deporte.agregarServidor(this);
	}
	
	public void eliminarDeporte(Deporte deporte) {
		this.deportes.remove(deporte);
	}

	public void updateServidores(Partido partido) {
		agregarPartido(partido);
	}
	
	public void agregarAplicacionMovil(AplicacionMovil aplicacionMovil) {
		aplicacionesMoviles.add(aplicacionMovil);
	}
	
	private void notificarAplicaciones(Partido partido) {
		for (AplicacionMovil aplicacionMovil : aplicacionesMoviles) {
			if (aplicacionMovil.estaInteresadaEn(partido)) {
				aplicacionMovil.updateAplicacionMovil(partido);
			}
		}
		
	}
	

}
