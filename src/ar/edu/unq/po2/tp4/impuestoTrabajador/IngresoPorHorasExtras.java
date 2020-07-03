package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {

	private Integer horasExtras;
	
	public IngresoPorHorasExtras(String mes, String concepto, Double montoPercibido, Integer horasExtras) {
		super(mes, concepto, montoPercibido);
		this.horasExtras = horasExtras;
	}
	
	public Double getMontoPercibido() {
		return super.getMontoPercibido();
	}
	
	public Double montoImponible() {
		return 0d;
	}
	
}
