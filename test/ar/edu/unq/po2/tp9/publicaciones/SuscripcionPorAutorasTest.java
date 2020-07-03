package ar.edu.unq.po2.tp9.publicaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;

class SuscripcionPorAutorasTest {
	
	private List<String> autorasDeInteres;
	private Investigadora investigadoraSuscripta;
	private SistemaDePublicaciones sistema;
	private SuscripcionPorAutoras suscripcion;
	
	@BeforeEach
	public void setUp() {
		autorasDeInteres = new ArrayList<String>();
		autorasDeInteres.add("Sandra Goni");
		autorasDeInteres.add("Valeria Adoue");
		autorasDeInteres.add("Alicia Alonso");
		investigadoraSuscripta = mock(Investigadora.class);
		sistema = mock(SistemaDePublicaciones.class);
		
		suscripcion = new SuscripcionPorAutoras(investigadoraSuscripta, autorasDeInteres, sistema);
		
	}

	@Test
	void testLlegaUnArticuloConAutoraDeInteresYSeAvisaALaInvestigadoraSuscripta() {
		Articulo articulo = mock(Articulo.class);
		when(articulo.fueEscritoPor("Sandra Goni")).thenReturn(false);
		when(articulo.fueEscritoPor("Valeria Adoue")).thenReturn(true);
		when(articulo.fueEscritoPor("Alicia Alonso")).thenReturn(false);
		
		suscripcion.updateInvestigadoras(articulo);
		
		verify(investigadoraSuscripta).updateInvestigadora(articulo);
	}

	@Test
	void testLlegaUnArticuloSinAutoraDeInteresYNoSeAvisaALaInvestigadoraSuscripta() {
		Articulo articulo = mock(Articulo.class);
		when(articulo.fueEscritoPor("Sandra Goni")).thenReturn(false);
		when(articulo.fueEscritoPor("Valeria Adoue")).thenReturn(false);
		when(articulo.fueEscritoPor("Alicia Alonso")).thenReturn(false);
		
		suscripcion.updateInvestigadoras(articulo);
		
		verify(investigadoraSuscripta, never()).updateInvestigadora(articulo);
	}

}
