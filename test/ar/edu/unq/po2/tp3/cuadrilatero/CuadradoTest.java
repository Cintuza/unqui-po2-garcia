package ar.edu.unq.po2.tp3.cuadrilatero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

class CuadradoTest {
	
	private Point punto1;
	private Cuadrado cuadrado;
	
	@BeforeEach
	public void setUp() {
		// Creacion del punto1 inicializado en la posicion (5,2)
		punto1 = new Point(5,2);
		
		// Creacion del cuadrado rect1 de base 5, altura 10 y con esquina superior izquierda posicionada en punto1
		cuadrado = new Cuadrado(punto1, 4);
		
	}

	// Chequea que el metodo area() para obtener el area de un cuadrado sea correcto
	@Test
	public void testAreaCuadrado() {
		// Calculo el area del cuadrado
		float base = cuadrado.area();
		
		// Corroboro que el resultado es el correcto
		assertEquals(16, base);
	}
	
	// Chequea que el metodo perimetro, para obtener el perimetro del cuadrado, funcione correctamente
	@Test
	public void testPerimetroCuadrado() {
		// Calculo el perimetro del cuadrado
		float perimetro = cuadrado.perimetro();
		
		// Corroboro el resultado
		assertEquals(16, perimetro);
	}

}
