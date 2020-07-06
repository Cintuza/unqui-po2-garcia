package ar.edu.unq.po2.tp9.concursoPreguntas;

public class EnJuego implements EstadoDeJuego {

	@Override
	public void agregarParticipanteAlJuego(Servidor servidor, IParticipante participante) throws Exception{
		throw new Exception(Error.EN_JUEGO.getValor());
	}

	@Override
	public void notificarSegunCorresponda(Servidor servidor, Pregunta pregunta, Respuesta respuesta, Participante participante) {
		
		if(esRespuestaCorrecta(pregunta, respuesta)){
			servidor.sumarPuntajeA(participante);
			servidor.notificarRespuestaCorrectaA(participante, pregunta);
			servidor.notificarRespuestaCorrectaAParticipantes(participante, pregunta);
			
			if(servidor.getPuntajes().get(participante) == 5) {
				servidor.setEstado(new Finalizado());;
				servidor.notificarATodosLosParticipantesElGanador(participante);
			}
			
		} else {
			participante.recibirRespuestaIncorrecta();
		}
	}

	public boolean esRespuestaCorrecta(Pregunta pregunta, Respuesta respuesta) {
		return pregunta.getRespuestaCorrecta().equals(respuesta);
	}
	
	

}
