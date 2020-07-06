package ar.edu.unq.po2.tp9.parcelasDeCultivo;

public interface IParcela {
	
	public Double gananciasAnualesTotales();
	public void agregarParcela(IParcela parcela);
	public void eliminarParcela(IParcela parcela);
	public IParcela getParcelaHija(Integer posParcela);
	public void setParcelaMadre(IParcela parcela);
	public void eliminarParcelaMadre();
	public IParcela getParcelaMadre();

}
