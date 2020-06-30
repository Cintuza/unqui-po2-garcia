package ar.edu.unq.po2.tp10.maquinaVideoJuegos;

public interface EstadoDeJuego {

	public String iniciarJuego(MaquinaVideoJuegos maquina);
	public void terminarJuego(MaquinaVideoJuegos maquina);
	public void chequearEstado(MaquinaVideoJuegos maquinaVideoJuegos);
}
