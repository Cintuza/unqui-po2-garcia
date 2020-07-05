package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class InteresEnTipoDeArticulo extends Interes {
	
	private List<String> tiposDeArticulosDeInteres;
	
	public InteresEnTipoDeArticulo(Investigadora investigadoraSuscripta, List<String> tiposDeArticulosDeInteres) {
		super(investigadoraSuscripta);
		this.tiposDeArticulosDeInteres = tiposDeArticulosDeInteres;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		return tiposDeArticulosDeInteres.contains(articulo.getTipoDeArticulo());
	}
	
	public void agregarTipoDeArticuloDeInteres(String tipoDeArticulo) {
		tiposDeArticulosDeInteres.add(tipoDeArticulo);
	}
	
	public void eliminarTipoDeArticuloDeInteres(String tipoDeArticulo) {
		tiposDeArticulosDeInteres.remove(tipoDeArticulo);
	}
	

}
