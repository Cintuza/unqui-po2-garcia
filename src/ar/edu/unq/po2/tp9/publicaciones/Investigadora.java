package ar.edu.unq.po2.tp9.publicaciones;

import java.util.*;

public class Investigadora {
	
	private String nombre;
	private List<Suscripcion> suscripciones;
	
	public Investigadora(String nombre) {
		this.nombre = nombre;
		suscripciones = new ArrayList<Suscripcion>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void updateInvestigadora(Articulo articulo) {
		avisarLlegadaArticulo(articulo);
	}
	
	public String avisarLlegadaArticulo(Articulo articulo) {
		String titulo = articulo.getTitulo().toString();
		return "Esta disponible el siguiente articulo de su interes: " + titulo;
	}
	
	public void agregarSuscripcion(Suscripcion suscripcion) {
		suscripciones.add(suscripcion);
	}
	
	public void eliminarSuscripcion(Suscripcion suscripcion) {
		suscripciones.remove(suscripcion);
	}
	
}
