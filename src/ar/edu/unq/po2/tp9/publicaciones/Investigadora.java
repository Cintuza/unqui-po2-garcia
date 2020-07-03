package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class Investigadora {
	
	private String nombre;
	private String filiacion;
	
	public Investigadora(String nombre, String filiacion) {
		this.nombre = nombre;
		this.filiacion = filiacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFiliacion() {
		return filiacion;
	}
	
	public void updateInvestigadora(Articulo articulo) {
		avisarLlegadaArticulo(articulo);
	}
	
	public String avisarLlegadaArticulo(Articulo articulo) {
		String titulo = articulo.getTitulo().toString();
		return "Esta disponible el siguiente articulo de su interes: " + titulo;
	}
	
}
