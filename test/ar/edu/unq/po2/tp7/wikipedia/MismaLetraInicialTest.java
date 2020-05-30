package ar.edu.unq.po2.tp7.wikipedia;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MismaLetraInicialTest {
	
	private MismaLetraInicial filtroMismaLetraInicial;
	private WikipediaPage bernal;
	private WikipediaPage quilmes;
	private WikipediaPage buenosAires;
	private List<WikipediaPage> wikipedia;
	
	@BeforeEach
	public void setUp() {
		//creacion de instancia de filtro MismaLetraInicial
		filtroMismaLetraInicial = new MismaLetraInicial();
		
		//creaccion de pagina Bernal
		bernal = mock(WikipediaPage.class);
		when(bernal.getTitle()).thenReturn("Bernal");
		
		//creacion de pagina quilmes
		quilmes = mock(WikipediaPage.class);
		when(quilmes.getTitle()).thenReturn("Quilmes");
		
		//creacion de pagina buenos aires
		buenosAires = mock(WikipediaPage.class);
		when(buenosAires.getTitle()).thenReturn("Buenos Aires");
		
		//creacion de lista de paginas de wikipedia
		wikipedia = new ArrayList<WikipediaPage>();
		wikipedia.add(bernal);
		wikipedia.add(buenosAires);
		wikipedia.add(quilmes);
	}

	//Testeo de funcionamiento del metodo getSimilarPages para caso de
	//paginas que comienzan con B, que son dos paginas
	@Test
	public void testObtener2PaginasQueComienzanConB() {
		//execute
		List<WikipediaPage> paginasConMismaLetraInicial = filtroMismaLetraInicial.getSimilarPages(bernal, wikipedia); int
		cantidadDePaginasConMismaLetraInicial = paginasConMismaLetraInicial.size();
		
		//verify
		assertEquals(2, cantidadDePaginasConMismaLetraInicial);
	}

}
