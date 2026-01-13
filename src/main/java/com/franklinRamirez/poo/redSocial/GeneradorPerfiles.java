package com.franklinRamirez.poo.redSocial;

public class GeneradorPerfiles {
	
	public static PerfilRedSocial crearPerfilPrueba (String usuario) {
		PerfilRedSocial p = new PerfilRedSocial();
		p.setUsuario(usuario);
		p.setCiudad("Madrid");
		
		return p;
	}
	
	public static PerfilRedSocial CrearPerfilPruebaConPublicaciones(String usuario,int numeroPublicaciones) {
		PerfilRedSocial p1 = crearPerfilPrueba(usuario);
		int contador = 0;
		for(int i=0; i<numeroPublicaciones; i++) {
			
			contador += i;
			
		}
	
		return p1;
	}

	
	//public static PerfilRedSocial CrearPerfilRedSocialCon
}
