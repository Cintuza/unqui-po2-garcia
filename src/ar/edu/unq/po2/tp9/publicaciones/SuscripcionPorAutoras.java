package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class SuscripcionPorAutoras extends Suscripcion {
	
	private List<String> autorasDeInteres;
	
	public SuscripcionPorAutoras(Investigadora investigadoraSuscripta, 
			List<String> autorasDeInteres, SistemaDePublicaciones sistema) {
		super(investigadoraSuscripta, sistema);
		this.autorasDeInteres = autorasDeInteres;
	}

	@Override
	public Boolean esDeInteres(Articulo articulo) {
		Boolean tieneAutora = false;
		for (String autora : autorasDeInteres) {
			tieneAutora = tieneAutora || articulo.fueEscritoPor(autora);
		}
		return tieneAutora;
	}
	
	public void agregarAutoraDeInteres(String autora) {
		autorasDeInteres.add(autora);
	}
	
	public void eliminarAutoraDeInteres(String autora) {
		autorasDeInteres.remove(autora);
	}

}
