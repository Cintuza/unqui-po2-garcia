package ar.edu.unq.po2.tp3;

public class Point {
	
	private float x;
	private float y;
	
	public Point() {
		this.setXY(0, 0);
	}

	public Point(float x, float y) {
		this.setXY(x, y);
	}
	
	public void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	/**
	 * Mueve un punto a la posicion x, y
	 * @param x 
	 * @param y
	 */
	public void moveTo(float x, float y) {
		this.setXY(x, y);
	}

	/**
	 * Suma las posiciones del punto Point y otherPoint y asigna dicha posicion a un nuevo punto
	 * @param otherPoint otro punto de posicion (x, y)
	 * @return un punto nuevo con la posicion que surge de la suma de las posiciones de los puntos anteriores 
	 */
	public Point addPoint(Point otherPoint) {
		// Sumo las posiciones de los puntos y la asigno a las variables x, y
		float x = this.getX() + otherPoint.getX();
		float y = this.getY() + otherPoint.getY();
		
		// Asigno la posicion obtenida a un nuevo punto
		Point newPoint = new Point(x,y);
		
		return newPoint;
	}
	

}
