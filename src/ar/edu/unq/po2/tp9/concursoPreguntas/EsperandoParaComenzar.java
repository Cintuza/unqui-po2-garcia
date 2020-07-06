package ar.edu.unq.po2.tp9.concursoPreguntas;

public class EsperandoParaComenzar implements EstadoDeJuego{

	@Override
	public void agregarParticipanteAlJuego(Servidor servidor, IParticipante participante) throws Exception {
		if(servidor.getParticipantes().size() < 5) {
			servidor.agregarParticipanteAlServidor(participante);
			if (servidor.getParticipantes().size() == 5) {
				servidor.setEstado(new EnJuego());
				servidor.empezarJuego();
			}
		} else {
			throw new Exception(Error.CUPO_LLENO.getValor());
		}
	}

	@Override
	public void evaluarRespuesta(Servidor servidor, Pregunta pregunta, Respuesta respuesta, Participante participante) throws Exception {
		throw new Exception(Error.NO_ESTA_COMPLETO_EL_CUPO.getValor()); 
	}
	

}