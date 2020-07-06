package ar.edu.unq.po2.tp9.concursoPreguntas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cuestionario {
	
	private List<Pregunta> preguntas; 
	
	public Cuestionario(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	public List<Pregunta> getPreguntas() {
		return preguntas;
	}
	
	public List<String> getPreguntasParaParticipante(){
		return this.getPreguntas().parallelStream().map(pregunta -> pregunta.getPregunta()).collect(Collectors.toList());
	}
	
	
	
	

}