package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	
	private Point emptyPoint;
	private Point point;
	private Point otherPoint;
	
	@BeforeEach
	public void setUp() {
		// Crea un punto en (0,0)
		emptyPoint = new Point();
		
		// Crea un punto en (3,5)
		point = new Point (3,5);
		
		// Crea un punto en (3,5)
		otherPoint = new Point (7,2);
	}

	// Testea que funcione el constructor sin parametros que genera un punto en (0,0)
	@Test
	public void testConstructorWithoutParameters() {
		float x = emptyPoint.getX();
		float y = emptyPoint.getY();
		assertEquals(0, x);
		assertEquals(0, y);
	}
	
	// Testea que funcione el constructor con parametros que genera un punto en (x,y)
	@Test
	public void testConstructorWithParameters() {
		float x = point.getX();
		float y = point.getY();
		assertEquals(3, x);
		assertEquals(5, y);
	}
	
	// Chequea si al mover un punto queda en la posicion indicada
	@Test
	public void testMovingPoint() {
		// Se mueve el punto a la posicion (4,6)
		point.moveTo(4,6);
		
		float x = point.getX();
		float y = point.getY();
		
		// Se corrobora que la posicion del punto sea la correcta
		assertEquals(4, x);
		assertEquals(6, y);
	}
	
	// Chequea la creacion de un nuevo punto que surge de la suma de dos puntos
	@Test
	public void testAddingPoints() {
		// Nuevo punto a partir de la suma de point y otherPoint
		Point newPoint = point.addPoint(otherPoint);

		float x = newPoint.getX();
		float y = newPoint.getY();
		
		// Se corrobora que la posicion del punto sea la correcta
		assertEquals(10, x);
		assertEquals(7, y);
	}

}
