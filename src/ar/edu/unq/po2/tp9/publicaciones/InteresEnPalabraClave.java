package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class InteresEnPalabraClave extends Interes {
	
	private List<String> palabrasClaveDeInteres;

	public InteresEnPalabraClave(Investigadora investigadoraSuscripta, List<String> palabrasClaveDeInteres) {
		super(investigadoraSuscripta);
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
