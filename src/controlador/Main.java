package controlador;

import vista.VentanaPrincipal;

public class Main {

	public static void main(String[] args) {
	

		VentanaPrincipal miventana = new VentanaPrincipal();
		Controlador controlador = new Controlador(miventana);
		miventana.setControlador(controlador);
	}

}
