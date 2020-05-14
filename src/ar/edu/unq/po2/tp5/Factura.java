package ar.edu.unq.po2.tp5;

public abstract class Factura implements Articulo {

	private Agencia agencia;
	//private Double precio;
	
	public Factura(Agencia agencia) {
		this.agencia = agencia;
		//this.precio = precio;
	}
	
	public Double precioTotal() {
		return 0d;
	}
	
	public void actualizarEstado() {
		agencia.registrarPago(this);
	}
	
}
