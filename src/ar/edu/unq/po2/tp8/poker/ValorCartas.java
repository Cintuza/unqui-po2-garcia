package ar.edu.unq.po2.tp8.poker;

public enum ValorCartas {
	
	AS(1),
	DOS(2),
	TRES(3),
	CUATRO(4),
	CINCO(5),
	SEIS(6),
	SIETE(7),
	OCHO(8),
	NUEVE(9),
	DIEZ(10),
	JACK(11),
	QUEEN(12),
	KING(13);
	
	private Integer valor;

	ValorCartas(Integer valorNumerico) {
		this.valor = valorNumerico;
	}

	public Integer getValorNumerico() {
		return valor;
	}
	
}
