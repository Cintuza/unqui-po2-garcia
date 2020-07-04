package ar.edu.unq.po2.tp9.eventosDeportivos;

public abstract class Interes {
	
	private AplicacionMovil aplicacionMovil;
	private Servidor servidor;
	
	public Interes(AplicacionMovil aplicacionMovil, Servidor servidor) {
		this.aplicacionMovil = aplicacionMovil;
		this.servidor = servidor;
	}
	
	public abstract Boolean esDeInteres(Partido partido);

}
