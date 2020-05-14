package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {
	
	private Double porcentajeDescuento;
	
	public ProductoCooperativa(Double precio, Integer stock) {
		super(precio, stock);
		this.porcentajeDescuento = 10d;
	}
	
	public Double getPrecio() {
		return super.getPrecio();
	}
	
	public Integer getStock() {
		return super.getStock();
	}

	public Double precioTotal() {
		Double descuento = getPrecio() * porcentajeDescuento / 100;
		return getPrecio() - descuento;
	}

}
