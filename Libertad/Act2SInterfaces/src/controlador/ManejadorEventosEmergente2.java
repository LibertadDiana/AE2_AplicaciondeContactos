package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import vista.Ventana;
import vista.VentanaEmergente;
import vista.VentanaEmergente2;

public class ManejadorEventosEmergente2 implements ActionListener{
	
	public DefaultTableModel getModelo() {
		return modelo;
	}

	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}

	private VentanaEmergente2 ventanaEmergente2;
	private  DefaultTableModel modelo;
	
	public ManejadorEventosEmergente2(VentanaEmergente2 ventanaEmergente2) {
		this.ventanaEmergente2 = ventanaEmergente2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	//	JButton boton = (JButton) e.getSource();
	//	ventana.setTitle(boton.getText());
		
		if (e.getSource()== ventanaEmergente2.getBotonOk()) 
		{
			String nombre = ventanaEmergente2.getTextNombre().getText();
			String telefono = ventanaEmergente2.getTextTelefono().getText();
			modelo.addRow(new Object[] {ventanaEmergente2.getTextNombre().getText(), ventanaEmergente2.getTextTelefono().getText()});
		}
	}
}
