package ar.edu.unq.po2.tp7.sueldosRecargado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrabajadoraDePlantaTest {
	
	private TrabajadoraDePlanta trabajadora;

	@Test
	void test() {
		trabajadora = new TrabajadoraDePlanta(3);
		
		assertEquals(3001.5, trabajadora.sueldo());
	}

}
