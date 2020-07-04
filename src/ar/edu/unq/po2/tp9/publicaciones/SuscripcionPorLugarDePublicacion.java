package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class SuscripcionPorLugarDePublicacion extends Suscripcion {
	
	private List<String> lugaresDePublicacionDeInteres;

	public SuscripcionPorLugarDePublicacion(Investigadora investigadoraSuscripta,
			List<String> lugaresDePublicacionDeInteres, SistemaDePublicaciones sistema) {
		super(investigadoraSuscripta, sistema);
		this.lugaresDePublicacionDeInteres = lugaresDePublicacionDeInteres;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		return lugaresDePublicacionDeInteres.contains(articulo.getLugarDePublicacion());
	}
	
	public void agregarLugarDePublicacionDeInteres(String lugarDePublicacion) {
		lugaresDePublicacionDeInteres.add(lugarDePublicacion);
	}
	
	public void eliminarLugarDePublicacionDeInteres(String lugarDePublicacion) {
		lugaresDePublicacionDeInteres.remove(lugarDePublicacion);
	}

}
