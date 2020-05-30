package ar.edu.unq.po2.tp7.wikipedia;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkEnComunTest {
	
	private LinkEnComun filtroLinkEnComun;
	private WikipediaPage emma;
	private WikipediaPage virginia;
	private WikipediaPage alicia;
	private WikipediaPage anarquismo;
	private WikipediaPage socialismo;
	private List<WikipediaPage> wikipedia;
	
	@BeforeEach
	public void setUp() {
		//creacion de instancia de filtro LinkEnComun
		filtroLinkEnComun = new LinkEnComun();

		//creacion de pagina anarquismo
		anarquismo = mock(WikipediaPage.class);
		
		//creacion de pagina socialismo
		socialismo = mock(WikipediaPage.class);
		
		//creaccion de pagina Emma Goldman
		List<WikipediaPage> linksDeEmma = new ArrayList<WikipediaPage>();
		linksDeEmma.add(anarquismo);
		emma = mock(WikipediaPage.class);
		when(emma.getLinks()).thenReturn(linksDeEmma);
		
		//creacion de pagina Virginia Bolten
		List<WikipediaPage> linksDeVirginia = new ArrayList<WikipediaPage>();
		linksDeVirginia.add(anarquismo);
		virginia = mock(WikipediaPage.class);
		when(virginia.getLinks()).thenReturn(linksDeVirginia);
		
		//creacion de pagina Alicia Moreau de Justo
		List<WikipediaPage> linksDeAlicia = new ArrayList<WikipediaPage>();
		linksDeAlicia.add(socialismo);
		alicia = mock(WikipediaPage.class);
		when(alicia.getLinks()).thenReturn(linksDeAlicia);
		
		//creacion de lista de paginas de wikipedia
		wikipedia = new ArrayList<WikipediaPage>();
		wikipedia.add(emma);
		wikipedia.add(virginia);
		wikipedia.add(alicia);
	}

	//Testeo de funcionamiento del metodo getSimilarPages para caso de
	//paginas que linkean al mismo objeto, anarquismo, que en este caso son 2
	@Test
	void testObtenerLasDosPaginasConLinkAAnarquismo() {
		//execute
		List<WikipediaPage> paginasConMismoLink = filtroLinkEnComun.getSimilarPages(emma, wikipedia);
		int	cantidadDePaginasConMismoLink = paginasConMismoLink.size();
		
		//verify
		assertEquals(2, cantidadDePaginasConMismoLink);
		
	}

}
