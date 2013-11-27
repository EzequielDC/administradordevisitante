package edu.itla.administradordeevento.usuario;

import edu.itla.administradordeevento.controlador.ControladorDeVentana;
import edu.itla.administradordeevento.basededato.ResultadosBD;

public class PerfilUsuario extends Usuario{
	
	ResultadosBD saber = new ResultadosBD();
	String permisos; // Almacenar tipo de perfil
	ControladorDeVentana ventana; // Controlador de ventana para habilitar acceso determinado
	String[] roll = { // Tipos de perfil
			"Administrador", "Portero"
	};
	
	public String permisoDeUsuario() {
		
		// Comparar los roles con el usuario logiado
		for(String comprobar : roll){
			if(comprobar.equals(saber.getUsuario())){ 
				permisos = comprobar;
			}
		}
		// Dar accesos determinados
		return permisos;

	}

	public String[] getRoll() {
		return roll;
	}
}