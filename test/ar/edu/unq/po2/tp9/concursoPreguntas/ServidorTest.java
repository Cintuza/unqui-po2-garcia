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

public class ServidorTest {
	
	private Servidor servidor;
	
	List<String> preguntasParaParticipante;
	List<Pregunta> preguntas;
	
	@Mock
	private Participante participante1 = mock(Participante.class);
	@Mock
	private Participante participante2 = mock(Participante.class);
	@Mock
	private Participante participante3 = mock(Participante.class);
	@Mock
	private Participante participante4 = mock(Participante.class);
	@Mock
	private Participante participante5 = mock(Participante.class);
	
	@Mock
	private EstadoDeJuego listoParaComenzar = mock(EsperandoParaComenzar.class);
	@Mock
	private EnJuego enJuego = mock(EnJuego.class);
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
	
	
	@BeforeEach
	public void setUp() {
		
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
		
		servidor = new Servidor(cuestionario);
		
	}
	
	@Test
	public void test1() throws Exception {
		servidor.nuevoParticipante(participante1);
		servidor.nuevoParticipante(participante2);
		servidor.nuevoParticipante(participante3);
		servidor.nuevoParticipante(participante4);
		servidor.nuevoParticipante(participante5);
		
		servidor.empezarJuego();
		
		servidor.verificarRespuesta(pregunta1.getPregunta(), respuesta2, participante1);
		verify(participante1, times(1)).recibirRespuestaIncorrecta();
		
	}
	

}