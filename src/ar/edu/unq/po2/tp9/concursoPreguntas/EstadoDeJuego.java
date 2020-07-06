package ar.edu.unq.po2.tp9.concursoPreguntas;

public interface EstadoDeJuego {
	
	void agregarParticipanteAlJuego(Servidor servidor, IParticipante participante) throws Exception;

	void evaluarRespuesta(Servidor servidor, Pregunta pregunta, Respuesta respuesta, Participante participante) throws Exception;

}