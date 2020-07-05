package ar.edu.unq.po2.tp9.publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;
import org.mockito.Mock;

class SistemaDePublicacionesTest {
	
	private SistemaDePublicaciones sistema;
	private Investigadora investigadora1;
	private Investigadora investigadora2;
	
	@BeforeEach
	public void setUp() {
		sistema = new SistemaDePublicaciones();
		investigadora1 = mock(Investigadora.class);
		investigadora2 = mock(Investigadora.class);
	}

	@Test
	public void testSeAgregaUnArticuloYSeInformaALasInvestigadorasQueEstanInteresadas() {
		Articulo articulo = mock(Articulo.class);
		sistema.agregarInvestigadora(investigadora1);
		when(investigadora1.estaInteresadaEn(articulo)).thenReturn(false);
		sistema.agregarInvestigadora(investigadora2);
		when(investigadora2.estaInteresadaEn(articulo)).thenReturn(true);
		
		sistema.agregarArticulo(articulo);

		verify(investigadora1, never()).updateInvestigadora(articulo);
		verify(investigadora2).updateInvestigadora(articulo);
	}

}
