package ar.edu.unq.po2.tp7.sueldosRecargado;

public class TrabajadoraPasante extends Trabajadora {
	
	private Double horasTrabajadas;

	public TrabajadoraPasante(Double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	protected Double sueldoPorHora() {
		return 40 * horasTrabajadas;
	}

	@Override
	protected Double sueldoBasico() {
		return 0d;
	}

	@Override
	protected Double otrosConceptos() {
		return 0d;
	}

}
