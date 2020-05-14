package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoTest {
	
	private Empresa agip;
	private Empresa afip;
	
	private Impuesto rentas;
	private Impuesto monotributo;

	@BeforeEach
	public void setUp() {
		agip = new Empresa("AGIP");
		afip = new Empresa("AFIP");
		
		rentas = new Impuesto(agip, 800d);
		monotributo = new Impuesto(afip, 1000d);
	}

	@Test
	void test() {
		Double costoRentas = rentas.precioTotal();
		Double costoMonostributo = monotributo.precioTotal();
		
		assertEquals(800, costoRentas);
		assertEquals(1000, costoMonostributo);
	}

}
