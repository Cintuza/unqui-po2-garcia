package ar.edu.unq.po2.tp11.cuenta;

public class CuentaCorriente extends CuentaBancaria{
	private Integer limiteDescubierto;
	
	public CuentaCorriente(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo, Integer limiteDescubierto) {
		super(historialDeMovimientos, notificador, saldo);
		this.limiteDescubierto = limiteDescubierto;
	}
	
	@Override
	public Boolean sePuedeExtraer(Integer monto) {
		return this.saldo + this.limiteDescubierto >= monto;
	}
	
}