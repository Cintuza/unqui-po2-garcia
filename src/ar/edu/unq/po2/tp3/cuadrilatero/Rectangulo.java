package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	private Point esquinaSuperiorIzquierda;
	private float base;
	private float altura;

	/**
	 * Constructor de la clase Rectangulo
	 * @param esquinaSuperiorIzquierda da la posicion de esa esquina como clase {@code Point}
	 * @param base la base del rectangulo, tipo float
	 * @param altura la altura del rectangulo, tipo float
	 */
	public Rectangulo(Point esquinaSuperiorIzquierda, float base, float altura) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
		this.base = base;
		this.altura = altura;
		// TODO Auto-generated constructor stub
	}

	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	public float getBase() {
		return base;
	}

	public float getAltura() {
		return altura;
	}

	public void setEsquinaSuperiorIzquierda(Point esquinaSuperiorIzquierda) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * Devuelve el area del rectangulo, base * altura
	 */
	public float area() {
		return this.getBase() * this.getAltura();
	}

	/**
	 * Devuelve el perimetro del rectangulo, (base + altura) * 2
	 */
	public float perimetro() {
		return (this.getBase() + this.getAltura()) * 2;
	}

	/**
	 * Devuelve {@code true} si la base del rectangulo es menor a la altura.
	 * Devuelve {@code false} en caso contrario.
	 */
	public boolean esVertical() {
		boolean esVertical = true;
		if (this.getBase() > this.getAltura()) {
			esVertical = false;
		}
		return esVertical;
	}

	/**
	 * Devuelve {@code true} si la base del rectangulo es mayor a la altura.
	 * Devuelve {@code false} en caso contrario.
	 * Se obtiene negando el metodo {@code esVertical()}
	 */
	public boolean esHorizontal() {
		return !(this.esVertical());
	}

}
