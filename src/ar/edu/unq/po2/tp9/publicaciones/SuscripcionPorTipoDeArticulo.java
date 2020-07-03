package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class SuscripcionPorTipoDeArticulo implements Suscripcion {
	
	private Investigadora investigadoraSuscripta;
	private List<String> tiposDeArticulosDeInteres;
	private SistemaDePublicaciones sistema;
	
	public SuscripcionPorTipoDeArticulo(Investigadora investigadoraSuscripta, List<String> tiposDeArticulosDeInteres,
			SistemaDePublicaciones sistema) {
		this.investigadoraSuscripta = investigadoraSuscripta;
		this.tiposDeArticulosDeInteres = tiposDeArticulosDeInteres;
		this.sistema = sistema;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		return tiposDeArticulosDeInteres.contains(articulo.getTipoDeArticulo());
	}

	@Override
	public void observarSistema(SistemaDePublicaciones sistema) {
		sistema.agregarSuscripcion(this);
	}

	@Override
	public void updateInvestigadoras(Articulo articulo) {
		if (esDeInteres(articulo)) {
			investigadoraSuscripta.updateInvestigadora(articulo);
		}
	}
	
	public void agregarTipoDeArticuloDeInteres(String tipoDeArticulo) {
		tiposDeArticulosDeInteres.add(tipoDeArticulo);
	}
	

}
