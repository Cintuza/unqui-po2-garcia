package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {
	
	private Double montoTotal;
	
	public Caja() {
		montoTotal = 0d;
	}

	public void registrar(Articulo articulo) {
		sumarPrecio(articulo);
		articulo.actualizarEstado();
	}
	
	private void sumarPrecio(Articulo articulo) {
		Double precio = articulo.precioTotal();
		montoTotal += precio;
	}
	
	public Double montoTotal() {
		return montoTotal;
	}
	
	
}
