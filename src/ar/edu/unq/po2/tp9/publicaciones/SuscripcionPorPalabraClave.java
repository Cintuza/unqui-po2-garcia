package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class SuscripcionPorPalabraClave implements Suscripcion {
	
	private Investigadora investigadoraSuscripta;
	private List<String> palabrasClaveDeInteres;
	private SistemaDePublicaciones sistema;

	public SuscripcionPorPalabraClave(Investigadora investigadoraSuscripta, List<String> palabrasClaveDeInteres,
			SistemaDePublicaciones sistema) {
		this.investigadoraSuscripta = investigadoraSuscripta;
		this.palabrasClaveDeInteres = palabrasClaveDeInteres;
		this.sistema = sistema;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		Boolean tienePalabraClave = false;
		for (String palabraClave : palabrasClaveDeInteres) {
			tienePalabraClave = tienePalabraClave || articulo.tienePalabraClave(palabraClave); 
		}
		return tienePalabraClave;
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
	
	public void agregarPalabraClaveDeInteres(String palabraClave) {
		palabrasClaveDeInteres.add(palabraClave);
	}

}
