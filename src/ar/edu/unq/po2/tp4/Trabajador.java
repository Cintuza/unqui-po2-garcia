package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingreso> ingresos;
	
	public Trabajador() {
		ingresos = new ArrayList<Ingreso>();
	}
	
	public void agregar(Ingreso ingreso) {
		ingresos.add(ingreso);
	}

	public Double getTotalPercibido() {
		Double total = 0d;
		for (int i = 0; i < ingresos.size(); i++) {
			Ingreso ingreso = ingresos.get(i);
			total += ingreso.getMontoPercibido();
		}
		return total;
	}

	public Double getMontoImponible() {
		Double monto = 0d;
		for (int i = 0; i < ingresos.size(); i++) {
			Ingreso ingreso = ingresos.get(i);
			monto += ingreso.montoImponible();
		}
		return monto;
	}

	public Double getImpuestoAPagar() {
		return getMontoImponible() * 0.02;
	}

}
