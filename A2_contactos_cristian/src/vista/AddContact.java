package vista;

import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;


/*
 * Clase AddContac
 * 
 * Esta clase contiene una de las ventanas secundarias, encargada de la
 * lógica y contener los componentes referidos al añadido de contactos 
 * en la tabla de la ventana principal.
 * 
 * 
 */
public class AddContact extends JDialog {
	
	private Controlador controlador;
	private JLabel nombreUsuario, telefono, icono, nombreApp;
	private JTextField cajaUsuario, cajaTelefono;
	private JButton okButton, cancelButton;
	private JPanel panel;
	
	private final JPanel contentPanel = new JPanel();

	public JButton getOkButton() {
		return okButton;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public JTextField getCajaUsuario() {
		return cajaUsuario;
	}

	public JTextField getCajaTelefono() {
		return cajaTelefono;
	}

	
	
	public AddContact(Controlador controlador) {
		this.controlador = controlador;
		
		setBounds(700, 650, 355, 545);
		setLayout(null);
		
		setTitle("Añadir Contacto");
		setIconImage(Toolkit.getDefaultToolkit().getImage("eifeler-hof-icons-Home-04-1536x1536.png"));
		setResizable(false);
		setVisible(true);
		
		setTitle("Nuevo Contacto");
		setIconImage(Toolkit.getDefaultToolkit().getImage("eifeler-hof-icons-Home-04-1536x1536.png"));
		setResizable(false);
		
		
		
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
	okButton = new JButton(new ImageIcon(img1.getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
	okButton.setBounds(80, 390, 50, 50);
	okButton.setOpaque(false);
	okButton.setContentAreaFilled(false);
	okButton.setBorderPainted(false);
	okButton.addActionListener(controlador);
    add(okButton);


	Image img2 = new ImageIcon("002-rechazado.png").getImage();
	cancelButton = new JButton(new ImageIcon(img2.getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
	cancelButton.setBounds(190, 390, 50, 50);
	cancelButton.setOpaque(false);
	cancelButton.setContentAreaFilled(false);
	cancelButton.setBorderPainted(false);
	cancelButton.addActionListener(controlador);
    add(cancelButton);

    nombreUsuario = new JLabel("Nombre");
    nombreUsuario.setBounds(70, 200, 120, 30);
    nombreUsuario.setForeground(Color.DARK_GRAY);
    add(nombreUsuario);
    
    cajaUsuario = new JTextField();
    cajaUsuario.setBounds(130, 200, 120, 30);
    cajaUsuario.setBorder(null);
    cajaUsuario.setFont(new Font("Dialogo",Font.BOLD,14));
    cajaUsuario.setForeground(Color.DARK_GRAY);
	add(cajaUsuario);

   	telefono = new JLabel("Telefono");
   	telefono.setBounds(70, 300, 120, 30);
   	telefono.setForeground(Color.DARK_GRAY);
	add(telefono);

    cajaTelefono = new JTextField();
    cajaTelefono.setBounds(130, 300, 120, 30);
    cajaTelefono.setBorder(null);
    cajaTelefono.setFont(new Font("Dialogo",Font.BOLD,14));
    cajaTelefono.setForeground(Color.DARK_GRAY);
	add(cajaTelefono);
	
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
	
	
	
	
	
}
