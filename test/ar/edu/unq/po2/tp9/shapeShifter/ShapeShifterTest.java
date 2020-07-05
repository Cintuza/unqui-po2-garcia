package ar.edu.unq.po2.tp9.shapeShifter;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class ShapeShifterTest {

	private IShapeShifter shapeShifter1;
	private IShapeShifter shapeShifter2;
	private IShapeShifter shapeShifter3;
	private IShapeShifter shapeShifter4;
	private IShapeShifter shapeShifter5;
	private IShapeShifter shapeShifter6;
	
	@BeforeEach
	public void setUp() {
		shapeShifter1 = new ShapeShifter(1);
		shapeShifter2 = new ShapeShifter(2);
		shapeShifter3 = shapeShifter1.compose(shapeShifter2);
		shapeShifter4 = shapeShifter3.compose(shapeShifter2);
		shapeShifter6 = new ShapeShifter(3);
		shapeShifter5 = shapeShifter4.compose(shapeShifter6);
	}

	@Test
	void testLaProfundidadDeShapeShifter1Es0() {
		assertEquals(0, shapeShifter1.deepest());
	}

	@Test
	void testLaProfundidadDeShapeShifter5Es3() {
		assertEquals(3, shapeShifter5.deepest());
	}
	

	@Test
	void testLaProfundidadDeShape() {
		
		//assertEquals(1, shapeShifter4.flat().deepest());
		System.out.println(shapeShifter5.values());
	}

}
