package ar.edu.unq.po2.tp9.concursoPreguntas;

public enum Error {
	
	El_JUEGO_A_FINALIZADO ( "EL JUEGO YA SE ENCUENTRA FINALIZADO"),
	CUPO_LLENO ("No se admiten mas participantes, cupo lleno"),
	NO_ESTA_COMPLETO_EL_CUPO ("Aun no se completo el cupo, el juego no ha comenzado"),
	EN_JUEGO ("Este juego ya comenzo, espera a otra ronda"),
	NO_ES_PARTICIPANTE_EN_JUEGO("El participante no se encuentra en una partida");
	
	private String valor;

	private Error(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}	

	
	

}
