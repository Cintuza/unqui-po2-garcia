package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class SuscripcionPorTipoDeArticulo extends Suscripcion {
	
	private List<String> tiposDeArticulosDeInteres;
	
	public SuscripcionPorTipoDeArticulo(Investigadora investigadoraSuscripta, List<String> tiposDeArticulosDeInteres,
			SistemaDePublicaciones sistema) {
		super(investigadoraSuscripta, sistema);
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
