package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	
	private Double precioUnidadConsumida;
	private Integer cantUnidadesConsumidas;
	
	public Servicio(Agencia agencia, Double precioUnidadConsumida, Integer cantUnidadesConsumidas) {
		super(agencia);
		this.precioUnidadConsumida = precioUnidadConsumida;
		this.cantUnidadesConsumidas = cantUnidadesConsumidas;
	}
	
	/*private Double precioUnidadConsumida() {
		return this.precio;
	}*/
	
	public Double precioTotal() {
		Double costoTotal = cantUnidadesConsumidas * precioUnidadConsumida;
		return costoTotal;
	}
	
}
