package ar.edu.unq.po2.tp9.publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;
import org.mockito.Mock;

class SistemaDePublicacionesTest {
	
	private SistemaDePublicaciones sistema;
	private SuscripcionPorAutoras suscripcionPorAutoras;
	
	@BeforeEach
	public void setUp() {
		sistema = new SistemaDePublicaciones();
		suscripcionPorAutoras = mock(SuscripcionPorAutoras.class);
	}

	@Test
	public void testSeAgregaUnArticuloYSeInformaALasSuscripciones() {
		Articulo articulo = mock(Articulo.class);
		sistema.agregarSuscripcion(suscripcionPorAutoras);
		sistema.agregarArticulo(articulo);
		
		verify(suscripcionPorAutoras).updateInvestigadoras(articulo);
	}

}
