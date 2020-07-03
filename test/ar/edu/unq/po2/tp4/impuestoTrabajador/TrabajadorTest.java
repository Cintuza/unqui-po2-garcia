package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	
	private Trabajador trabajador;
	private Ingreso ingresoEnero;
	private IngresoPorHorasExtras ingresoEneroExtras;
	private Ingreso ingresoFebrero;
	private Ingreso ingresoMarzo;
	
	@BeforeEach
	public void setUp() {
		ingresoEnero = new Ingreso("Enero", "Sueldo", 40000d);
		ingresoEneroExtras = new IngresoPorHorasExtras("Enero", "Horas extras", 5000d, 12);
		ingresoFebrero = new Ingreso("Febrero", "Sueldo", 40000d);
		ingresoMarzo = new Ingreso("Marzo", "Sueldo", 40000d);
		trabajador = new Trabajador();
		trabajador.agregar(ingresoEnero);
		trabajador.agregar(ingresoEneroExtras);
		trabajador.agregar(ingresoFebrero);
		trabajador.agregar(ingresoMarzo);
	}

	@Test
	public void testTotalMontoPercibido() {
		Double monto = trabajador.getTotalPercibido();
		assertEquals(125000, monto);
	}
	
	@Test
	public void testTotalMontoImponible() {
		Double monto = trabajador.getMontoImponible();
		assertEquals(120000, monto);
	}
	
	@Test
	public void testImpuestoAPagar() {
		Double impuesto = trabajador.getImpuestoAPagar();
		assertEquals(2400, impuesto);
	}

}
