package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> catalogoDeProductos;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		catalogoDeProductos = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void agregarProducto(Producto producto) {
		this.catalogoDeProductos.add(producto);
	}

	public Integer getCantidadDeProductos() {
		int cantDeProductos = this.catalogoDeProductos.size();
		return cantDeProductos;
	}

	public Double getPrecioTotal() {
		double precioTotal = 0;
		for (int p = 0; p < catalogoDeProductos.size(); p++) {
			Producto producto = catalogoDeProductos.get(p);
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}

}
