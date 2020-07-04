package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class SuscripcionPorPalabraClave extends Suscripcion {
	
	private List<String> palabrasClaveDeInteres;

	public SuscripcionPorPalabraClave(Investigadora investigadoraSuscripta, List<String> palabrasClaveDeInteres,
			SistemaDePublicaciones sistema) {
		super(investigadoraSuscripta, sistema);
		this.palabrasClaveDeInteres = palabrasClaveDeInteres;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		Boolean tienePalabraClave = false;
		for (String palabraClave : palabrasClaveDeInteres) {
			tienePalabraClave = tienePalabraClave || articulo.tienePalabraClave(palabraClave); 
		}
		return tienePalabraClave;
	}
	
	public void agregarPalabraClaveDeInteres(String palabraClave) {
		palabrasClaveDeInteres.add(palabraClave);
	}
	
	public void eliminarPalabraClaveDeInteres(String palabraClave) {
		palabrasClaveDeInteres.remove(palabraClave);
	}

}
