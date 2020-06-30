package ar.edu.unq.po2.tp10.encriptador;

public class ReemplazoPorNumeros implements ModoDeEncriptacion {
	
	private String alfabeto = " abcdefghijklmnopqrstuvwxyz";
	
	public ReemplazoPorNumeros() {}

	@Override
	public String encriptar(String texto) {
		String textoEnMinuscula = texto.toLowerCase();
		String textoEncriptado = "";
		for (int i = 0; i < textoEnMinuscula.length(); i++) {
			String letraEncriptada = reemplazarLetra(textoEnMinuscula.charAt(i));
			if (i != 0) {
				textoEncriptado = textoEncriptado + ",";
			}			
			textoEncriptado = textoEncriptado + letraEncriptada;
		}
		return textoEncriptado;
	}

	@Override
	public String desencriptar(String textoEncriptado) {
		String[] letrasEncriptadas = textoEncriptado.split(",");
		String texto = "";
		for (int i = 0; i < letrasEncriptadas.length; i++) {
			char letra = recuperarLetra(letrasEncriptadas[i]);
			texto = texto + letra;
		}
		return texto;
	}
	
	private String reemplazarLetra(char letra) {
		Integer valorLetra = alfabeto.indexOf(letra);
		return valorLetra.toString();
	}
	
	private char recuperarLetra(String valorLetra) {
		Integer posicionLetra = Integer.valueOf(valorLetra);
		return alfabeto.charAt(posicionLetra);
	}

}
