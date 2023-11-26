package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;

public class VentanaPrincipal extends JFrame {


	private static final long serialVersionUID = 1L;
	
	private JTextField nombre, telefono;
	private JButton addContacto, eliminar, editar;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JLabel icono, nombreApp;
	private JPanel panel;


   public  VentanaPrincipal() {
	
	setBounds(110, 110, 480, 607);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
	inicializarVariables();
	setTitle("Mis contactos");
	setIconImage(Toolkit.getDefaultToolkit().getImage("eifeler-hof-icons-Home-04-1536x1536.png"));
	setResizable(false);
	setVisible(true);
	
	
   }
 

   private void inicializarVariables() {
	    
		
	Image img = new ImageIcon("eifeler-hof-icons-Home-04-1536x1536.png").getImage();
	icono = new JLabel(new ImageIcon(img.getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
	icono.setBounds(200, 100, 100, 100);
	icono.setOpaque(false); 
	add(icono);
	
	try {
		Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Cocogoose Pro-trial.ttf"));
		
		nombreApp =  new JLabel("MIS CONTACTOS");
		nombreApp.setHorizontalAlignment(SwingConstants.CENTER);
		nombreApp.setFont(font.deriveFont(Font.BOLD, 25f));
		nombreApp.setBounds(90, 20, 285, 100);
		nombreApp.setForeground(Color.GRAY);
		add(nombreApp);
		
	} catch (FontFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Image img2 = new ImageIcon("001-signo-de-ms.png").getImage();
	addContacto = new JButton(new ImageIcon(img2.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
	addContacto.setBounds(120, 440, 60, 60);
	addContacto.setOpaque(false);
	addContacto.setContentAreaFilled(false);
	addContacto.setBorderPainted(false);
	add(addContacto);
	
	Image img3 = new ImageIcon("002-basura.png").getImage();
	eliminar = new JButton(new ImageIcon(img3.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
	eliminar.setBounds(320, 440, 60, 60);
	eliminar.setOpaque(false);
	eliminar.setContentAreaFilled(false);
	eliminar.setBorderPainted(false);
	add(eliminar);
	
	Image img4 = new ImageIcon("003-contrato.png").getImage();
	editar = new JButton(new ImageIcon(img4.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
	editar.setBounds(220, 440, 60, 60);
	editar.setOpaque(false);
	editar.setContentAreaFilled(false);
	editar.setBorderPainted(false);
	
	add(editar);
	
	String[] nombreColumnas = {"Nombre","Teléfono"};
	tableModel = new DefaultTableModel(nombreColumnas,0);
	table = new JTable(tableModel);
	table.setBorder(null); 

	table.setRowMargin(0);
	((DefaultTableCellRenderer)table.getDefaultRenderer(Object.class)).setOpaque(false);
	
	
	table.getTableHeader().setFont(new Font("Gold", 1, 16));
	table.getTableHeader().setOpaque(false);
	table.getTableHeader().setBorder(null);
	table.getTableHeader().setForeground(Color.white);
	table.getTableHeader().setBackground(Color.GRAY);
	
	
	add(table);
	
	scrollPane = new JScrollPane(table);
	
	scrollPane.setBounds(115, 218, 258, 200);
	scrollPane.getVerticalScrollBar().setBorder(null); 
	scrollPane.getHorizontalScrollBar().setBorder(null); 
	scrollPane.setBorder(null);
	scrollPane.setOpaque(false);
	scrollPane.getViewport().setOpaque(false);

	add(scrollPane);

	Image img7 = new ImageIcon("pngtree-orange-poster-background-png-image_6560704.png").getImage();
	panel = new JPanel() {
		

		private static final long serialVersionUID = 1L;

		@Override
		  public void paint(Graphics g) {
		    g.drawImage(img7,0,0,getWidth(),getHeight(),this);
		    super.paint(g);
		  }
		};

		panel.setBounds(0, 0, 645, 605);
		panel.setOpaque(false);
		add(panel);
	}

	public void setControlador(Controlador controlador) {
		
		addContacto.addActionListener(controlador);
		eliminar.addActionListener(controlador);
		editar.addActionListener(controlador);
	
   }

public JLabel getIcono() {
		return icono;
	}



public void setIcono(JLabel icono) {
		this.icono = icono;
	}



public JTextField getNombre() {
		return nombre;
	}




	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}




	public JTextField getTelefono() {
		return telefono;
	}




	public void setTelefono(JTextField telefono) {
		this.telefono = telefono;
	}




	public JButton getAddContacto() {
		return addContacto;
	}




	public void setAddContacto(JButton addContacto) {
		this.addContacto = addContacto;
	}




	public JButton getEliminar() {
		return eliminar;
	}




	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}




	public JButton getEditar() {
		return editar;
	}




	public void setEditar(JButton editar) {
		this.editar = editar;
	}




	public JTable getTable() {
		return table;
	}




	public void setTable(JTable table) {
		this.table = table;
	}




	public DefaultTableModel getTableModel() {
		return tableModel;
	}




	public void setTableModel(DefaultTableModel tableModel) {
		this.tableModel = tableModel;
	}
	

	public int getSelectedRow() {
	
		return 0;
	}

}
