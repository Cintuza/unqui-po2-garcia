package ar.edu.unq.po2.tp6.solicitudesCredito;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {
	
	private PropiedadInmobiliaria propiedad;

	public SolicitudDeCreditoHipotecario(Cliente cliente, Double montoSolicitado, 
			Integer plazoDePago, PropiedadInmobiliaria propiedad) {
		super(cliente, montoSolicitado, plazoDePago);
		this.propiedad = propiedad;
	}

	/**
	 * Chequea que la solicitud cumpla con los requisitos para ser aceptable:
	 * - cuota mensual menor al 50 porciento del sueldo mensual 
	 * - monto solicitando mayor a porcentaje del valor fiscal de la propiedad
	 * - cliente no supera los 65 anios al terminar de pagar
	 * @return true si cumple con las dos condiciones mencionadas, false caso contrario
	 */
	@Override
	public Boolean esAceptable() {
		//calcula el ingreso mensual minimo como el 50 porciento del sueldo mensual del cliente
		Double ingresoMensualMinimo = getCliente().getSueldoNeto() * 50 / 100;
		//chequea que la cuota mensual no sea mayor al ingreso mensual minimo 
		Boolean cuotaMensualNoSuperaIngresoMensualMinimo = montoCuotaMensual() < ingresoMensualMinimo;
		return cuotaMensualNoSuperaIngresoMensualMinimo && montoTotalNoEsMayorAPorcentajeValorFiscal() 
				&& solicitanteNoSupera65AniosAntesTerminarPagar();
	}
	
	private Boolean montoTotalNoEsMayorAPorcentajeValorFiscal() {
		Double porcentajeValorFiscal = 70d;
		Double montoPorcentajeValorFiscal = propiedad.getValorFiscal() * porcentajeValorFiscal / 100;
		return getMontoSolicitado() < montoPorcentajeValorFiscal;
	}
	
	private Boolean solicitanteNoSupera65AniosAntesTerminarPagar() {
		Integer aniosEnPagar = getPlazoDePago() / 12;
		Integer edadDelClienteAlSolicitar = getCliente().getEdad();
		return (edadDelClienteAlSolicitar + aniosEnPagar) < 65;
	}

}
