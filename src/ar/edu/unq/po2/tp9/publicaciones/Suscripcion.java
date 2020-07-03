package ar.edu.unq.po2.tp9.publicaciones;

public interface Suscripcion {
	
	public Boolean esDeInteres(Articulo articulo);
	public void observarSistema(SistemaDePublicaciones sistema);
	public void updateInvestigadoras(Articulo articulo);
}
