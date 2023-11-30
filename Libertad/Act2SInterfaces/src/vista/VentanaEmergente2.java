package vista;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controlador.ManejadorEventos;
import controlador.ManejadorEventosEmergente;
import controlador.ManejadorEventosEmergente2;

public class VentanaEmergente2 extends JDialog {
	
	private JButton botonOk, botonCancelar;
	private JTextField textNombre, textTelefono;
	private JLabel etiquetaNombre, etiquetaTelefono;
	
	public VentanaEmergente2(DefaultTableModel modelo) {
		setModalityType(ModalityType.APPLICATION_MODAL);
		//setDefaultCloseOperation(JFrame.);
		setSize(300,300);
		setLocationRelativeTo(null);
		setTitle("Editar Contacto");
		setIconImage(Toolkit.getDefaultToolkit().getImage("phone.png"));
		setLayout(null);
		inicializarComponentes();
		
		ManejadorEventosEmergente2 manejador = new ManejadorEventosEmergente2(this);
		manejador.setModelo(modelo);
		establecerManejador(manejador);
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		colocarBotones();
		colocarTextos();
		colocarEtiquetas();
	}
	
	public void establecerManejador(ManejadorEventosEmergente2 manejador) {
		botonOk.addActionListener(manejador);
	}
	
	public void colocarBotones() {
		botonOk = new JButton("OK");
		botonCancelar = new JButton("Cancelar");
		botonOk.setBounds(20, 160, 100, 30);
		botonCancelar.setBounds(150, 160, 100, 30);
		add(botonOk);
		add(botonCancelar);
	}
	
	public void colocarTextos() {
		textNombre = new JTextField();
		textTelefono = new JTextField();
		textNombre.setBounds(100,30,100,30);
		textTelefono.setBounds(100,100,100,30);
		add(textNombre);
		add(textTelefono);
	}
	
	public void colocarEtiquetas() {
		etiquetaNombre = new JLabel("Nombre");
		etiquetaTelefono = new JLabel("Telefono");
		etiquetaNombre.setBounds(20,20,200,50);
		etiquetaTelefono.setBounds(20,90,200,50);
		add(etiquetaNombre);
		add(etiquetaTelefono);
	}

	public JButton getBotonOk() {
		return botonOk;
	}

	public void setBotonOk(JButton botonOk) {
		this.botonOk = botonOk;
	}

	public JTextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(JTextField textNombre) {
		this.textNombre = textNombre;
	}

	public JTextField getTextTelefono() {
		return textTelefono;
	}

	public void setTextTelefono(JTextField textTelefono) {
		this.textTelefono = textTelefono;
	}
}
