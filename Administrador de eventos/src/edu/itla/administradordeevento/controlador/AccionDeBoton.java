package edu.itla.administradordeevento.controlador;

import edu.itla.administradordeevento.main.Main;

public class AccionDeBoton {
	
	public void salir(){
		
		System.exit(0);
	}
	
	public void AgregarVisitante(){
		
		Main.getVentanaPrincipal().getLblSubTitutoVisitante().setText("Agregar nuevo visitante"); // Subtitulo de la ventana Fijo
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); // Se concateno el nombre de la ventana Opciones visitante
		Main.getVentanaPrincipal().getPnlAgregarVisitante().setVisible(true);// Se concateno el nombre de la ventana Agregar Visitante visitante
	}

}
