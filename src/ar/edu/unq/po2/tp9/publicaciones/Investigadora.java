package ar.edu.unq.po2.tp9.publicaciones;

import java.util.*;

public class Investigadora {
	
	private String nombre;
	private List<Interes> intereses;
	
	public Investigadora(String nombre) {
		this.nombre = nombre;
		intereses = new ArrayList<Interes>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void agregarInteres(Interes interes) {
		intereses.add(interes);
	}
	
	public void eliminarInteres(Interes interes) {
		intereses.remove(interes);
	}
	
	public void suscribirseASistema(SistemaDePublicaciones sistema) {
		sistema.agregarInvestigadora(this);
	}
	
	public void desuscribirseDeSistema(SistemaDePublicaciones sistema) {
		sistema.eliminarInvestigadora(this);
	}
	
	public Boolean estaInteresadaEn(Articulo articulo) {
		Boolean esDeInteres = false;
		for (Interes interes : intereses) {
			esDeInteres = esDeInteres || interes.esDeInteres(articulo);
		}
		return esDeInteres;
	}
	
	public void updateInvestigadora(Articulo articulo) {
		avisarLlegadaArticulo(articulo);
	}
	
	public String avisarLlegadaArticulo(Articulo articulo) {
		String titulo = articulo.getTitulo().toString();
		return "Esta disponible el siguiente articulo de su interes: " + titulo;
	}
	
}
