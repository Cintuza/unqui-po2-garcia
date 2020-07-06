package ar.edu.unq.po2.tp7.ayudandoAlSoberano;

public class CajaDeAhorro extends CuentaBancaria {
	private int limite;

	public CajaDeAhorro(String titular, int limite) {
		super(titular);
		this.limite = limite;
	}

	public int getLimite() {
		return this.limite;
	}

	/**
	 *Definicion de operacion primitiva definida como abstracta en la super clase.
	 */
	@Override
	protected boolean esExtraccionPermitida(int monto) {
		return this.getSaldo() >= monto && this.getLimite() >= monto;
	}
}