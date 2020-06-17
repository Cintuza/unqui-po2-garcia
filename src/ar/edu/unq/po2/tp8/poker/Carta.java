package ar.edu.unq.po2.tp8.poker;

public class Carta {
	
	private ValorCartas valor;
	private PaloCartas palo;
	
	public Carta(ValorCartas valor, PaloCartas palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public String getValor() {
		return valor.toString();
	}

	public String getPalo() {
		return palo.toString();
	}
	
	public Integer getValorNumerico() {
		return valor.getValorNumerico();
	}

	public Boolean esMayorA(Carta otraCarta) {
		Boolean esMayor = getValorNumerico() > otraCarta.getValorNumerico();
		return esMayor;
	}

}
