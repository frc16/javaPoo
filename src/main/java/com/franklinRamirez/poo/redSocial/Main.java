package com.franklinRamirez.poo.redSocial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss")));
		System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss")));
		System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy - hh:mm:ss")));
	
		Publicacion p = new Publicacion("Este mensaje es de prueba");
		p.mostrar();
		p.darMeGusta();
		p.mostrar();
	

	}

}
