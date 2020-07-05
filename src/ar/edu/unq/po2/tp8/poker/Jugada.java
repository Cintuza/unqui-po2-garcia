package ar.edu.unq.po2.tp8.poker;


public class Jugada {

	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	public Jugada(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		this.carta1 = carta1;
		this.carta2 = carta2;
		this.carta3 = carta3;
		this.carta4 = carta4;
		this.carta5 = carta5;
	}

	public String[] getValores() {
		String[] valoresDeCartas = {carta1.getValor(), carta2.getValor(), carta3.getValor(), carta4.getValor(), carta5.getValor()};
		return valoresDeCartas;
	}
	
	public String[] getPalos() {
		String[] palosDeCartas = {carta1.getPalo(), carta2.getPalo(), carta3.getPalo(), carta4.getPalo(), carta5.getValor()};
		return palosDeCartas;
	}
	
	public Integer[] getValoresNumericos() {
		Integer[] valoresDeCartas = {carta1.getValorNumerico(), carta2.getValorNumerico(), carta3.getValorNumerico(), carta4.getValorNumerico(), carta5.getValorNumerico()};
		return valoresDeCartas;
	}

}
