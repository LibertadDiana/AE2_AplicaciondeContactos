package controlador;

import vista.GestorContactos;

public class Main {
	
	
	/*
	 * Clase Main
	 * 
	 * Mediante esta clase, se consigue la conexión entra las ventanas
	 * y le controlador, a través de la creación de los objetos correspondientes.
	 */
	public static void main(String[] args) {
		
		GestorContactos ventana1 = new GestorContactos();
		Controlador controlador = new Controlador (ventana1);
		ventana1.setControlador(controlador);
	}

}

