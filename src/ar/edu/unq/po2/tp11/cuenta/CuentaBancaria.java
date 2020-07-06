package ar.edu.unq.po2.tp11.cuenta;

public abstract class CuentaBancaria {
	protected HistorialMovimientos historialDeMovimientos;
	protected Notificador notificador;
	protected int saldo;
	
	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.historialDeMovimientos = historialDeMovimientos;
		this.notificador = notificador;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}
	
	/*
	 * Se extrae de las subclases el codigo repetido y se deja en ellas la 
	 * condicion a cumplir
	 */
	public void extraer(Integer monto) {
		if (sePuedeExtraer(monto)) {
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		}
	}
	
	/*
	 * Metodo creado para generalizar la condicion de las subclases
	 */
	public abstract Boolean sePuedeExtraer(Integer monto);

}
