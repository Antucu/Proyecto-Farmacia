package Entorno_grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Datos.Medicamentos;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;

public class FramePagar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	DefaultListModel almacen;
	
	public FramePagar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(30, 19, 251, 91);
		contentPane.add(list);
		
		almacen=new DefaultListModel();
		list.setModel(almacen);
		
		textField = new JTextField();
		textField.setBounds(151, 122, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblImporteAPagar = new JLabel("Importe a pagar:");
		lblImporteAPagar.setBounds(30, 127, 111, 16);
		contentPane.add(lblImporteAPagar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seleccion=list.getSelectedIndex();
				if (seleccion>=0){
					almacen.remove(seleccion);
				}
				else{
					JOptionPane.showMessageDialog(list, this, "La lista esta vacía", seleccion, null);
				}
			}
		});
		btnBorrar.setBounds(293, 14, 81, 29);
		contentPane.add(btnBorrar);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setBounds(293, 66, 81, 29);
		contentPane.add(btnPagar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSalir.setBounds(293, 119, 81, 29);
		contentPane.add(btnSalir);
		
	}
	void añadir (Medicamentos m){
		almacen.addElement(m);
	}
}
