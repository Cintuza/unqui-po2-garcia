package ar.edu.unq.po2.tp10.maquinaVideoJuegos;

public class MaquinaVideoJuegos {
	
	private EstadoDeJuego estadoDeJuego;
	private Integer cantidadFichas;
	
	public MaquinaVideoJuegos() {
		estadoDeJuego = new EstadoInicial();
		cantidadFichas = 0;
	}
	
	public EstadoDeJuego getEstadoDeJuego() {
		return estadoDeJuego;
	}

	public Integer getCantidadFichas() {
		return cantidadFichas;
	}

	public void setEstadoDeJuego(EstadoDeJuego estadoDeJuego) {
		this.estadoDeJuego = estadoDeJuego;
	}

	public void setCantidadFichas(Integer cantFichas) {
		cantidadFichas = cantFichas;
	}

	public void agregarFicha() {
		cantidadFichas = getCantidadFichas() + 1;
	}
	
	public String iniciarJuego() {
		getEstadoDeJuego().chequearEstado(this);
		return getEstadoDeJuego().iniciarJuego(this);
	}
	
	public void terminarJuego() {
		getEstadoDeJuego().terminarJuego(this);
	}
}
