package Entorno_grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Datos.Medicamentos;

import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.List;
import java.awt.TextField;

import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class FramePedidos extends JFrame {
	DefaultListModel almacen;
	private JPanel contentPane;
	private JTextField textAñadir;
	private int cont=0;
	private Medicamentos producto ;
	private FramePagar pago;
	/*public FramePedidos(){
		initComponents();
		
	}*/
	
	public FramePedidos() {
		
		pago=new FramePagar();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textAñadir = new JTextField();
		textAñadir.setBounds(34, 29, 223, 26);
		contentPane.add(textAñadir);
		textAñadir.setColumns(10);
		
		JButton btnAadir = new JButton("Añadir");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				producto =new Medicamentos(textAñadir.getText());
				añadir(producto);
				pago.añadir(producto);
				pago.setVisible(false);
				textAñadir.setText("");
			}
		});
		btnAadir.setBounds(300, 29, 117, 29);
		contentPane.add(btnAadir);
		
		JButton btnPedir = new JButton("Pedir");
		btnPedir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pago.setVisible(true);
			}
		});
		btnPedir.setBounds(300, 133, 117, 29);
		contentPane.add(btnPedir);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSalir.setBounds(300, 192, 117, 29);
		contentPane.add(btnSalir);
		
		JList list_1 = new JList();
		list_1.setBounds(34, 82, 223, 173);
		contentPane.add(list_1);
		
		almacen=new DefaultListModel();
		list_1.setModel(almacen);
	}
	public void añadir(Medicamentos m){
		almacen.addElement(m);
	}
}
