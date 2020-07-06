package ar.edu.unq.po2.tp9.concursoPreguntas;

public class Pregunta {
	
	private String pregunta;
	private Respuesta respuestaCorrecta;
	
	public Pregunta(String pregunta, Respuesta respuestaCorrecta) {
		super();
		this.pregunta = pregunta;
		this.respuestaCorrecta = respuestaCorrecta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public Respuesta getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

}