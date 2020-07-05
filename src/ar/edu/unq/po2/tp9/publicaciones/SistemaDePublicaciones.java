package ar.edu.unq.po2.tp9.publicaciones;

import java.util.*;

public class SistemaDePublicaciones {

	private List<Articulo> articulos;
	private List<Investigadora> investigadoras;
	
	public SistemaDePublicaciones() {
		this.articulos = new ArrayList<Articulo>();
		this.investigadoras = new ArrayList<Investigadora>();
	}
	
	public void agregarArticulo(Articulo articulo) {
		articulos.add(articulo);
		notificarInvestigadoras(articulo);
	}
	
	public void agregarInvestigadora(Investigadora investigadora) {
		investigadoras.add(investigadora);
	}
	
	public void eliminarInvestigadora(Investigadora investigadora) {
		investigadoras.remove(investigadora);
	}
	
	private void notificarInvestigadoras(Articulo articulo) {
		for (Investigadora investigadora : investigadoras) {
			if (investigadora.estaInteresadaEn(articulo)) {
				investigadora.updateInvestigadora(articulo);
			}
		}
	}
}
