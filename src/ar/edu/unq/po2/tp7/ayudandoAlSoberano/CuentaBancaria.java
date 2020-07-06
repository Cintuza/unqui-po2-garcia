package ar.edu.unq.po2.tp7.ayudandoAlSoberano;

import java.util.*;

public abstract class CuentaBancaria {
	private String titular;
	private int saldo;
	private List<String> movimientos;

	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
		this.movimientos = new ArrayList<String>();
	}

	public String getTitular() {
		return this.titular;
	}

	public int getSaldo() {
		return this.saldo;
	}

	protected void setSaldo(int monto) {
		this.saldo = monto;
	}

	public void agregarMovimientos(String movimiento) {
		this.movimientos.add(movimiento);
	}

	public  void extraer(int monto) {
		if (esExtraccionPermitida(monto)) {
			this.setSaldo(this.getSaldo() - monto);
			this.agregarMovimientos("Extraccion");
		}
	}
	
	/**
	 * Se agrega metodo abstracto para que cumpla con template method
	 * @param monto de la extraccion
	 * @return boolean True si se puede extraer el moto recibido por parametro
	 */
	protected abstract boolean esExtraccionPermitida(int monto);
}
