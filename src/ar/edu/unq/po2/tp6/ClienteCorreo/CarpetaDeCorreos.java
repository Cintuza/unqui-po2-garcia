package ar.edu.unq.po2.tp6.ClienteCorreo;

import java.util.*;

public class CarpetaDeCorreos {
	
	private ArrayList<Correo> correos;
	private String nombreCarpeta;
	
	public CarpetaDeCorreos(String nombreCarpeta) {
		this.correos = new ArrayList();
		this.nombreCarpeta = nombreCarpeta;
	}
	
	/**
	 * Elimina un correo de la lista de la variable correos
	 */
	public void borrar(Correo correo) {
		correos.remove(correo);
	}
	
	/**
	 * Cuenta la cantidad de correos que posee la CarpetaDeCorreos
	 * @return un int que representa la cantidad elementos de la variable correos
	 */
	public int contarCorreos() {
		return correos.size();
	}
	
	/**
	 * Agrega un correo a la lista de la variable correos
	 * @param correo Una instancia de la clase {@Correo}
	 */
	public void agregar(Correo correo) {
		correos.add(correo);
	}

}
