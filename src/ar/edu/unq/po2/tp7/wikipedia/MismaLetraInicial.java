package ar.edu.unq.po2.tp7.wikipedia;

import java.util.ArrayList;
import java.util.List;

public class MismaLetraInicial extends Filtro{

	//constructor
	public MismaLetraInicial() {}
	
	/**
	 * Devuelve true si ambas paginas empiezan con la misma letra
	 */
	public Boolean esSimilar(WikipediaPage pagina, WikipediaPage otraPagina) {
		Boolean esSimilar = false;
		
		String tituloPagina = pagina.getTitle();
		String tituloOtraPagina = otraPagina.getTitle();
		
		if(tituloPagina.charAt(0) == tituloOtraPagina.charAt(0)) {
			esSimilar = true;
		}
		return esSimilar;
	}
	
}
		