package ar.edu.unq.po2.tp10.encriptador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class EncriptadorNaiveTest {

	private ReemplazoPorNumeros modoReemplazoPorNumeros;
	private CambioDeVocales modoCambioDeVocales;
	private EncriptadorNaive encriptador;
	
	@BeforeEach
	public void setUp() {
		modoReemplazoPorNumeros = new ReemplazoPorNumeros();
		modoCambioDeVocales = new CambioDeVocales();
	}

	@Test
	void testEncriptaConModoReemplazoPorNumeros() {
		encriptador = new EncriptadorNaive(modoReemplazoPorNumeros);
		
		assertEquals("12,5,0,16,21,19,5,0,3,21,3,1", encriptador.encriptar("Le puse Cuca"));
	}

	@Test
	void testDesencriptaConModoReemplazoPorNumeros() {
		encriptador = new EncriptadorNaive(modoReemplazoPorNumeros);
		
		assertEquals("le puse cuca", encriptador.desencriptar("12,5,0,16,21,19,5,0,3,21,3,1"));
	}

	@Test
	void testEncriptarConModoCambioDeVocales() {
		encriptador = new EncriptadorNaive(modoCambioDeVocales);
		
		assertEquals("Eirupairtu", encriptador.encriptar("Aeropuerto"));
	}

	@Test
	void testDesncriptarConModoCambioDeVocales() {
		encriptador = new EncriptadorNaive(modoCambioDeVocales);
		
		assertEquals("Aeropuerto", encriptador.desencriptar("Eirupairtu"));
	}
}
