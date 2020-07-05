package ar.edu.unq.po2.tp9.eventosDeportivos;

public abstract class Interes {
	
	private AplicacionMovil aplicacionMovil;
	
	public Interes(AplicacionMovil aplicacionMovil) {
		this.aplicacionMovil = aplicacionMovil;
		aplicacionMovil.agregarInteres(this);
	}
	
	public abstract Boolean esDeInteres(Partido partido);

}
