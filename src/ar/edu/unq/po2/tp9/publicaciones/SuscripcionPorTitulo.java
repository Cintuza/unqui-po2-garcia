package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class SuscripcionPorTitulo implements Suscripcion {
	
	private Investigadora investigadoraSuscripta;
	private List<String> titulosDeInteres;
	private SistemaDePublicaciones sistema;
	
	public SuscripcionPorTitulo(Investigadora investigadoraSuscripta, List<String> titulosDeInteres,
			SistemaDePublicaciones sistema) {
		this.investigadoraSuscripta = investigadoraSuscripta;
		this.titulosDeInteres = titulosDeInteres;
		this.sistema = sistema;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		return titulosDeInteres.contains(articulo.getTitulo());
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
	
	public void agregarTituloDeInteres(String titulo) {
		titulosDeInteres.add(titulo);
	}

}
