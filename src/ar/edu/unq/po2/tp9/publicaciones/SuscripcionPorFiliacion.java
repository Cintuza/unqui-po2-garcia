package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class SuscripcionPorFiliacion extends Suscripcion {
	
	private List<String> institucionesDeInteres;

	public SuscripcionPorFiliacion(Investigadora investigadoraSuscripta, List<String> institucionesDeInteres,
			SistemaDePublicaciones sistema) {
		super(investigadoraSuscripta, sistema);
		this.institucionesDeInteres = institucionesDeInteres;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		Boolean tieneFiliacion = false;
		for (String institucion : institucionesDeInteres) {
			tieneFiliacion = tieneFiliacion || articulo.tieneAutoraPertenecienteA(institucion);
		}
		return tieneFiliacion;
	}
	
	public void agregarFiliacionDeInteres(String institucion) {
		institucionesDeInteres.add(institucion);
	}
	
	public void eliminarFiliacionDeInteres(String institucion) {
		institucionesDeInteres.remove(institucion);
	}

}
