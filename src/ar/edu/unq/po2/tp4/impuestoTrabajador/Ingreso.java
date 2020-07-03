package ar.edu.unq.po2.tp4.impuestoTrabajador;

public class Ingreso {
	
	private String mes;
	private String concepto;
	private Double montoPercibido;
	
	public Ingreso(String mes, String concepto, Double montoPercibido) {
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public Double getMontoPercibido() {
		return montoPercibido;
	}
	
	public Double montoImponible() {
		return getMontoPercibido();
	}

}
