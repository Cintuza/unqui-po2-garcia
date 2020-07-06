package ar.edu.unq.po2.tp11.automotor;

import java.time.LocalDate;

public class VehiculoPolicial extends Vehiculo {

	public VehiculoPolicial(LocalDate fechaFabricacion, String ciudadRadicacion) {
		super(fechaFabricacion, ciudadRadicacion);
	}
	public Boolean debeRealizarVtv(LocalDate fecha) {
		return false;
	}

}
