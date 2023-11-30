package vista;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controlador.ManejadorEventos;

public class Ventana extends JFrame {

	private JButton botonAñadirConacto, botonEditarContacto, botonEliminarContacto;
	private JTable tabla;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,450);
		setLocationRelativeTo(null);
		setTitle("MI AGENDA TELEFONICA");
		setIconImage(Toolkit.getDefaultToolkit().getImage("phone.png"));
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {
		colocarBotones();
		colocarTabla();

	}

	public void establecerManejador(ManejadorEventos manejador) {

		botonAñadirConacto.addActionListener(manejador);
		botonEditarContacto.addActionListener(manejador);
		botonEliminarContacto.addActionListener(manejador);
	}

	public void colocarBotones() {
		botonAñadirConacto = new JButton("Añadir Contacto");
		botonAñadirConacto.setBounds(60, 300, 150, 40);
		botonEditarContacto = new JButton("Editar");
		botonEditarContacto.setBounds(250, 120, 100, 40);
		botonEliminarContacto = new JButton("Eliminar");
		botonEliminarContacto.setBounds(250, 200, 100, 40);
		add(botonAñadirConacto);
		add(botonEditarContacto);
		add(botonEliminarContacto);
	}

	public void colocarTabla() {
		tabla = new JTable();
		JScrollPane JS = new JScrollPane(tabla);
		JS.setBounds(30, 100, 180, 180);
		add(JS);
	}

	public JButton getBotonAñadirConacto() {
		return botonAñadirConacto;
	}

	public void setBotonAñadirConacto(JButton botonAñadirConacto) {
		this.botonAñadirConacto = botonAñadirConacto;
	}

	public JButton getBotonEditarContacto() {
		return botonEditarContacto;
	}

	public void setBotonEditarContacto(JButton botonEditarContacto) {
		this.botonEditarContacto = botonEditarContacto;
	}

	public JButton getBotonEliminarContacto() {
		return botonEliminarContacto;
	}

	public void setBotonEliminarContacto(JButton botonEliminarContacto) {
		this.botonEliminarContacto = botonEliminarContacto;
	}

	public JTable getTabla() {
		return tabla;
	}

	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}

}
