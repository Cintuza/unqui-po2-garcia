package ar.edu.unq.po2.tp9.publicaciones;

import java.util.*;
import java.util.stream.Collectors;

public class Articulo {
	
	private String titulo;
	private List<String> autoras;
	private List<String> filiacionDeAutoras;
	private String tipoDeArticulo;
	private String lugarDePublicacion;
	private List<String> palabrasClave;
	
	public Articulo(String titulo, List<String> autoras, List<String> filiacionDeAutoras, String tipoDeArticulo,
			String lugarDePublicacion, List<String> palabrasClave) {
		this.titulo = titulo;
		this.autoras = autoras;
		this.filiacionDeAutoras = filiacionDeAutoras;
		this.tipoDeArticulo = tipoDeArticulo;
		this.lugarDePublicacion = lugarDePublicacion;
		this.palabrasClave = palabrasClave;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	public Boolean fueEscritoPor(String autora) {
		return this.autoras.contains(autora);
	}

	public Boolean tieneAutoraPertenecienteA(String institucion) {
		return this.filiacionDeAutoras.contains(institucion);
	}

	public Boolean tienePalabraClave(String palabraClave) {
		return this.palabrasClave.contains(palabraClave);
	}

}
