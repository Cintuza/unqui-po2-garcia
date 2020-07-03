package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class SuscripcionPorFiliacion implements Suscripcion {
	
	private Investigadora investigadoraSuscripta;
	private List<String> institucionesDeInteres;
	private SistemaDePublicaciones sistema;

	public SuscripcionPorFiliacion(Investigadora investigadoraSuscripta, List<String> institucionesDeInteres,
			SistemaDePublicaciones sistema) {
		this.investigadoraSuscripta = investigadoraSuscripta;
		this.institucionesDeInteres = institucionesDeInteres;
		this.sistema = sistema;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		Boolean tieneFiliacion = false;
		for (String institucion : institucionesDeInteres) {
			tieneFiliacion = tieneFiliacion || articulo.tieneAutoraPertenecienteA(institucion);
		}
		return tieneFiliacion;
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
	
	public void agregarFiliacionDeInteres(String institucion) {
		institucionesDeInteres.add(institucion);
	}

}
