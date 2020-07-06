package ar.edu.unq.po2.tp10.reproductorMp3;

public abstract class EstadoReproductor {

	protected abstract void play(Cancion cancion, Reproductor reproductor);
	protected abstract void pause(Cancion cancion, Reproductor reproductor);
	protected abstract void stop(Cancion cancion, Reproductor reproductor);
	
}