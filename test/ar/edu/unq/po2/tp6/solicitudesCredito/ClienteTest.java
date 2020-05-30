package ar.edu.unq.po2.tp6.solicitudesCredito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ClienteTest {
	
	private Cliente gloria;
	
	@BeforeEach
	public void setUp() {
		
		gloria = new Cliente("Gloria", "Vazquez", "Aguero 800", 54, 35000d);
				
	}

	//Chequea la creacion de instancia de clase cliente con todos los datos correctos
	@Test
	void testConstruirClienteCorrecto() {
		//setUp
		String nombre = gloria.getNombre();
		String apellido = gloria.getApellido();
		String direccion = gloria.getDireccion();
		Integer edad = gloria.getEdad();
		Double sueldoNeto = gloria.getSueldoNeto();
		
		//verify
		assertEquals("Gloria", nombre);
		assertEquals("Vazquez", apellido);
		assertEquals("Aguero 800", direccion);
		assertEquals(54, edad);
		assertEquals(35000, sueldoNeto);
	}
	
	//Chequea que se lance una excepcion cuando la edad sea menor de lo permitido
	@Test
	void testConstruirClienteFallaPorEdad() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Cliente beto = new Cliente("Beto", "Gonzalez", "Puerto de Palos 515", 15, 18000d);
		});
	}
	
	//Chequea que se lance una excepcion cuando el sueldo sea negativo
	@Test
	void testConstruirClienteFallaPorSueldo() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Cliente camila = new Cliente("Camila", "Perez", "Pringles 600", 25, -8000d);
		});
	}
	
	@Test
	void testSueldoNetoAnual() {
		//execute
		Double netoAnual = gloria.sueldoNetoAnual();
		
		//verify
		assertEquals(420000, netoAnual);
	}

}
