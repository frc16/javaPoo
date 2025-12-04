package com.franklin.poo.basic;

import java.util.Scanner; 
public class TareaSimple {
	int duracionEnHoras;
	String titulo;
	boolean completado;
	
	
	public TareaSimple() {
		
	}
	
	public TareaSimple(String titulo, int duracionEnHoras){
		this.titulo = titulo;
		this.duracionEnHoras = duracionEnHoras;	
	}
	 
	
	public int getDuracionEnHoras() {
		return duracionEnHoras;
	}
	public void setDuracionEnHoras(int duracionEnHoras) {
		this.duracionEnHoras = duracionEnHoras;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public boolean isCompletado() {
		return completado;
	}
	public void setCompletado(boolean completado) {
		this.completado = completado;
	}
	
	
	public void mostrarTarea() {
    
		System.out.println("esta es la tarea simple 1");
}
	
	public void cambiarEstado() {
		if(this.completado) {
	this.completado=false;
	
}else {
	this.completado=true;}
}
}