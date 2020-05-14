package ar.edu.unq.po2.tp5;

public class ProductoEmpresaTradicional extends Producto {
	
	public ProductoEmpresaTradicional(Double precio, Integer stock) {
		super(precio, stock);
	}
	
	public Double getPrecio() {
		return super.getPrecio();
	}
	
	public Integer getStock() {
		return super.getStock();
	}
	
	public Double precioTotal() {
		return getPrecio();
	}

}
