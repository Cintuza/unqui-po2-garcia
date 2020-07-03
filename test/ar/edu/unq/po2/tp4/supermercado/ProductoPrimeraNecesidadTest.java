package ar.edu.unq.po2.tp4.supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.supermercado.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 15d);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(6.8), leche.getPrecio());
	}
}