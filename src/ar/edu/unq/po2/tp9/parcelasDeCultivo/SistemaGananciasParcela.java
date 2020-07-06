package ar.edu.unq.po2.tp9.parcelasDeCultivo;

public class SistemaGananciasParcela {

	private IParcela parcela;
	
	public SistemaGananciasParcela(IParcela parcela) {
		this.parcela = parcela;
	}
	
	public Double getGananciasAnuales() {
		return parcela.gananciasAnualesTotales();
	}
}
