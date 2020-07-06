package ar.edu.unq.po2.tp11.automotor;

import java.time.LocalDate;

public class Vehiculo {
	private LocalDate fechaFabricacion;	
	private String ciudadRadicacion; 
	
	/*
	 * Se cambia el constructor para eliminar si es vehiculo policial
	 */
	public Vehiculo(LocalDate fechaFabricacion, String ciudadRadicacion) {
		this.fechaFabricacion = fechaFabricacion;
		this.ciudadRadicacion = ciudadRadicacion;
	}

	/* Metodo a eliminar ya que se separan los vehiculos policiales
	public Boolean esVehiculoPolicial() {
		return esVehiculoPolicial;
	}
	*/

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public String ciudadRadicacion() {
		return ciudadRadicacion;
	}
	
	public Boolean debeRealizarVtv(LocalDate fecha) {
		return fecha.minusYears(1).isAfter(fechaFabricacion)
				&& ciudadRadicacion.equalsIgnoreCase("Buenos Aires");
	}
}