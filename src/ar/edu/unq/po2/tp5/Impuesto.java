package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	
	private Double tasa;
	
	public Impuesto(Agencia agencia, Double tasa) {
		super(agencia);
		this.tasa = tasa;
	}
	
	public Double precioTotal() {
		return tasa;
	}

}
