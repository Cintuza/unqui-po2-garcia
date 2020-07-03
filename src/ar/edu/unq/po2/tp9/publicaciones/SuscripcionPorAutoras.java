package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class SuscripcionPorAutoras implements Suscripcion {
	
	private Investigadora investigadoraSuscripta;
	private List<String> autorasDeInteres;
	private SistemaDePublicaciones sistema;
	
	public SuscripcionPorAutoras(Investigadora investigadoraSuscripta, 
			List<String> autorasDeInteres, SistemaDePublicaciones sistema) {
		this.investigadoraSuscripta = investigadoraSuscripta;
		this.autorasDeInteres = autorasDeInteres;
		this.sistema = sistema;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		Boolean tieneAutora = false;
		for (String autora : autorasDeInteres) {
			tieneAutora = tieneAutora || articulo.fueEscritoPor(autora);
		}
		return tieneAutora;
	}

	@Override
	public void updateInvestigadoras(Articulo articulo) {
		if (esDeInteres(articulo)) {
			investigadoraSuscripta.updateInvestigadora(articulo);
		}
	}
	
	public void agregarAutoraDeInteres(String autora) {
		autorasDeInteres.add(autora);
	}

	@Override
	public void observarSistema(SistemaDePublicaciones sistema) {
		sistema.agregarSuscripcion(this);
	}

}
