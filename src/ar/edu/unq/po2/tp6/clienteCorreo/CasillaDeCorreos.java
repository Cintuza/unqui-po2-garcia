package ar.edu.unq.po2.tp6.ClienteCorreo;

import java.util.*;

public class CasillaDeCorreos {

	private CarpetaDeCorreos inbox;
	private CarpetaDeCorreos borrados;
	
	public CasillaDeCorreos() {
		this.inbox = new CarpetaDeCorreos("Inbox");
		this.borrados = new CarpetaDeCorreos("Borrados");
	}
	
	/**
	 * Elimina un correo de su carpeta correspondiente.
	 * El correo ademas se agrega a la carpeta Borrados,
	 * a no ser que el correo se este borrando de esa carpeta.
	 * @param carpeta Carpeta en la que se encuentra el correo a eliminar
	 * @param correo Objeto de clase Correo
	 */
	public void borrarCorreo(CarpetaDeCorreos carpeta, Correo correo) {
		carpeta.borrar(correo);
		if (!carpeta.equals(borrados)) {
			borrados.agregar(correo);
		}
	}
	
	/**
	 * Devuelve la cantidad de correos que contiene una carpeta.
	 * @param carpeta 
	 * @return Un int que representa la cantidad de correos del parametro carpeta
	 */
	public int contarCorreos(CarpetaDeCorreos carpeta) {
		return carpeta.contarCorreos();
	}
	
	/**
	 * Dada una lista de correos, los guarda en la carpeta inbox
	 * @param correos Coleccion de tipo List con elementos de la clase Correo
	 */
	public void almacenarNuevos(List correos) {
		List<Correo> correosNuevos = correos;
		for (Correo correo : correosNuevos) {
			inbox.agregar(correo);
		}
	}

}
