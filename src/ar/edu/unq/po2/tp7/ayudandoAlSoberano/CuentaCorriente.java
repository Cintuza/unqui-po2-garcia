package ar.edu.unq.po2.tp7.ayudandoAlSoberano;

public class CuentaCorriente extends CuentaBancaria {
	
	private int descubierto;

	public CuentaCorriente(String titular, int descubierto) {
		super(titular);
		this.descubierto = descubierto;
	}

	public int getDescubierto() {
		return this.descubierto;
	}
	
	/**
	 * Definicion de operacion primitiva definida como abstracta en la super clase.
	 */
	@Override
	protected boolean esExtraccionPermitida(int monto) {
		return this.getSaldo() + this.getDescubierto() >= monto;
	}
	
}