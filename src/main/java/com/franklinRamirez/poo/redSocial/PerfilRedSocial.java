package com.franklinRamirez.poo.redSocial;

import java.util.ArrayList;
public class PerfilRedSocial {

	//Attributes 
	
	private String usuario;
	private String nombrePerfil;
	private String biografia;
	private String pais;
	private String ciudad;
	private int numeroSeguidores;
	private int numeroPublicaciones;
	private EstadoPerfil estadoPerfil;
	private boolean verificado;
	private ArrayList<Publicacion> listaPublicacion;
	
	
	//objetos
	
	public PerfilRedSocial() {
		super();
		this.listaPublicacion = new ArrayList<>();
	}
		
	public PerfilRedSocial(String usuario, String nombrePerfil, String biografia,String pais, String ciudad,
			int numeroSeguidores, int numeroPublicaciones, EstadoPerfil estado, boolean verificado) {
		super();
		this.usuario = usuario;
		this.nombrePerfil = nombrePerfil;
		this.biografia = biografia;
		this.pais = pais;
		this.ciudad = ciudad;
		this.numeroSeguidores = numeroSeguidores;
		this.numeroPublicaciones = numeroPublicaciones;
		this.estadoPerfil = estado;
		this.verificado = verificado;
		this.listaPublicacion = new ArrayList<>();
		
		
	}
	
	//getters y setters
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	public String getNombre() {
		return nombrePerfil;
	}
	public void setNombre(String nombrePerfil) {
		this.nombrePerfil =nombrePerfil;
	}
	
	
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia){
		this.biografia = biografia;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	} 
	
	public String  getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public int getNumeroSEguidores() {
		return numeroSeguidores;
	}
	public void setNumeroSeguidores(int numeroSeguidores){
		this.numeroSeguidores = numeroSeguidores;
	}
	
	public int getNumeroPublicaciones() {
		return numeroPublicaciones;
	}
	public void setNumeroPublicaciones(int numeroPublicaciones) {
		this.numeroPublicaciones = numeroPublicaciones;
	}
	
	
	public EstadoPerfil getEstadoPerfil() {
		return estadoPerfil;
	}
	public void setEstadoPerfil(EstadoPerfil estadoPerfil) {
		this.estadoPerfil = estadoPerfil;
	}
	
	public boolean isVerificado() {
		return verificado;
	}
	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}
	
	public ArrayList<Publicacion> getListaPublicacion() {
		return listaPublicacion;
	}
	public void setListaPublicacion(ArrayList<Publicacion> listaPublicacion) {
		this.listaPublicacion = listaPublicacion;
	}
	
	
	
	//metodos
	
	public void mostrarInformacion() {
		System.out.println("[%s] %s (%d likes)");
		System.out.println(this.nombrePerfil + "(@" +this.usuario+ ")" );	
	}
	
	public boolean isActivo() {
		return this.estadoPerfil==EstadoPerfil.ACTIVADO;
	}
	
	public void addSeguidores(int numeroSeguidores) {
		this.numeroSeguidores+=numeroSeguidores;
	}
	
	public void crearPublicaciones(String mensaje) {
		Publicacion p = new Publicacion(mensaje);
		this.listaPublicacion.add(p);
	}
	
	public void mostarPublicaciones() {
		this.listaPublicacion.stream().forEach(p->p.mostrar());
	}
}
