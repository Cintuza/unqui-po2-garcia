package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicioTest {
	
	private Empresa aysa;
	private Empresa telecentro;
	
	private Servicio agua;
	private Servicio internet;

	@BeforeEach
	public void setUp() {
		aysa = new Empresa("Aysa");
		telecentro = new Empresa("Telecentro");
		
		agua = new Servicio(aysa, 10.5d, 24);
		internet = new Servicio(telecentro, 3d, 400);
	}
	
	@Test
	public void testServicios() {
		Double costoAgua = agua.precioTotal();
		Double costoInternet = internet.precioTotal();
		
		assertEquals(252, costoAgua);
		assertEquals(1200, costoInternet);
	}

}
