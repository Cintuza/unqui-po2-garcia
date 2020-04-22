package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, Double precio) {
		super(nombre, precio);
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}

	@Override
	public Double getPrecio() {
		// descuento en porcentaje
		double porcentajeDeDescuento = 10;
		double precio = super.getPrecio();
		double descuento = precio * porcentajeDeDescuento / 100;
		return precio - descuento;
	}

	public String getNombre() {
		return super.getNombre();
	}

	public Boolean esPrecioCuidado() {
		return super.esPrecioCuidado();
	}

	public void aumentarPrecio(double aumento) {
		super.aumentarPrecio(aumento);;
	}
	
}
