package ar.edu.unq.po2.tp9.publicaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;

class SuscripcionPorTituloTest {
	
	private List<String> titulosDeInteres;
	private Investigadora investigadoraSuscripta;
	private SistemaDePublicaciones sistema;
	private SuscripcionPorTitulo suscripcion;
	
	@BeforeEach
	public void setUp() {
		titulosDeInteres = new ArrayList<String>();
		titulosDeInteres.add("Dinamica de cavidades proteicas");
		titulosDeInteres.add("Expeller de soja");
		titulosDeInteres.add("Sistema local de innovacion");
		investigadoraSuscripta = mock(Investigadora.class);
		sistema = mock(SistemaDePublicaciones.class);
		
		suscripcion = new SuscripcionPorTitulo(investigadoraSuscripta, titulosDeInteres, sistema);
		
	}

	@Test
	void testSeAgregaUnArticuloConTituloDeInteresYSeAvisaAInvestigadoraSuscripta() {
		Articulo articulo = mock(Articulo.class);
		when(articulo.getTitulo()).thenReturn("Expeller de soja");
		
		suscripcion.updateInvestigadoras(articulo);
		
		verify(investigadoraSuscripta).updateInvestigadora(articulo);
	}

	@Test
	void testSeAgregaUnArticuloSinTituloDeInteresYNoSeAvisaAInvestigadoraSuscripta() {
		Articulo articulo = mock(Articulo.class);
		when(articulo.getTitulo()).thenReturn("Grandes rearreglos de cromosoma x");
		
		suscripcion.updateInvestigadoras(articulo);
		
		verify(investigadoraSuscripta, never()).updateInvestigadora(articulo);
	}

}
