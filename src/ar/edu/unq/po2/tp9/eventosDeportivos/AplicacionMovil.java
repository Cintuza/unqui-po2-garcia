package ar.edu.unq.po2.tp9.eventosDeportivos;

import java.util.*;

public class AplicacionMovil {
	
	private List<Interes> intereses;
	
	public AplicacionMovil() {
		this.intereses = new ArrayList<Interes>();
	}
	
	public void suscribirseAServidor(Servidor servidor) {
		servidor.agregarAplicacionMovil(this);
	}
	
	public void agregarInteres(Interes interes) {
		intereses.add(interes);
	}
	
	public void eliminarInteres(Interes interes) {
		intereses.remove(interes);
	}
	
	public Boolean estaInteresadaEn(Partido partido) {
		Boolean estaInteresada = false;
		for (Interes interes : intereses) {
			estaInteresada = estaInteresada || interes.esDeInteres(partido);
		}
		return estaInteresada;
	}

	public void updateAplicacionMovil(Partido partido) {
		
	}

}
