package ar.edu.unq.po2.tp10.maquinaVideoJuegos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class MaquinaVideoJuegosTest {
	
	private MaquinaVideoJuegos maquina;
	
	@BeforeEach
	public void setUp() {
		maquina = new MaquinaVideoJuegos();
	}

	@Test
	void testMaquinaSeCreaConEstadoInicial() {
		String texto = maquina.iniciarJuego();
		
		assertEquals("Ingrese fichas para comenzar el juego!", texto);
	}
	
	@Test
	void testMaquinaIngresaUnaMonedaEIniciaJuegoDeUnaPersona() {
		maquina.agregarFicha();
		
		String texto = maquina.iniciarJuego();
		
		assertEquals("Juega una persona", texto);
	}
	
	@Test
	void testMaquinaIniciaJuegoDeUnaPersonaYVuelveAEstadoInicialAlTerminar() {
		maquina.agregarFicha();
		String texto = maquina.iniciarJuego();
		
		maquina.terminarJuego();
		
		assertEquals("Ingrese fichas para comenzar el juego!", maquina.iniciarJuego());
	}
	
	@Test
	void testMaquinaIngresanDosMonedasEIniciaJuegoDeDosPersonas() {
		maquina.agregarFicha();
		maquina.agregarFicha();
		
		String texto = maquina.iniciarJuego();
		
		assertEquals("Juegan dos personas", texto);
	}
	
	@Test
	void testMaquinaIniciaJuegoDeDosPersonasYVuelveAEstadoInicialAlTerminar() {
		maquina.agregarFicha();
		maquina.agregarFicha();
		String texto = maquina.iniciarJuego();
		
		maquina.terminarJuego();
		
		assertEquals("Ingrese fichas para comenzar el juego!", maquina.iniciarJuego());
	}

}
