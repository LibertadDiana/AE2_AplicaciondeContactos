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
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import controlador.Controlador;




public class VentanaSecundaria extends JDialog {

	
	private static final long serialVersionUID = 1L;
	
	private JLabel icono, nombreApp, nombreU, telefonoU;
	private JTextField nombre, telefono;
	private JButton botonOk, botonReset;
	private Controlador controlador;
	private JPanel panel;
	

	public VentanaSecundaria(Controlador controlador) {
		
		this.setControlador(controlador);
		
		
			setBounds(100, 100, 355, 545);
			setLayout(null);
			inicializarVariables();
			setTitle("Añadir Contacto");
			setIconImage(Toolkit.getDefaultToolkit().getImage("eifeler-hof-icons-Home-04-1536x1536.png"));
			setResizable(false);
			setVisible(true);
			
			botonReset.addActionListener(controlador);
			botonOk.addActionListener(controlador);
	}
			
			 private void inicializarVariables() {
				 
				 
				 Image img = new ImageIcon("eifeler-hof-icons-Home-04-1536x1536.png").getImage();
					icono = new JLabel(new ImageIcon(img.getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
					icono.setBounds(130, 90, 100, 100);
					icono.setOpaque(false); 
					add(icono);
					
					try {
						Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Cocogoose Pro-trial.ttf"));
						
						nombreApp =  new JLabel("ANADIR CONTACTO");
						nombreApp.setHorizontalAlignment(SwingConstants.CENTER);
						nombreApp.setFont(font.deriveFont(Font.BOLD, 25f));
						nombreApp.setBounds(30, 20, 285, 100);
						nombreApp.setForeground(Color.GRAY);
						add(nombreApp);
						
					} catch (FontFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
				 

				Image img1 = new ImageIcon("001-aprobado.png").getImage();
				botonOk = new JButton(new ImageIcon(img1.getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
				botonOk.setBounds(80, 390, 50, 50);
				botonOk.setOpaque(false);
				botonOk.setContentAreaFilled(false);
				botonOk.setBorderPainted(false);
			    add(botonOk);
		    
		    
				Image img2 = new ImageIcon("002-rechazado.png").getImage();
				botonReset = new JButton(new ImageIcon(img2.getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
				botonReset.setBounds(190, 390, 50, 50);
				botonReset.setOpaque(false);
				botonReset.setContentAreaFilled(false);
				botonReset.setBorderPainted(false);
			    add(botonReset);

		        nombreU = new JLabel("Nombre");
		        nombreU.setBounds(70, 200, 120, 30);
		        nombreU.setForeground(Color.DARK_GRAY);
		        add(nombreU);
			    
		    	nombre = new JTextField();
		    	nombre.setBounds(130, 200, 120, 30);
		    	nombre.setBorder(null);
		    	nombre.setFont(new Font("Dialogo",Font.BOLD,14));
		    	nombre.setForeground(Color.DARK_GRAY);
		    	
				add(nombre);
		    
			     telefonoU = new JLabel("Telefono");
			     telefonoU.setBounds(70, 300, 120, 30);
			     telefonoU.setForeground(Color.DARK_GRAY);
			     add(telefonoU);
		    
		    	telefono = new JTextField();
		    	telefono.setBounds(130, 300, 120, 30);
		    	telefono.setBorder(null);
		    	telefono.setFont(new Font("Dialogo",Font.BOLD,14));
		    	telefono.setForeground(Color.DARK_GRAY);
				add(telefono);
				
				Image img7 = new ImageIcon("pngtree-orange-poster-background-png-image_6560704.png").getImage();
				panel=new JPanel() {
					
					private static final long serialVersionUID = 1L;

					@Override
					  public void paint(Graphics g) {
					    g.drawImage(img7,1,1,getWidth(),getHeight(),this);
					    super.paint(g);
					  }
					};

					panel.setBounds(0, 0, 645, 605);
					panel.setOpaque(false);
					add(panel);
				}

		    
				
	
	public JButton getBotonCerrar() {
		return botonReset;
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

	public JButton getBotonOk() {
		return botonOk;
	}

	public void setBotonOk(JButton botonOk) {
		this.botonOk = botonOk;
	}

	public JButton getBotonReset() {
		return botonReset;
	}

	public void setBotonReset(JButton botonReset) {
		this.botonReset = botonReset;
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

}
