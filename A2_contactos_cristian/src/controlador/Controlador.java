package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import vista.AddContact;
import vista.EditContact;
import vista.GestorContactos;

public class Controlador implements ActionListener {
	private GestorContactos ventana;
	private AddContact ventana2;
	private EditContact ventana3;
	
	/*
	 * Clase Controlador
	 * 
	 * Esta clase se encarga de conectar con los componentes de cada
	 * una de las 3 ventanas, mediante los listeners y sus diferentes lógicas
	 * 
	 */
	public Controlador(GestorContactos ventana) {
		this.ventana = ventana;
		rellenarTablaConDatos();
	}
	
	public void rellenarTablaConDatos() {
		ventana.getTableModel().addRow(new String[]{"Daniela","625938647"});
		ventana.getTableModel().addRow(new String[]{"Godofredo","649938647"});
		ventana.getTableModel().addRow(new String[]{"Ermenegildo","6859647"});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Evento para crear la ventan de AddContact
		if(e.getSource() == ventana.getAddButton()) {
			ventana2 = new AddContact(this);
			ventana2.setVisible(true);
		}
		/*
		 * Evento dentro de la ventana AddContact para seleccionar el botón OK y verificar + obtener lo escrito en las cajas de texto. 
		   Primero se verifica que está creada la ventana2.
		 */
		if(ventana2 != null&& e.getSource() == ventana2.getOkButton()) {
				
					if((ventana2.getCajaUsuario().getText()).isEmpty() && (ventana2.getCajaTelefono().getText()).isEmpty()) {
						JOptionPane.showMessageDialog(null,"¡No has introducido ningún nombre ni teléfono!", "Aceptar", JOptionPane.INFORMATION_MESSAGE);


					}else if((ventana2.getCajaUsuario().getText()).isEmpty()){
						JOptionPane.showMessageDialog(null,"¡No has introducido ningún nombre!", "Aceptar", JOptionPane.INFORMATION_MESSAGE);

					}else if((ventana2.getCajaTelefono().getText()).isEmpty()) {
						JOptionPane.showMessageDialog(null,"¡No has introducido ningún teléfono!", "Aceptar", JOptionPane.INFORMATION_MESSAGE);

					}else {
						ventana.getTableModel().addRow(new String[] {ventana2.getCajaUsuario().getText(), ventana2.getCajaTelefono().getText() });
						ventana2.setVisible(false);
					}
		}
		//Evento al pulsar cancelar u OK dentro de la ventana2
		if(ventana2 != null && (e.getSource() == ventana2.getCancelButton()|| e.getSource() == ventana2.getOkButton())) {
			ventana2.setVisible(false);
		}
		
		/*
		 * Evento click en botón editar, admeás de tener una row seleccionada -> se abre ventana EditContact
		   Se obtienen los datos de la fila seleccionada y los copio a la ventana de edición.
		 */
		if(e.getSource() == ventana.getEditButton()) {
			int selectedRow = ventana.getTable().getSelectedRow();
			if(selectedRow >= 0) { //Hay una fila seleccionada?
				String nombre = (String)ventana.getTable().getValueAt(selectedRow, 0);
				String telefono = (String)ventana.getTable().getValueAt(selectedRow, 1);
				ventana3 = new EditContact(this, nombre, telefono);
				ventana3.setVisible(true);
			}else if(selectedRow == -1){
				JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila de la tabla, selecciona una por favor.", "Aceptar", JOptionPane.INFORMATION_MESSAGE);
			

			}
		}
		/*
		 * Evento click en OK dentro de la ventana EditContact -> se actualiza la tabla con los mismos datos	
		 * 
		 * Selecciono la fila elegida por el usuario. COnfirmo que hay una elegida.
		 * Se obtienen los valores de las cajas de texto de la ventana de edición.
		 * Se traspasan esos valores a la tabla de la ventana principal.

		 */
		if(ventana3 != null && e.getSource() == ventana3.getOkButton()) {
			int selectedRow = ventana.getTable().getSelectedRow();
            if (selectedRow != -1) { //Si es -1 es que no hay filas seleccionadas. Filas entre 0 e infinito, -1 = no hay seleccionadas.

            	String nombre = ventana3.getCajaUsuario().getText();
                String telefono = ventana3.getCajaTelefono().getText();
                //Método setValueAt necesita estos 3 parámetros: String, row, columna;
                ventana.getTable().setValueAt(nombre, selectedRow, 0); 
                ventana.getTable().setValueAt(telefono, selectedRow, 1);
                ventana3.dispose();
            }
		}
		if(ventana3 != null && e.getSource() == ventana3.getCancelButton()) {
			ventana3.dispose();
		}
		
		
		
		
		/*
		 * Evento para el botón eliminar -> Elimina el contacto seleccionado de la tabla.
		 * 
		 * Se selecciona la fila que ha sido elegida por el usuario y se elimina
		 * Si no se ha seleccionado ninguna, se muestra un mensaje.

		 */
		
		if(e.getSource() == ventana.getDeleteButton()) {
			int selectedRow = ventana.getTable().getSelectedRow();
			if(selectedRow != -1) {
				DefaultTableModel model = (DefaultTableModel)ventana.getTable().getModel();
				model.removeRow(selectedRow);
			}else if(selectedRow == -1){
				JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila de la tabla, selecciona una por favor.", "Aceptar", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		
	}
		
}