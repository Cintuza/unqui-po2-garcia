package ar.edu.unq.po2.tp9.concursoPreguntas;

import org.mockito.Mock;
import org.mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

public class ParticipanteTest {
	
	private Participante participante1;
	private Participante participante2;
	private Participante participante3;
	private Participante participante4;
	private Participante participante5;
	private Participante participante6;
	
	List<String> preguntasParaParticipante;
	List<String> preguntasParaParticipanteSinPregunta1;
	List<Pregunta> preguntas;
	
	
	@Mock
	private Servidor servidor = mock(Servidor.class);
	
	@Mock
	private EstadoDeJuego listoParaComenzar = mock(EsperandoParaComenzar.class);
	@Mock
	private EstadoDeJuego enJuego = mock(EnJuego.class);
	@Mock
	private EstadoDeJuego finalizado = mock(Finalizado.class);
	
	
	@Mock
	private Cuestionario cuestionario = mock(Cuestionario.class);
	@Mock
	private Pregunta pregunta1 = mock(Pregunta.class);
	@Mock
	private Pregunta pregunta2 = mock(Pregunta.class);
	@Mock
	private Pregunta pregunta3 = mock(Pregunta.class);
	@Mock
	private Pregunta pregunta4 = mock(Pregunta.class);
	@Mock
	private Pregunta pregunta5 = mock(Pregunta.class);
	@Mock
	private Respuesta respuesta1 = mock(Respuesta.class);
	@Mock
	private Respuesta respuesta2 = mock(Respuesta.class);
	@Mock
	private Respuesta respuesta3 = mock(Respuesta.class);
	@Mock
	private Respuesta respuesta4 = mock(Respuesta.class);
	@Mock
	private Respuesta respuesta5 = mock(Respuesta.class);
	@Mock
	private Respuesta respuesta6 = mock(Respuesta.class);
	@Mock
	private Respuesta respuesta7 = mock(Respuesta.class);
	@Mock
	private Respuesta respuesta8 = mock(Respuesta.class);
	@Mock
	private Respuesta respuesta9 = mock(Respuesta.class);
	@Mock
	private Respuesta respuesta10 = mock(Respuesta.class);
	
	@BeforeEach
	public void setUp() {
		participante1 = new Participante("jaime");
		participante2 = new Participante("arturito");
		participante3 = new Participante("armando");
		participante4 = new Participante("jim carrey");
		participante5 = new Participante("jose");
		participante6 = new Participante("estelita");
		
		when(pregunta1.getRespuestaCorrecta()).thenReturn(respuesta1);
		when(pregunta2.getRespuestaCorrecta()).thenReturn(respuesta2);
		when(pregunta3.getRespuestaCorrecta()).thenReturn(respuesta3);
		when(pregunta4.getRespuestaCorrecta()).thenReturn(respuesta4);
		when(pregunta5.getRespuestaCorrecta()).thenReturn(respuesta5);
		
		when(pregunta1.getPregunta()).thenReturn("pregunta1");
		when(pregunta2.getPregunta()).thenReturn("pregunta2");
		when(pregunta3.getPregunta()).thenReturn("pregunta3");
		when(pregunta4.getPregunta()).thenReturn("pregunta4");
		when(pregunta5.getPregunta()).thenReturn("pregunta5");
		
		preguntas = new ArrayList<Pregunta>();
		preguntas.add(pregunta1);
		preguntas.add(pregunta2);
		preguntas.add(pregunta3);
		preguntas.add(pregunta4);
		preguntas.add(pregunta5);
		
		when(cuestionario.getPreguntas()).thenReturn(preguntas);
		
		preguntasParaParticipante = new ArrayList<String>();
		preguntasParaParticipante.add(pregunta1.getPregunta());
		preguntasParaParticipante.add(pregunta2.getPregunta());
		preguntasParaParticipante.add(pregunta3.getPregunta());
		preguntasParaParticipante.add(pregunta4.getPregunta());
		preguntasParaParticipante.add(pregunta5.getPregunta());
		
		when(cuestionario.getPreguntasParaParticipante()).thenReturn(preguntasParaParticipante);
		
		preguntasParaParticipanteSinPregunta1 = new ArrayList<String>();
		preguntasParaParticipanteSinPregunta1.add(pregunta2.getPregunta());
		preguntasParaParticipanteSinPregunta1.add(pregunta3.getPregunta());
		preguntasParaParticipanteSinPregunta1.add(pregunta4.getPregunta());
		preguntasParaParticipanteSinPregunta1.add(pregunta5.getPregunta());
	}
	
	
	@Test
	public void tet1() throws Exception {
		participante1.solicitarIngresoALaPartida(servidor);
		
		assertTrue(participante1.esParticipanteEnJuego());
		assertFalse(participante6.esParticipanteEnJuego());
		
		participante1.recibirCuestionario(preguntasParaParticipante);
		participante2.recibirCuestionario(preguntasParaParticipante);
		participante3.recibirCuestionario(preguntasParaParticipante);
		participante4.recibirCuestionario(preguntasParaParticipante);
		participante5.recibirCuestionario(preguntasParaParticipante);
		
		assertEquals(preguntasParaParticipante, participante1.getPreguntasRecibidas());
		
		participante1.recibirRespuestaCorrecta(pregunta1);
		
		assertEquals(preguntasParaParticipanteSinPregunta1, participante1.getPreguntasRecibidas());
		
		participante1.enviarRespuesta(pregunta2.getPregunta(), respuesta2);
		
		verify(servidor, times(1)).verificarRespuesta(pregunta2.getPregunta(), respuesta2, participante1);
	}
	
	
	

}