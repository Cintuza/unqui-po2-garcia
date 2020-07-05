package ar.edu.unq.po2.tp6.solicitudesCredito;

import java.util.*;

public class Banco {
	
	private List<Cliente> clientes;
	private List<SolicitudDeCredito> solicitudes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
	}

	public void agregar(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void registrar(SolicitudDeCredito solicitud) {
		solicitudes.add(solicitud);
	}
	
	public Boolean verificar(SolicitudDeCredito solicitud) {
		return solicitud.esAceptable();
	}
	
	public Double obtenerMontoTotalSolicitudesAceptadas() {
		Double montoADesembolsar = 0d;
		for (SolicitudDeCredito solicitud : solicitudes) {
			if (verificar(solicitud)) {
				montoADesembolsar = montoADesembolsar + solicitud.getMontoSolicitado(); 
			}
		}
		return montoADesembolsar;
	}
}
