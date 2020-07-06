package ar.edu.unq.po2.tp10.reproductorMp3;

public class Reproduciendo extends EstadoReproductor {

	@Override
	protected void play(Cancion cancion, Reproductor reproductor) {
		throw new RuntimeException("Ya hay una reproduccion en curso");
	}

	@Override
	protected void pause(Cancion cancion, Reproductor reproductor) {
		 cancion.pausa();
		 reproductor.setEstado(new Pausado());
	}

	@Override
	protected void stop(Cancion cancion, Reproductor reproductor) {
		cancion.stop();;
		reproductor.setEstado(new SeleccionDeTemas());
	}

}