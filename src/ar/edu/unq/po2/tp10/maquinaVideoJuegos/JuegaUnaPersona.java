package ar.edu.unq.po2.tp10.maquinaVideoJuegos;

public class JuegaUnaPersona implements EstadoDeJuego {

	@Override
	public String iniciarJuego(MaquinaVideoJuegos maquina) {
		return "Juega una persona";
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
