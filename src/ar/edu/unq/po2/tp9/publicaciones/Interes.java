package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public abstract class Interes {
	
	private Investigadora investigadoraSuscripta;
	
	public Interes(Investigadora investigadoraSuscripta) {
		this.investigadoraSuscripta = investigadoraSuscripta;
		investigadoraSuscripta.agregarInteres(this);
	}
	
	public abstract Boolean esDeInteres(Articulo articulo);
	
}
