package ar.edu.unq.po2.tp7.sueldosRecargado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrabajadoraTemporariaTest {
	
	private TrabajdoraTemporaria trabajadora;

	@Test
	void testTrabajadoraSinConyugeConHijes() {
		trabajadora = new TrabajdoraTemporaria(20d, 2, false);
		
		assertEquals(1044, trabajadora.sueldo());
	}

}
