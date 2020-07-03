package ar.edu.unq.po2.tp4.supermercado;

public class Producto {
	
	private String nombre;
	private Double precio;
	private Boolean esPrecioCuidado = false;
	
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, Double precio, Boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public Double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}

	public Boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void aumentarPrecio(double aumento) {
		precio += aumento;
	}

}
