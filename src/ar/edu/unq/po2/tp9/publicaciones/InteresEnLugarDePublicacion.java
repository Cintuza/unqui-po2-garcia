package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class InteresEnLugarDePublicacion extends Interes {
	
	private List<String> lugaresDePublicacionDeInteres;

	public InteresEnLugarDePublicacion(Investigadora investigadoraSuscripta,
			List<String> lugaresDePublicacionDeInteres) {
		super(investigadoraSuscripta);
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
