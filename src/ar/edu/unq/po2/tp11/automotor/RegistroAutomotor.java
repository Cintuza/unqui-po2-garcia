package ar.edu.unq.po2.tp11.automotor;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {
		// se eliminan variables ahora innecesarias porque pasan a las subclases
		LocalDate fechaFabricacion = vehiculo.getFechaFabricacion();
		
		/*
		 * Switch statements, se separa las clases para que cada una responda de acuerdo 
		 * a su comportamiento como tipo
		 */
		// vehiculos policiales no realizan vtv, ya que tienen otro tipo de control
		// sólo realizan vtv los vehículos con más de 1 anio de antiguedad y radicados
		// en 'Buenos Aires'
		return (vehiculo.debeRealizarVtv(fecha));

	}
}