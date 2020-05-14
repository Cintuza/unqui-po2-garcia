package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoEmpresaTradicionalTest {
	
	private ProductoEmpresaTradicional yerbaRosaMonte;

	@BeforeEach
	public void setUp() {
		yerbaRosaMonte = new ProductoEmpresaTradicional(230d, 5);
	}
	
	@Test
	public void testCreacionProductoEmpresaTradicional() {
		Double precio = yerbaRosaMonte.precioTotal();
		Integer stock = yerbaRosaMonte.getStock();
		assertEquals(230d, precio);
		assertEquals(5, stock);
	}

}
