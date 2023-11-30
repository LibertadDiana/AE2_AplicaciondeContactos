package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import vista.Ventana;
import vista.VentanaEmergente;
import vista.VentanaEmergente2;

public class ManejadorEventos implements ActionListener{
	
	private Ventana ventana;
	private DefaultTableModel modelo;
	
	public ManejadorEventos(Ventana ventana) {
		this.ventana = ventana;
		InicializarTabla();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	//	JButton boton = (JButton) e.getSource();
	//	ventana.setTitle(boton.getText());
		if (e.getSource()== ventana.getBotonAñadirConacto()) 
		{
			new VentanaEmergente(modelo);
		}
		else if (e.getSource()== ventana.getBotonEditarContacto())
		{
			new VentanaEmergente2(modelo);
		}
		else if (e.getSource()== ventana.getBotonEliminarContacto())
		{
		
		}
	}
	
	private void InicializarTabla()
	{
		modelo = new DefaultTableModel();
		modelo.addColumn("Nombre");
		modelo.addColumn("Telefono");
		modelo.addRow(new Object[] {"Carlota", "606570599"});
		modelo.addRow(new Object[] {"Alejandro", "665148279"});
		modelo.addRow(new Object[] {"Javier", "665148230"});
		modelo.addRow(new Object[] {"Vicente", "665148231"});
		modelo.addRow(new Object[] {"Lucia", "665148239"});
		modelo.addRow(new Object[] {"Jose", "665148248"});
		modelo.addRow(new Object[] {"Pedro", "665148242"});
		modelo.addRow(new Object[] {"Maria", "606570599"}); 
		ventana.getTabla().setModel(modelo);
	}
	

}
