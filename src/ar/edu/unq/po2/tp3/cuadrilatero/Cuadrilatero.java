package ar.edu.unq.po2.tp3.cuadrilatero;

import ar.edu.unq.po2.tp3.Point;

public abstract class Cuadrilatero {

	private Point esquinaSuperiorIzquierda;
	
	public Cuadrilatero(Point esquinaSuperiorIzquierda) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
	}

	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	public void setEsquinaSuperiorIzquierda(Point esquinaSuperiorIzquierda) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
	}
	
	public abstract float area();
	
	public abstract float perimetro();
}
