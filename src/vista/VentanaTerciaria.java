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

public class VentanaTerciaria extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private JLabel  icono, nombreApp, nombreU, telefonoU;
	private JTextField nombre, telefono;
	private JButton botonEnviar, botonReset;
	private Controlador controlador;
	private JPanel panel;


	
	public VentanaTerciaria(Controlador controlador, String nombre2, String telefono2) {
				
		this.controlador = controlador;
				
				setBounds(100, 100, 355, 545);
				setLayout(null);
				inicializarVariables();
				setTitle("Editar Contacto");
				setIconImage(Toolkit.getDefaultToolkit().getImage("eifeler-hof-icons-Home-04-1536x1536.png"));
				setResizable(false);
				setVisible(true);

				botonReset.addActionListener(controlador);
				botonEnviar.addActionListener(controlador);
			}

			private void inicializarVariables() {
			
				 
				 Image img = new ImageIcon("eifeler-hof-icons-Home-04-1536x1536.png").getImage();
					icono = new JLabel(new ImageIcon(img.getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
					icono.setBounds(130, 100, 100, 100);
					icono.setOpaque(false); 
					add(icono);
					
					try {
						Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Cocogoose Pro-trial.ttf"));
						
						nombreApp =  new JLabel("EDITAR CONTACTO");
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
					botonEnviar = new JButton(new ImageIcon(img1.getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
					botonEnviar.setBounds(80, 390, 50, 50);
					botonEnviar.setOpaque(false);
					botonEnviar.setContentAreaFilled(false);
					botonEnviar.setBorderPainted(false);
				    add(botonEnviar);
			    
			    
					Image img2 = new ImageIcon("002-rechazado.png").getImage();
					botonReset = new JButton(new ImageIcon(img2.getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
					botonReset.setBounds(190, 390, 50, 50);
					botonReset.setOpaque(false);
					botonReset.setContentAreaFilled(false);
					botonReset.setBorderPainted(false);
				    add(botonReset);

		        nombreU = new JLabel("Nombre");
		        nombreU.setBounds(70, 200, 120, 30);
		        add(nombreU);
			    
		    	nombre = new JTextField();
		    	nombre.setBounds(130, 200, 120, 30);
		    	nombre.setBorder(null);
		    	nombre.setFont(new Font("Dialogo",Font.PLAIN,14));
		    	nombre.setForeground(Color.GRAY);
				add(nombre);
		    
			     telefonoU = new JLabel("Telefono");
			     telefonoU.setBounds(70, 300, 120, 30);
			     add(telefonoU);
		    
		    	telefono = new JTextField();
		    	telefono.setBounds(130, 300, 120, 30);
		    	telefono.setBorder(null);
		    	telefono.setFont(new Font("Dialogo",Font.PLAIN,14));
		    	telefono.setForeground(Color.GRAY);
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
		    


			public JLabel getIcono() {
				return icono;
			}

			public void setIcono(JLabel icono) {
				this.icono = icono;
			}

			public JLabel getNombreApp() {
				return nombreApp;
			}

			public void setNombreApp(JLabel nombreApp) {
				this.nombreApp = nombreApp;
			}

			public JLabel getNombreU() {
				return nombreU;
			}

			public void setNombreU(JLabel nombreU) {
				this.nombreU = nombreU;
			}

			public JLabel getTelefonoU() {
				return telefonoU;
			}

			public void setTelefonoU(JLabel telefonoU) {
				this.telefonoU = telefonoU;
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


			public JButton getBotonEnviar() {
				return botonEnviar;
			}

			public void setBotonEnviar(JButton botonEnviar) {
				this.botonEnviar = botonEnviar;
			}

			public Controlador getControlador() {
				return controlador;
			}

			public JButton getBotonReset() {
				return botonReset;
			}

			public void setBotonReset(JButton botonReset) {
				this.botonReset = botonReset;
			}


			public void setControlador(Controlador controlador) {
				this.controlador = controlador;
			}
		
	
}
