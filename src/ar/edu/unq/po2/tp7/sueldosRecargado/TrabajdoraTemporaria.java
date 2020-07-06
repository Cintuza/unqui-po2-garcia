package ar.edu.unq.po2.tp7.sueldosRecargado;

public class TrabajdoraTemporaria extends Trabajadora {
	
	private Double horasTrabajadas;
	private Integer cantidadDeHijes;
	private Boolean tieneConyuge;

	public TrabajdoraTemporaria(Double horasTrabajadas, Integer cantidadDeHijes, Boolean tieneConyuge) {
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadDeHijes = cantidadDeHijes;
		this.tieneConyuge = false;
	}
	
	public Integer getCantidadDeHijes() {
		return cantidadDeHijes;
	}

	@Override
	protected Double sueldoPorHora() {
		return 5 * this.horasTrabajadas;
	}

	@Override
	protected Double sueldoBasico() {
		return 1000d;
	}

	@Override
	protected Double otrosConceptos() {
		return sumarPlusPorConyugeOHijes();
	}

	private Double sumarPlusPorConyugeOHijes() {
		if (tieneConyuge() || getCantidadDeHijes() > 0) {
			return 100d;
		} 
		else {
			return 0d;
		}
	}

	public Boolean tieneConyuge() {
		return tieneConyuge;
	}

	public void asignarConyuge() {
		this.tieneConyuge = true;
	}

}
