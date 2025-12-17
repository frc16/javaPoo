package com.franklinRamirez.poo.redSocial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Publicacion {
	private static final DateTimeFormatter DATE_TIME_FORMATTER =DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");

	private String texto;
	private LocalDateTime hora; 
	private int likes;
	
	//constructor
	
	public Publicacion(String texto){
		this.texto = texto;
		this.hora = LocalDateTime.now();
		this.likes = 0;	
	}
	
	public Publicacion(String texto, LocalDateTime hora, int likes) {
		super();
		this.texto = texto;
		this.hora = hora;
		this.likes = likes;
	}
	
	public Publicacion() {
		super();
	}
	
	//getters y setters
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	public LocalDateTime getHora() {
		return hora;
	}
	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}
	
	
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	//Method 
	public void mostrar() {
		System.out.printf("[%s]%s (%d likes)%n", this.formatearHora(), this.texto,this.likes);
	}
	
	private String  formatearHora() {
		return this.hora.format(DATE_TIME_FORMATTER);
	}
	
	public void darMeGusta() {
		this.likes++;
	}
	
	
	
	
	

}

