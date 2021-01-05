import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener {

	private JTextField capturar_usuario;
	private JButton ingresar;
	private JLabel logo_tipo, titulo, ingrese, pie;
	public static String usuario;

	public Bienvenida() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bienvenido");

		//Agregar color de fondo
		getContentPane().setBackground(new Color(255,0,0));
		//Agregar icono
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		//Crear objeto imagen
		ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		//Crear objetos JLabel
		logo_tipo = new JLabel(imagen);
		logo_tipo.setBounds(25,15,300,150);
		add(logo_tipo);

		titulo = new JLabel("Sistema de control vacacional");
		titulo.setBounds(45,135,300,30);
		titulo.setFont(new Font("Times New Roman", 3, 20));
		titulo.setForeground(new Color(255,255,255));
		add(titulo);

		ingrese = new JLabel("Ingrese su nombre");
		ingrese.setBounds(45,212,200,30);
		ingrese.setFont(new Font("Times New Roman", 1, 14));
		ingrese.setForeground(new Color(255,255,255));
		add(ingrese);

		pie = new JLabel("2021 The Coca-Cola Company");
		pie.setBounds(70,375,300,30);
		pie.setFont(new Font("Times New Roman", 1, 14));
		pie.setForeground(new Color(255,255,255));
		add(pie);

		//Crear objeto JTextField
		capturar_usuario = new JTextField();
		capturar_usuario.setBounds(45,240,255,25);
		capturar_usuario.setBackground(new Color(224,224,224));
		capturar_usuario.setFont(new Font("Times New Roman", 1, 16));
		capturar_usuario.setForeground(new Color(255,0,0));
		add(capturar_usuario);

		//Crear objeto JButton
		ingresar = new JButton("Ingresar");
		ingresar.setBounds(125,280,100,30);
		ingresar.setBackground(new Color(255,255,255));
		ingresar.setFont(new Font("Times New Roman", 1, 16));
		ingresar.setForeground(new Color(255,0,0));
		ingresar.addActionListener(this);
		add(ingresar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ingresar) {
			usuario = capturar_usuario.getText().trim();

			if (usuario.equals("")) {
				JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre!");
			} else {
				Licencia ventana_licencia = new Licencia();
				ventana_licencia.setVisible(true);
				ventana_licencia.setBounds(0,0,600,360);
				ventana_licencia.setResizable(false);
				ventana_licencia.setLocationRelativeTo(null);
				this.setVisible(false);
			}
		}
	}

	public static void main(String[] args) {
		Bienvenida ventana_bienvenida = new Bienvenida();
		ventana_bienvenida.setVisible(true);
		ventana_bienvenida.setBounds(0,0,350,450);
		ventana_bienvenida.setResizable(false);
		ventana_bienvenida.setLocationRelativeTo(null);
	}
}