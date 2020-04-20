package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	
	private Point punto1;
	private Rectangulo rect1;
	
	@BeforeEach
	public void setUp() {
		// Creacion del punto1 inicializado en la posicion (5,2)
		punto1 = new Point(5,2);
		
		// Creacion del rectangulo rect1 de base 5, altura 10 y con esquina superior izquierda posicionada en punto1
		rect1 = new Rectangulo(punto1, 5, 10);
		
	}

	// Chequea que el metodo area() para obtener el area de un Rectangulo sea correcto
	@Test
	public void testAreaRectangulo() {
		// Calculo el area del rectangulo rect1
		float base = rect1.area();
		
		// Corroboro que el resultado es el correcto
		assertEquals(50, base);
	}
	
	// Chequea que el metodo perimetro, para obtener el perimetro del rectangulo, funcione correctamente
	@Test
	public void testPerimetroRectangulo() {
		// Calculo el perimetro del rectangulo rect1
		float perimetro = rect1.perimetro();
		
		// Corroboro el resultado
		assertEquals(30, perimetro);
	}
	
	// Chequea que el rectangulo rect1 sea vertical
	@Test
	public void testEsVertical() {
		assertTrue(rect1.esVertical());
	}
	
	// Chequea que el rectangulo rect1 no sea horizontal
	@Test
	public void testEsHorizontal() {
		assertFalse(rect1.esHorizontal());
	}

}
