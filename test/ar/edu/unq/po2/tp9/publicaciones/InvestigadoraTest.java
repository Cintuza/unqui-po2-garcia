package ar.edu.unq.po2.tp9.publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;

class InvestigadoraTest {

	@Test
	void testSeLanzaAvisoSobreLlegadaDeArticuloDeInteres() {
		Investigadora investigadora = new Investigadora ("Sandra Goni");
		Articulo articulo = mock(Articulo.class);
		when(articulo.getTitulo()).thenReturn("Virologia");
		
		String aviso = investigadora.avisarLlegadaArticulo(articulo);
		assertEquals("Esta disponible el siguiente articulo de su interes: Virologia", aviso);
	}

}
