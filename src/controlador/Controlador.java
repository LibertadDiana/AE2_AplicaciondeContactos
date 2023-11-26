package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import vista.VentanaPrincipal;
import vista.VentanaSecundaria;
import vista.VentanaTerciaria;

public class Controlador implements ActionListener{

	
	private VentanaPrincipal vistaApp1 ;
	public Controlador(VentanaPrincipal vista1) {
		this.vistaApp1 = vista1;
		
	}
	
	private VentanaSecundaria vistaApp2 ;
	public Controlador(VentanaSecundaria vista2) {
		this.vistaApp2 = vista2;
		
	}

	
	private VentanaTerciaria vistaApp3 ;
	public Controlador(VentanaTerciaria vista3) {
		this.vistaApp3 = vista3;
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			if(e.getSource() == vistaApp1.getAddContacto()) {
				
				vistaApp2 = new VentanaSecundaria(this);
				vistaApp2.setVisible(true);
			}
			
			if(e.getSource() == vistaApp2.getBotonOk()) {
				    if(vistaApp2.getNombre().getText().length() > 0 && vistaApp2.getTelefono().getText().length() == 9  ) {
				    vistaApp2.getBotonOk().setVisible(false);
				    vistaApp1.getTableModel().addRow(new String[] {vistaApp2.getNombre().getText(), vistaApp2.getTelefono().getText()});
				    vistaApp2.dispose();
				    }else  {
			            JOptionPane.showMessageDialog( vistaApp2, "Escribe un Nombre y un Telefono", "Errors", JOptionPane.ERROR_MESSAGE);
				    	vistaApp2.getBotonOk().setVisible(true);
				    }
		   }
			
		   if(e.getSource() == vistaApp2.getBotonReset()) {
				vistaApp2.dispose();
			
			}
		   
		}catch (Exception o){
		
		}
		
	try {
        
			if(e.getSource() == vistaApp1.getEditar()) {
				
			int seleccionar = vistaApp1.getTable().getSelectedRow();
				
				if(seleccionar >= 0) { //Hay una fila seleccionada?
					String nombre = (String)vistaApp1.getTable().getValueAt(seleccionar, 0);
					String telefono = (String)vistaApp1.getTable().getValueAt(seleccionar, 1);
					vistaApp3 = new VentanaTerciaria(this, nombre, telefono);
					vistaApp3.setVisible(true);
				}else if(seleccionar == -1){
					JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila de la tabla, selecciona una por favor.", "Aceptar", JOptionPane.INFORMATION_MESSAGE);

	}
			}
		
			
			if(e.getSource() == vistaApp3.getBotonEnviar()) {
				  int selectedRow = vistaApp1.getTable().getSelectedRow();
		          if (selectedRow != -1) { //Si es -1 es que no hay filas seleccionadas. Filas entre 0 e infinito, -1 = no hay seleccionadas.

		    	      String nombre = vistaApp3.getNombre().getText();
		              String telefono = vistaApp3.getTelefono().getText();
		       
		        //Método setValueAt necesita estos 3 parámetros: String, row, columna;
		              vistaApp1.getTable().setValueAt(nombre, selectedRow, 0); 
		              vistaApp1.getTable().setValueAt(telefono, selectedRow, 1);
		              vistaApp3.dispose();
				    }else {
			            JOptionPane.showMessageDialog( vistaApp3, "Escribe un Nombre y un Telefono", "Errors", JOptionPane.ERROR_MESSAGE);
				    	vistaApp3.getBotonEnviar().setVisible(true);
				    }
			}
		   
		   if(e.getSource() == vistaApp3.getBotonReset()) {
			   vistaApp3.dispose();
			
			}
		   
		}catch (Exception o){
		
		}


	   if(e.getSource() == vistaApp1.getEliminar()) {
		
		   int filaSeleccionada = vistaApp1.getTable().getSelectedRow();
		   TableModel m = vistaApp1.getTable().getModel();
	        if (filaSeleccionada >= 0) {
	            ((DefaultTableModel) m).removeRow(filaSeleccionada);
	        
		        } else if (filaSeleccionada == -1) {
		                JOptionPane.showMessageDialog(vistaApp1, "No has escogido el contacto");
		        }

	}
		
  }
}
	






