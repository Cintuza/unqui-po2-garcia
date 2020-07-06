package ar.edu.unq.po2.tp7.sueldosRecargado;

public abstract class Trabajadora {
	
	public Double sueldo() {
		Double sueldo = sueldoPorHora() + sueldoBasico() + otrosConceptos();
		return aplicarDescuentos(sueldo);
	}
	
	protected abstract Double sueldoPorHora();

	protected abstract Double sueldoBasico();

	protected abstract Double otrosConceptos();

	private Double aplicarDescuentos(Double sueldo) {
		return sueldo * 0.87;
	}

}
