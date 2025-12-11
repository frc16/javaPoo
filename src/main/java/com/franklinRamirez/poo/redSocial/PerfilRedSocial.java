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
	private EstadoPerfil estadoPerfil;
	private boolean verificado;
	private ArrayList<Publicacion> listaPublicacion;
	
	
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
	
	public void mostrarPublicacion() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
}
