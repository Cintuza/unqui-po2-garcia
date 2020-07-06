package ar.edu.unq.po2.tp10.reproductorMp3;

public class Pausado extends EstadoReproductor {

	@Override
	protected void play(Cancion cancion, Reproductor reproductor) {
		cancion.play();
		reproductor.setEstado(new Reproduciendo());

	}

	@Override
	protected void pause(Cancion cancion, Reproductor reproductor) throws RuntimeException {
		throw new RuntimeException("La cancion esta pausada");

	}

	@Override
	protected void stop(Cancion cancion, Reproductor reproductor) {
		cancion.stop();
		reproductor.setEstado(new SeleccionDeTemas());

	}

}