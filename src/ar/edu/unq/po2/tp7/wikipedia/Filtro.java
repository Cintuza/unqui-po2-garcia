package ar.edu.unq.po2.tp7.wikipedia;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	
	public Filtro() {}
	
	/**
	 * Toma una lista de paginas, wikipedia, y la filtra de acuerdo a un determinado criterio establecido por las subclases. La comparacion se hace sobre la pagina pasada compo parametro
	 * @param pagina Es una pagina de wikipedia a partir de la cual se filtran otras paginas de la wiki 
	 * @param wikipedia La lista de las paginas de wikipedia
	 * @return Una lista de paginas seleccionadas de la lista {@code wikipedia} de acuerdo al criterio de las subclases (filtros especificos)
	 */
	public List<WikipediaPage> getSimilarPages(WikipediaPage pagina, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> paginasSimilares = new ArrayList<WikipediaPage>();
		
		for (WikipediaPage wikipediaPage : wikipedia) {
			if(esSimilar(pagina, wikipediaPage))
				paginasSimilares.add(wikipediaPage);
		}
		
		return paginasSimilares;
	}

	
	public abstract Boolean esSimilar(WikipediaPage pagina, WikipediaPage otraPagina);
	
}
