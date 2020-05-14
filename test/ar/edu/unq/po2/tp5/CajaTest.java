package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private Caja caja1;
	
	private ProductoEmpresaTradicional yerbaRosaMonte;
	private ProductoCooperativa yerbaPlayadito;
	private ProductoEmpresaTradicional lecheSerenisima;
	
	private Empresa afip;
	private Empresa aysa;

	private Servicio agua;
	private Impuesto monotributo;

	@BeforeEach
	public void setUp() {
		caja1 = new Caja();

		yerbaRosaMonte = new ProductoEmpresaTradicional(230d, 5);
		yerbaPlayadito = new ProductoCooperativa(200d, 4);
		lecheSerenisima = new ProductoEmpresaTradicional(55d, 11);
		
		afip = new Empresa("AFIP");
		aysa = new Empresa("Aysa");

		agua = new Servicio(aysa, 10.5d, 24);
		monotributo = new Impuesto(afip, 1000d);
		
		caja1.registrar(yerbaRosaMonte);
		caja1.registrar(yerbaPlayadito);
		caja1.registrar(lecheSerenisima);
		caja1.registrar(lecheSerenisima);
		caja1.registrar(agua);
		caja1.registrar(monotributo);
	}

	@Test
	void testRegistrarCompra() {
		assertEquals(1772, caja1.montoTotal());
		assertEquals(4, yerbaRosaMonte.getStock());
		assertEquals(3, yerbaPlayadito.getStock());
		assertEquals(9, lecheSerenisima.getStock());
	}

}
