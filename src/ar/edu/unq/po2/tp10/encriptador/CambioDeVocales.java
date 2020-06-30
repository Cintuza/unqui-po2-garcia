package ar.edu.unq.po2.tp10.encriptador;

public class CambioDeVocales implements ModoDeEncriptacion {

	private String vocales = "aeiouAEIOU";
	
	public CambioDeVocales() {}

	@Override
	public String encriptar(String texto) {
		String textoEncriptado = "";
		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			if (vocales.indexOf(letra) >= 0) {
				letra = reemplazarLetra(letra);
			}
			textoEncriptado = textoEncriptado + letra;
		}
		return textoEncriptado;
	}

	@Override
	public String desencriptar(String textoEncriptado) {
		String texto = "";
		for (int i = 0; i < textoEncriptado.length(); i++) {
			char letra = textoEncriptado.charAt(i);
			if (vocales.indexOf(letra) >= 0) {
				letra = recuperarLetra(letra);
			}
			texto = texto + letra;
		}
		return texto;
	}
	
	private char reemplazarLetra(char vocal) {
		Integer posicionVocal = vocales.indexOf(vocal);
		if (posicionVocal == 4) {
			return 'a';
		}
		if (posicionVocal == 9) {
			return 'A';
		}
		return vocales.charAt(posicionVocal + 1);
	}
	
	private char recuperarLetra(char vocal) {
		Integer posicionVocal = vocales.indexOf(vocal);
		if (posicionVocal == 0) {
			return 'u';
		}
		if (posicionVocal == 5) {
			return 'U';
		}
		return vocales.charAt(posicionVocal - 1);
	}

}
