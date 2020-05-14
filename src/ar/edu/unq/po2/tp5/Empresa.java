package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Empresa implements Agencia {
	
	private String nombre;
	private ArrayList<Factura> facturas;

	public Empresa(String nombre) {
		this.nombre = nombre;
		this.facturas = new ArrayList();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public void registrarPago(Factura factura) {
		facturas.add(factura);
	}

}
