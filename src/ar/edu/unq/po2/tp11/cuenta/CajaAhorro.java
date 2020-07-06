package ar.edu.unq.po2.tp11.cuenta;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	@Override
	public Boolean sePuedeExtraer(Integer monto) {
		return this.saldo >= monto;
	}
	

}