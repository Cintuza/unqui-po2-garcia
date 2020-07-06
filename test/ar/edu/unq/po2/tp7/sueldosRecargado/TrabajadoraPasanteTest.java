package ar.edu.unq.po2.tp7.sueldosRecargado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrabajadoraPasanteTest {
	
	private TrabajadoraPasante trabajadora;

	@Test
	void test() {
		trabajadora = new TrabajadoraPasante(20d);
		
		assertEquals(696, trabajadora.sueldo());
	}

}
