package ar.edu.unq.po2.tp6.SolicitudesCreditoTest;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer edad;
	private Double sueldoNeto;
	
	public Cliente(String nombre, String apellido, String direccion, Integer edad, Double sueldoNeto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		setEdad(edad);
		setSueldoNeto(sueldoNeto);
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public Double getSueldoNeto() {
		return sueldoNeto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setEdad(Integer edad) {
		if (edad <= 18) {
			throw new IllegalArgumentException("La persona tiene que ser mayor de 18 anos");
		}
		this.edad = edad;
	}

	public void setSueldoNeto(Double sueldoNeto) {
		if (sueldoNeto < 0) {
			throw new IllegalArgumentException("El sueldo neto no puede ser negativo");
		}
		this.sueldoNeto = sueldoNeto;
	}

	public Double sueldoNetoAnual() {
		Double netoAnual = getSueldoNeto() * 12;
		return netoAnual;
	}
	

}
