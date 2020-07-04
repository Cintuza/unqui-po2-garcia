package ar.edu.unq.po2.tp9.eventosDeportivos;

import java.util.*;

public class InteresEnDeporte extends Interes {
	
	private List<String> deportesDeInteres;

	public InteresEnDeporte(AplicacionMovil aplicacionMovil, Servidor servidor) {
		super(aplicacionMovil, servidor);
		this.deportesDeInteres = new ArrayList<String>();
	}

	@Override
	public Boolean esDeInteres(Partido partido) {
		String deporte = partido.getDeporte();
		return deportesDeInteres.contains(deporte);
	}
	
	public void agregarDeporte(String deporte) {
		deportesDeInteres.add(deporte);
	}
	
	public void eliminarDeporte(String deporte) {
		deportesDeInteres.remove(deporte);
	}

}
