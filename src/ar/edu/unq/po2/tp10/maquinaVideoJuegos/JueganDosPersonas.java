package ar.edu.unq.po2.tp10.maquinaVideoJuegos;
public class JueganDosPersonas implements EstadoDeJuego {

	@Override
	public String iniciarJuego(MaquinaVideoJuegos maquina) {
		return "Juegan dos personas";
	}

	@Override
	public void terminarJuego(MaquinaVideoJuegos maquina) {
		maquina.setEstadoDeJuego(new EstadoInicial());
		maquina.setCantidadFichas(0);
	}

	@Override
	public void chequearEstado(MaquinaVideoJuegos maquinaVideoJuegos) {
	}

}
