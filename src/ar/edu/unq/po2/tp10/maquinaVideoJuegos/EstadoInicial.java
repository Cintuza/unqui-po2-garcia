package ar.edu.unq.po2.tp10.maquinaVideoJuegos;

public class EstadoInicial implements EstadoDeJuego {

	@Override
	public String iniciarJuego(MaquinaVideoJuegos maquina) {
		return "Ingrese fichas para comenzar el juego!";
	}

	@Override
	public void terminarJuego(MaquinaVideoJuegos maquina) {
	}

	@Override
	public void chequearEstado(MaquinaVideoJuegos maquinaVideoJuegos) {
		if (maquinaVideoJuegos.getCantidadFichas() == 2) {
			maquinaVideoJuegos.setEstadoDeJuego(new JueganDosPersonas());
		}
		else if (maquinaVideoJuegos.getCantidadFichas() == 1) {
			maquinaVideoJuegos.setEstadoDeJuego(new JuegaUnaPersona());
		}
	}

}
