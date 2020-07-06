package ar.edu.unq.po2.tp10.reproductorMp3;

public class Reproductor {
	private EstadoReproductor estadoActual;
	
	public Reproductor() {
		this.estadoActual = new SeleccionDeTemas();
	}
	
	public void play(Cancion cancion) {
		estadoActual.play(cancion, this);
	}
	
	public void pause(Cancion cancion) {
		estadoActual.pause(cancion, this);
	}
	
	public void stop(Cancion cancion) {
		estadoActual.stop(cancion, this);
	}

	public void setEstado(EstadoReproductor estado) {
		 estadoActual = estado;
	}



}