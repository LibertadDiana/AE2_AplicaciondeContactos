package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import vista.Ventana;
import vista.VentanaEmergente;

public class ManejadorEventosEmergente implements ActionListener{
	
	public DefaultTableModel getModelo() {
		return modelo;
	}

	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}

	private VentanaEmergente ventanaEmergente;
	private  DefaultTableModel modelo;
	
	public ManejadorEventosEmergente(VentanaEmergente ventanaEmergente) {
		this.ventanaEmergente = ventanaEmergente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	//	JButton boton = (JButton) e.getSource();
	//	ventana.setTitle(boton.getText());
		
		if (e.getSource()== ventanaEmergente.getBotonOk()) 
		{
			String nombre = ventanaEmergente.getTextNombre().getText();
			String telefono = ventanaEmergente.getTextTelefono().getText();
			modelo.addRow(new Object[] {ventanaEmergente.getTextNombre().getText(), ventanaEmergente.getTextTelefono().getText()});
		}
	}
}
