package ar.edu.unq.po2.tp6.solicitudesCredito;

import java.util.function.BooleanSupplier;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {

	public SolicitudDeCreditoPersonal(Cliente cliente, Double montoSolicitado, Integer plazoDePago) {
		super(cliente, montoSolicitado, plazoDePago);
	}

	public Boolean esAceptable() {
		//setea el monto anual minimo
		Double montoAnualMinimo = 15000d;
		//chequea que el monto neto anual del cliente sea mayor que el monto anual minimo
		Boolean tieneIngresosMinimos = getCliente().sueldoNetoAnual() > montoAnualMinimo;
		
		//calcula el ingreso mensual minimo como el 70 porciento del sueldo mensual del cliente
		Double ingresoMensualMinimo = getCliente().getSueldoNeto() * 70 / 100;
		//chequea que la cuota mensual no sea mayor al ingreso mensual minimo 
		Boolean cuotaMensualNoSuperaIngresoMensualMinimo = montoCuotaMensual() < ingresoMensualMinimo;
		
		return tieneIngresosMinimos & cuotaMensualNoSuperaIngresoMensualMinimo;
	}
	
	

}
