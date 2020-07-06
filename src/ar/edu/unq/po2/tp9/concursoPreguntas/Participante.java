package ar.edu.unq.po2.tp9.concursoPreguntas;

import java.util.ArrayList;
import java.util.List;

public class Participante implements IParticipante {
			
		private List<String> preguntasRecibidas;
		private List<String> notificaciones;
		private Servidor servidor;
		private String nombre;
		
		public Participante (String nombre) {
			this.nombre = nombre;
			this.preguntasRecibidas = new ArrayList<String>();
			this.notificaciones = new ArrayList<String>();
		}

		@Override
		public void recibirCuestionario(List<String> preguntas) {
			this.preguntasRecibidas = preguntas;
		}
        
		/**
		 * Se elimina la pregunta de las preguntas recibidas cuando el estado del 
		 * servidor corrobora que la respuesta es correcta
		 */
		@Override
		public void recibirRespuestaCorrecta(Pregunta pregunta) {
			this.preguntasRecibidas.remove(pregunta.getPregunta());	
		}

		@Override
		public void recibirRespuestaIncorrecta() {
			this.recibirNotificacion("La Respuesta es incorrecta");	
		}
		
		@Override
		public void recibirNotificacion(String notificacion) {
			this.notificaciones.add(notificacion);
		}
		
		/**
		 * Participante solicita ingreso a la partida
		 */
		@Override
		public void solicitarIngresoALaPartida(Servidor servidor) throws Exception{
			this.servidor = servidor;
			this.servidor.nuevoParticipante(this);
		}
		
		/**
		 * Envia respuesta al servidor. Se asume que participante esta en la partida.
		 * @param pregunta pregunta a la cual esta respondiendo
		 * @param respuesta respuesta a la pregunta
		 */
		public void enviarRespuesta(String pregunta, Respuesta respuesta) throws Exception  {
			this.servidor.verificarRespuesta(pregunta, respuesta, this);
		}
		
		public boolean esParticipanteEnJuego() {
			return this.servidor != null;
		}

		public List<String> getNotificaciones() {
			return notificaciones;
		}

		public List<String> getPreguntasRecibidas() {
			return preguntasRecibidas;
		}

		public String getNombre() {
			return this.nombre;
		}

}