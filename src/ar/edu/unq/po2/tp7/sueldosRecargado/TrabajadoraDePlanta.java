package ar.edu.unq.po2.tp7.sueldosRecargado;

public class TrabajadoraDePlanta extends Trabajadora {
	
	private Integer cantidadDeHijes;

	public TrabajadoraDePlanta(Integer cantidadDeHijes) {
		this.cantidadDeHijes = cantidadDeHijes;
	}

	@Override
	protected Double sueldoPorHora() {
		return 0d;
	}

	@Override
	protected Double sueldoBasico() {
		return 3000d;
	}

	@Override
	protected Double otrosConceptos() {
		return sumarSueldoPorHije();
	}

	private Double sumarSueldoPorHije() {
		return this.cantidadDeHijes	* 150d;	
	}

}
