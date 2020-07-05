package ar.edu.unq.po2.tp6.solicitudesCredito;

public abstract class SolicitudDeCredito {
	
	private Cliente cliente;
	private Double montoSolicitado;
	private Integer plazoDePago;
	
	public SolicitudDeCredito(Cliente cliente, Double montoSolicitado, Integer plazoDePago) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoDePago = plazoDePago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Double getMontoSolicitado() {
		return montoSolicitado;
	}

	public Integer getPlazoDePago() {
		return plazoDePago;
	}
	
	/**
	 * Devuelve el monto correspondiente a la cuota mensual, resultente de 
	 * la division entre montoSolicitado y plazo y pago
	 */
	public Double montoCuotaMensual() {
		return getMontoSolicitado() / getPlazoDePago();
	}
	
	public abstract Boolean esAceptable();
	
}
