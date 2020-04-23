package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private Double descuento;

	public ProductoPrimeraNecesidad(String nombre, Double precio, Double descuento) {
		super(nombre, precio);
		this.descuento = descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado, Double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
	public Double getDescuento() {
		return descuento;
	}

	@Override
	public Double getPrecio() {
		double precio = super.getPrecio();
		double descuento = precio * getDescuento() / 100;
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
