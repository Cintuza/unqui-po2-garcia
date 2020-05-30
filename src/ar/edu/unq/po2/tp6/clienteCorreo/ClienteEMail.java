package ar.edu.unq.po2.tp6.clienteCorreo;

import java.util.*;

public class ClienteEMail {
	
	 IServidorBasico servidor;
	 String nombreUsuario;
	 String passusuario;
	 CasillaDeCorreos casillaDeCorreos;
	
	public ClienteEMail(IServidorBasico servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.casillaDeCorreos = new CasillaDeCorreos();
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void recibirNuevos(){
		List<Correo> correosNuevos = this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
		casillaDeCorreos.almacenarNuevos(correosNuevos);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}
