package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTest {
	
	private ProductoCooperativa yerbaPlayadito;

	@BeforeEach
	public void setUp() {
		yerbaPlayadito = new ProductoCooperativa(200d, 4);
	}
	
	@Test
	void testCreacionProductoCoop() {
		Double precio = yerbaPlayadito.precioTotal();
		Integer stock = yerbaPlayadito.getStock();
		assertEquals(180d, precio);
		assertEquals(4, stock);
	}

}
