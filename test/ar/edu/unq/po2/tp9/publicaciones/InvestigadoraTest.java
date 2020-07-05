package ar.edu.unq.po2.tp9.publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;

import org.junit.jupiter.api.*;

class InvestigadoraTest {
	
	private Investigadora investigadora;
	private Articulo articulo;
	private InteresEnAutoras interesAutora;
	private InteresEnFiliacion interesFiliacion;
	private InteresEnLugarDePublicacion interesTipoPublicacion;
	
	@BeforeEach
	public void setUp() {
		investigadora = new Investigadora ("Sandra Goni");
		articulo = mock(Articulo.class);
		interesAutora = mock(InteresEnAutoras.class);
		interesFiliacion = mock(InteresEnFiliacion.class);
		interesTipoPublicacion = mock(InteresEnLugarDePublicacion.class);
		
		investigadora.agregarInteres(interesTipoPublicacion);
		investigadora.agregarInteres(interesFiliacion);
		investigadora.agregarInteres(interesAutora);
	}

	@Test
	public void testLlegaUnArticuloYLaInvestigadoraEstaInteresada() {
		when(interesAutora.esDeInteres(articulo)).thenReturn(true);
		when(interesFiliacion.esDeInteres(articulo)).thenReturn(false);
		when(interesTipoPublicacion.esDeInteres(articulo)).thenReturn(true);
		
		assertTrue(investigadora.estaInteresadaEn(articulo));
	}

	@Test
	public void testLlegaUnArticuloYLaInvestigadoraNoEstaInteresada() {
		when(interesAutora.esDeInteres(articulo)).thenReturn(false);
		when(interesFiliacion.esDeInteres(articulo)).thenReturn(false);
		when(interesTipoPublicacion.esDeInteres(articulo)).thenReturn(false);
		
		assertFalse(investigadora.estaInteresadaEn(articulo));
	}

}
