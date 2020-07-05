package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class InteresEnFiliacion extends Interes {
	
	private List<String> institucionesDeInteres;

	public InteresEnFiliacion(Investigadora investigadoraSuscripta, List<String> institucionesDeInteres) {
		super(investigadoraSuscripta);
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
