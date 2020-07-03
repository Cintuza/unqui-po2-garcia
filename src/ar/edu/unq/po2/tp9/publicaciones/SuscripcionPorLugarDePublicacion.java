package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class SuscripcionPorLugarDePublicacion implements Suscripcion {
	
	private Investigadora investigadoraSuscripta;
	private List<String> lugaresDePublicacionDeInteres;
	private SistemaDePublicaciones sistema;

	public SuscripcionPorLugarDePublicacion(Investigadora investigadoraSuscripta,
			List<String> lugaresDePublicacionDeInteres, SistemaDePublicaciones sistema) {
		this.investigadoraSuscripta = investigadoraSuscripta;
		this.lugaresDePublicacionDeInteres = lugaresDePublicacionDeInteres;
		this.sistema = sistema;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		return lugaresDePublicacionDeInteres.contains(articulo.getLugarDePublicacion());
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
	
	public void agregarLugarDePublicacionDeInteres(String lugarDePublicacion) {
		lugaresDePublicacionDeInteres.add(lugarDePublicacion);
	}

}
