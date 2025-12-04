package com.franklin.poo.basic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TareaSimple objeto1 = new TareaSimple();
		
		objeto1.titulo = "nueva tarea";
		objeto1.completado= true;
		System.out.println("este es el titulo: " + objeto1.titulo);
		
		TareaSimple objeto2 = new TareaSimple("primero", 10);
		
	System.out.println("este es otro objeto: " + objeto2.titulo + objeto2.duracionEnHoras);

	System.out.println("-------------");
	
	 objeto1.mostrarTarea();
      
	 System.out.println("-----------------");
	 
	 objeto1.cambiarEstado();
	}
}

	


