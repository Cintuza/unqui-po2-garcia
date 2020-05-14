package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {
	
	private Empresa aysa;
	private Empresa telecentro;

	@BeforeEach
	public void setUp() {
		aysa = new Empresa("Aysa");
		telecentro = new Empresa("Telecentro");
	}

	@Test
	void testNombreEmpresa() {
		assertEquals("Aysa", aysa.getNombre());
	}

}
