package ar.edu.unq.po2.tp5;

public abstract class Producto implements Articulo {
	
	private Double precio;
	private Integer stock;
	
	public Producto(Double precio, Integer stock) {
		setPrecio(precio);
		setStock(stock);
	}
	
	public void setStock(Integer nuevoStock) {
		stock = nuevoStock;
		
	}

	public void setPrecio(Double nuevoPrecio) {
		precio = nuevoPrecio;
	}

	public Double getPrecio() {
		return precio;
	}
	
	public Integer getStock() {
		return stock;
	}
	
	public Double precioTotal() {
		return getPrecio();
	}

	public void disminuirStock() {
		stock -= 1;
	}

	public void actualizarEstado() {
		disminuirStock();
	}

}
