package ar.edu.unq.po2.tp9.parcelasDeCultivo;

public abstract class Cultivo implements IParcela {
	
	private Double gananciasAnuales;
	private IParcela parcelaMadre;
	
	public Cultivo() {
		this.parcelaMadre = null;
	}
	
	public void setGananciasAnuales(Double ganancias) {
		gananciasAnuales = ganancias;
	}
	
	public Double getGananciasAnuales() {
		return gananciasAnuales;
	}

	@Override
	public Double gananciasAnualesTotales() {
		return getGananciasAnuales();
	}

	/**
	 * Metodo no implementado por las hojas
	 */
	@Override
	public void agregarParcela(IParcela parcela) {}

	/**
	 * Metodo no implementado por las hojas
	 */
	@Override
	public void eliminarParcela(IParcela parcela) {}

	/**
	 * Metodo no implementado por las hojas
	 */
	@Override
	public IParcela getParcelaHija(Integer posParcela) {
		return null;
	}

	@Override
	public void setParcelaMadre(IParcela parcela) {
		parcelaMadre = parcela;
	}

	@Override
	public IParcela getParcelaMadre() {
		return parcelaMadre;
	}

	@Override
	public void eliminarParcelaMadre() {
		parcelaMadre = null;
	}
}
