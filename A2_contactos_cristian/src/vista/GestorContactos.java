package vista;

import java.awt.BorderLayout;
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
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;

/*
 * Clase GestorContactos
 * 
 * Esta clase contiene la ventana principal, encargada de la lógica principal
 * y de la conexión con las demás ventanas a través del Controlador.
 */

public class GestorContactos extends JFrame {

	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JButton addButton, editButton, deleteButton;
	private JLabel icono, nombreApp ;
	private JPanel panel;
	
	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	
	
	public JButton getAddButton() {
		return addButton;
	}

	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	public void setTableModel(DefaultTableModel tableModel) {
		this.tableModel = tableModel;
	}

	public JButton getEditButton() {
		return editButton;
	}

	public JButton getDeleteButton() {
		return deleteButton;
	}

	public GestorContactos() {
		setBounds(110, 110, 480, 607);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Mis contactos");
		setFont(new Font("Arial", Font.BOLD, 28));
		setIconImage(Toolkit.getDefaultToolkit().getImage("eifeler-hof-icons-Home-04-1536x1536.png"));
		setLayout(null);
		setResizable(false);
		
		
		
		inicializarComponentes();
				
		setVisible(true);
		
	
		
		
	}
	
	 private void inicializarComponentes() {
		    
			
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
			addButton = new JButton(new ImageIcon(img2.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
			addButton.setBounds(120, 440, 60, 60);
			addButton.setOpaque(false);
			addButton.setContentAreaFilled(false);
			addButton.setBorderPainted(false);
			add(addButton);
			
			Image img3 = new ImageIcon("002-basura.png").getImage();
			deleteButton = new JButton(new ImageIcon(img3.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
			deleteButton.setBounds(320, 440, 60, 60);
			deleteButton.setOpaque(false);
			deleteButton.setContentAreaFilled(false);
			deleteButton.setBorderPainted(false);
			add(deleteButton);
			
			Image img4 = new ImageIcon("003-contrato.png").getImage();
			editButton = new JButton(new ImageIcon(img4.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
			editButton.setBounds(220, 440, 60, 60);
			editButton.setOpaque(false);
			editButton.setContentAreaFilled(false);
			editButton.setBorderPainted(false);
			
			add(editButton);
			
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
		addButton.addActionListener(controlador);
		deleteButton.addActionListener(controlador);
		editButton.addActionListener(controlador);
	}
	
	
	
	
	
}
