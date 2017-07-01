package Entorno_grafico;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelUsuario extends JPanel {
	private JTextField textNombre;
	private JTextField textCorreo;
	private JTextField textTelefono;
	private JTextField textDNI;

	/**
	 * Create the panel.
	 */
	public PanelUsuario() {
		setBorder(new TitledBorder(null, "Datos personales", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(5, 2, 5, 5));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		add(textNombre);
		textNombre.setColumns(10);
		textNombre.setText("Anthony Jhon Apaza Chambi");
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		add(lblEmail);
		
		textCorreo = new JTextField();
		textCorreo.setEditable(false);
		add(textCorreo);
		textCorreo.setColumns(10);
		textCorreo.setText("tony14_ucsm@hotmail.com");
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		add(lblTelefono);
		
		textTelefono = new JTextField();
		textTelefono.setEditable(false);
		add(textTelefono);
		textTelefono.setColumns(10);
		textTelefono.setText("991589483");
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		add(lblDni);
		
		textDNI = new JTextField();
		textDNI.setEditable(false);
		add(textDNI);
		textDNI.setColumns(10);
		textDNI.setText("73321658");
		
		JButton btnHacerPedidos = new JButton("Hacer pedidos");
		btnHacerPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FramePedidos pedidos=new FramePedidos();
				pedidos.setVisible(true);
			}
		});
		add(btnHacerPedidos);
		
		JButton btnHistorial = new JButton("Historial");
		add(btnHistorial);

	}

}
