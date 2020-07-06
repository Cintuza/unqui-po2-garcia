package ar.edu.unq.po2.tp10.reproductorMp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;


public class ReproductorTestCase {
	
	private Reproductor reproductor;
	private Cancion cancion;
	
	@BeforeEach
	public void setUp() {
		reproductor = new Reproductor();
		cancion =  mock(Cancion.class);
	}

	@Test
	public void testSeReproduceCancionEnModoSeleccionDeTemas() {
		reproductor.play(cancion);
		verify(cancion, times(1)).play();
	}
	
	@Test
	public void testSeReproduceCancionYAlDarPlayDeNuevoTiraExcepcionPorCambioDeEstado() {
		reproductor.play(cancion);
		assertThrows(RuntimeException.class,()->{
			reproductor.play(cancion);
		});
	}

	@Test
	public void testSePausaLaReproduccionDeLaCancion() {
		reproductor.play(cancion);
		reproductor.pause(cancion);
		
		verify(cancion).pausa();
	}

	@Test
	public void testSeParaLaReproduccionDeLaCancion() {
		reproductor.play(cancion);
		reproductor.stop(cancion);
		
		verify(cancion).stop();
	}
		
}