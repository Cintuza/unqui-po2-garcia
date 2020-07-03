package ar.edu.unq.po2.tp3.cuadrilatero;

import ar.edu.unq.po2.tp3.Point;

public class Cuadrado extends Cuadrilatero {
	
	private float largoDeLosLados;

	public Cuadrado(Point esquinaSuperiorIzquierda, float largoDeLosLados) {
		super(esquinaSuperiorIzquierda);
		this.largoDeLosLados = largoDeLosLados;
	}

	public float getLargoDeLosLados() {
		return largoDeLosLados;
	}

	@Override
	public float area() {
		return largoDeLosLados * largoDeLosLados;
	}

	@Override
	public float perimetro() {
		return largoDeLosLados * 4;
	}

}
