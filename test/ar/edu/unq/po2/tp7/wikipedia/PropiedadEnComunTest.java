package ar.edu.unq.po2.tp7.wikipedia;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadEnComunTest {
	
	private PropiedadEnComun filtroPropiedadEnComun;
	private WikipediaPage emma;
	private WikipediaPage virginia;
	private WikipediaPage alicia;
	private WikipediaPage anarquismo;
	private WikipediaPage socialismo;
	private WikipediaPage kaunas;
	private WikipediaPage londres;
	private WikipediaPage sanLuis;
	private List<WikipediaPage> wikipedia;
	
	@BeforeEach
	public void setUp() {
		//creacion de instancia de filtro PropiedadEnComun
		filtroPropiedadEnComun = new PropiedadEnComun();
		
		//creacion de ciudades de nacimiento
		kaunas = mock(WikipediaPage.class);
		londres = mock(WikipediaPage.class);
		sanLuis = mock(WikipediaPage.class);

		//creacion de pagina anarquismo
		Map<String, WikipediaPage> infoboxDeAnarquismo = new HashMap<String, WikipediaPage>();
		anarquismo = mock(WikipediaPage.class);
		when(anarquismo.getInfobox()).thenReturn(infoboxDeAnarquismo);
		
		//creacion de pagina socialismo
		Map<String, WikipediaPage> infoboxDeSocialismo = new HashMap<String, WikipediaPage>();
		socialismo = mock(WikipediaPage.class);
		when(socialismo.getInfobox()).thenReturn(infoboxDeSocialismo);
		
		//creaccion de pagina Emma Goldman
		Map<String, WikipediaPage> infoboxDeEmma = new HashMap<String, WikipediaPage>();
		infoboxDeEmma.put("birth_place", kaunas);
		emma = mock(WikipediaPage.class);
		when(emma.getInfobox()).thenReturn(infoboxDeEmma);
		
		//creacion de pagina Virginia Bolten
		Map<String, WikipediaPage> infoboxDeVirginia = new HashMap<String, WikipediaPage>();
		infoboxDeVirginia.put("birth_place", sanLuis);
		virginia = mock(WikipediaPage.class);
		when(virginia.getInfobox()).thenReturn(infoboxDeVirginia);
		
		//creacion de pagina Alicia Moreau de Justo
		Map<String, WikipediaPage> infoboxDeAlicia = new HashMap<String, WikipediaPage>();
		infoboxDeAlicia.put("birth_place", londres);
		alicia = mock(WikipediaPage.class);
		when(alicia.getInfobox()).thenReturn(infoboxDeAlicia);
		
		//creacion de lista de paginas de wikipedia
		wikipedia = new ArrayList<WikipediaPage>();
		wikipedia.add(emma);
		wikipedia.add(virginia);
		wikipedia.add(alicia);
		wikipedia.add(anarquismo);
		wikipedia.add(socialismo);
	}
	
	//Testeo de funcionamiento del metodo getSimilarPages para caso de
	//paginas que poseen mismas propiedades, en este caso birthplace en tres paginas
	@Test
	void testObtenerLas3PaginasConDatoBirthPlaceEnInfobox() {
		//execute
		List<WikipediaPage> paginasConMismaPropiedad = filtroPropiedadEnComun.getSimilarPages(emma, wikipedia);
		int	cantidadDePaginasConMismaPropiedad = paginasConMismaPropiedad.size();
		
		//verify
		assertEquals(3, cantidadDePaginasConMismaPropiedad);
		
	}

}
