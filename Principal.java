import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {

	private JMenuBar menu_bar;
	private JMenu menu_opciones, menu_color_fondo, menu_calcular, menu_acercaDe;
	private JMenuItem mi_rojo, mi_negro, mi_nuevo, mi_salir, mi_calculo, mi_creador;
	private JLabel label_logo, label_principal, label_titulo, label_nombre, label_Apaterno, label_Amaterno, label_departamento, 
				   label_antiguedad, label_resultado, label_footer;
	private JTextField tf_nombre, tf_Apaterno, tf_Amaterno;
	private JComboBox cb_departamento, cb_antiguedad;
	private JTextArea ta_resultado;
	private JScrollPane scroll;
	String nombre;

	public Principal() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pantalla principal");

		Bienvenida ventana_bienvenida = new Bienvenida();
		nombre = ventana_bienvenida.usuario;

		//Agregar color de fondo
		getContentPane().setBackground(new Color(255,0,0));
		//Agregar icono
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		//Crear barra de menu
		menu_bar = new JMenuBar();
		menu_bar.setBackground(new Color(255,0,0));
		setJMenuBar(menu_bar);
		//Crear menus
		menu_opciones = new JMenu("Opciones");
		menu_opciones.setBackground(new Color(255,0,0));
		menu_opciones.setFont(new Font("Times New Roman", 1, 16));
		menu_opciones.setForeground(new Color(255,255,255));
		menu_bar.add(menu_opciones);

		menu_color_fondo = new JMenu("Color de fondo");
		menu_color_fondo.setBackground(new Color(255,0,0));
		menu_color_fondo.setFont(new Font("Times New Roman", 1, 16));
		menu_color_fondo.setForeground(new Color(255,0,0));
		menu_opciones.add(menu_color_fondo);

		menu_calcular = new JMenu("Calcular");
		menu_calcular.setBackground(new Color(255,0,0));
		menu_calcular.setFont(new Font("Times New Roman", 1, 16));
		menu_calcular.setForeground(new Color(255,255,255));
		menu_bar.add(menu_calcular);

		menu_acercaDe = new JMenu("Acerca de");
		menu_acercaDe.setBackground(new Color(255,0,0));
		menu_acercaDe.setFont(new Font("Times New Roman", 1, 16));
		menu_acercaDe.setForeground(new Color(255,255,255));
		menu_bar.add(menu_acercaDe);

		//Crear menus item
		mi_nuevo = new JMenuItem("Nuevo");
		mi_nuevo.setFont(new Font("Times New Roman", 1, 16));
		mi_nuevo.setForeground(new Color(255,0,0));
		mi_nuevo.addActionListener(this);
		menu_opciones.add(mi_nuevo);

		mi_salir = new JMenuItem("Salir");
		mi_salir.setFont(new Font("Times New Roman", 1, 16));
		mi_salir.setForeground(new Color(255,0,0));
		mi_salir.addActionListener(this);
		menu_opciones.add(mi_salir);

		mi_rojo = new JMenuItem("Rojo");
		mi_rojo.setFont(new Font("Times New Roman", 1, 16));
		mi_rojo.setForeground(new Color(255,0,0));
		mi_rojo.addActionListener(this);
		menu_color_fondo.add(mi_rojo);

		mi_negro = new JMenuItem("Negro");
		mi_negro.setFont(new Font("Times New Roman", 1, 16));
		mi_negro.setForeground(new Color(255,0,0));
		mi_negro.addActionListener(this);
		menu_color_fondo.add(mi_negro);

		mi_calculo = new JMenuItem("Vacaciones");
		mi_calculo.setFont(new Font("Times New Roman", 1, 16));
		mi_calculo.setForeground(new Color(255,0,0));
		mi_calculo.addActionListener(this);
		menu_calcular.add(mi_calculo);

		mi_creador = new JMenuItem("El creador");
		mi_creador.setFont(new Font("Times New Roman", 1, 16));
		mi_creador.setForeground(new Color(255,0,0));
		mi_creador.addActionListener(this);
		menu_acercaDe.add(mi_creador);

		//Crear JLabel, JTextField, JComboBox y JTextArea
		ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		label_logo = new JLabel(imagen);
		label_logo.setBounds(5,5,250,100);
		add(label_logo);

		label_principal = new JLabel("Bienvenido " + nombre);
		label_principal.setBounds(280,30,300,50);
		label_principal.setFont(new Font("Times New Roman", 1, 34));
		label_principal.setForeground(new Color(255,255,255));
		add(label_principal);

		label_titulo = new JLabel("Datos del empleado para el calculo de vacaciones");
		label_titulo.setBounds(45,140,900,25);
		label_titulo.setFont(new Font("Times New Roman", 0, 26));
		label_titulo.setForeground(new Color(255,255,255));
		add(label_titulo);

		label_nombre = new JLabel("Nombre completo:");
		label_nombre.setBounds(25,188,180,25);
		label_nombre.setFont(new Font("Times New Roman", 1, 14));
		label_nombre.setForeground(new Color(255,255,255));
		add(label_nombre);

		tf_nombre = new JTextField();
		tf_nombre.setBounds(25,213,150,25);
		tf_nombre.setBackground(new Color(224,224,224));
		tf_nombre.setFont(new Font("Times New Roman", 1, 16));
		tf_nombre.setForeground(new Color(255,0,0));
		add(tf_nombre);

		label_Apaterno = new JLabel("Apellido paterno:");
		label_Apaterno.setBounds(25,248,180,25);
		label_Apaterno.setFont(new Font("Times New Roman", 1, 14));
		label_Apaterno.setForeground(new Color(255,255,255));
		add(label_Apaterno);

		tf_Apaterno = new JTextField();
		tf_Apaterno.setBounds(25,273,150,25);
		tf_Apaterno.setBackground(new Color(224,224,224));
		tf_Apaterno.setFont(new Font("Times New Roman", 1, 16));
		tf_Apaterno.setForeground(new Color(255,0,0));
		add(tf_Apaterno);

		label_Amaterno = new JLabel("Apellido materno:");
		label_Amaterno.setBounds(25,308,180,25);
		label_Amaterno.setFont(new Font("Times New Roman", 1, 14));
		label_Amaterno.setForeground(new Color(255,255,255));
		add(label_Amaterno);

		tf_Amaterno = new JTextField();
		tf_Amaterno.setBounds(25,334,150,25);
		tf_Amaterno.setBackground(new Color(224,224,224));
		tf_Amaterno.setFont(new Font("Times New Roman", 1, 16));
		tf_Amaterno.setForeground(new Color(255,0,0));
		add(tf_Amaterno);

		label_departamento = new JLabel("Selecciona el departamento");
		label_departamento.setBounds(220,188,180,25);
		label_departamento.setFont(new Font("Times New Roman", 1, 14));
		label_departamento.setForeground(new Color(255,255,255));
		add(label_departamento);

		cb_departamento = new JComboBox();
		cb_departamento.setBounds(220,213,220,25);
		cb_departamento.setBackground(new Color(224,224,224));
		cb_departamento.setFont(new Font("Times New Roman", 1, 16));
		cb_departamento.setForeground(new Color(255,0,0));
		cb_departamento.addItem("");
		cb_departamento.addItem("Atencion al cliente");
		cb_departamento.addItem("Departamento de logistica");
		cb_departamento.addItem("Departamento de gerencia");
		add(cb_departamento);

		label_antiguedad = new JLabel("Selecciona la antiguedad");
		label_antiguedad.setBounds(220,248,180,25);
		label_antiguedad.setFont(new Font("Times New Roman", 1, 14));
		label_antiguedad.setForeground(new Color(255,255,255));
		add(label_antiguedad);

		cb_antiguedad = new JComboBox();
		cb_antiguedad.setBounds(220,273,220,25);
		cb_antiguedad.setBackground(new Color(224,224,224));
		cb_antiguedad.setFont(new Font("Times New Roman", 1, 16));
		cb_antiguedad.setForeground(new Color(255,0,0));
		cb_antiguedad.addItem("");
		cb_antiguedad.addItem("1 ano de servicio");
		cb_antiguedad.addItem("2 a 6 anos de servicio");
		cb_antiguedad.addItem("7 anos o mas de servicio");
		add(cb_antiguedad);

		label_resultado = new JLabel("Resultado del calculo:");
		label_resultado.setBounds(220,307,180,25);
		label_resultado.setFont(new Font("Times New Roman", 1, 14));
		label_resultado.setForeground(new Color(255,255,255));
		add(label_resultado);

		ta_resultado = new JTextArea();
		ta_resultado.setEditable(false);
		ta_resultado.setBackground(new Color(224,224,224));
		ta_resultado.setFont(new Font("Times New Roman", 1, 15));
		ta_resultado.setForeground(new Color(255,0,0));
		ta_resultado.setText("\n Aqui aparece el resultado del calculo de las vacaciones.");

		scroll = new JScrollPane(ta_resultado);
		scroll.setBounds(220,333,385,90);
		add(scroll);

		label_footer = new JLabel("2021 The Coca-Cola Company | Todos los derechos reservados");
		label_footer.setBounds(120,445,500,30);
		label_footer.setFont(new Font("Times New Roman", 1, 14));
		label_footer.setForeground(new Color(255,255,255));
		add(label_footer);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mi_rojo) {
			menu_bar.setBackground(new Color(255,0,0));
			getContentPane().setBackground(new Color(255,0,0));
		}

		if (e.getSource() == mi_negro) {
			menu_bar.setBackground(new Color(0,0,0));
			getContentPane().setBackground(new Color(0,0,0));
		}

		if (e.getSource() == mi_nuevo) {
			tf_nombre.setText("");
			tf_Apaterno.setText("");
			tf_Amaterno.setText("");
			cb_departamento.setSelectedIndex(0);
			cb_antiguedad.setSelectedIndex(0);
			ta_resultado.setText("\n Aqui aparece el resultado del calculo de las vacaciones.");
		}

		if (e.getSource() == mi_salir) {
			Bienvenida ventana_bienvenida = new Bienvenida();
			ventana_bienvenida.setVisible(true);
			ventana_bienvenida.setBounds(0,0,350,450);
			ventana_bienvenida.setResizable(false);
			ventana_bienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}

		if (e.getSource() == mi_calculo) {
			String nombre_empleado = tf_nombre.getText();
			String ap_empleado = tf_Apaterno.getText();
			String am_empleado = tf_Amaterno.getText();
			String departamento_empleado = cb_departamento.getSelectedItem().toString();
			String antiguedad_empleado = cb_antiguedad.getSelectedItem().toString();

			if (nombre_empleado.equals("") || ap_empleado.equals("") || am_empleado.equals("") || 
				departamento_empleado.equals("") || antiguedad_empleado.equals("")) {
				
				JOptionPane.showMessageDialog(null, "Debes llenar todos los campos!");

			} else {

				if (departamento_empleado.equals("Atencion al cliente")) {
					
					if (antiguedad_empleado.equals("1 ano de servicio")) {
						ta_resultado.setText("\n  El empleado " + nombre_empleado + " " + ap_empleado + " " + am_empleado + 
											 "\n  quien labora en " + departamento_empleado + " con " + antiguedad_empleado + 
											 "\n  recibe 6 dias de vacaciones.");
					}

					if (antiguedad_empleado.equals("2 a 6 anos de servicio")) {
						ta_resultado.setText("\n  El empleado " + nombre_empleado + " " + ap_empleado + " " + am_empleado + 
											 "\n  quien labora en " + departamento_empleado + " con " + antiguedad_empleado + 
											 "\n  recibe 14 dias de vacaciones.");
					}

					if (antiguedad_empleado.equals("7 anos o mas de servicio")) {
						ta_resultado.setText("\n  El empleado " + nombre_empleado + " " + ap_empleado + " " + am_empleado + 
											 "\n  quien labora en " + departamento_empleado + " con " + antiguedad_empleado + 
											 "\n  recibe 20 dias de vacaciones.");
					}
				}

				if (departamento_empleado.equals("Departamento de logistica")) {
					
					if (antiguedad_empleado.equals("1 ano de servicio")) {
						ta_resultado.setText("\n  El empleado " + nombre_empleado + " " + ap_empleado + " " + am_empleado + 
											 "\n  quien labora en " + departamento_empleado + " con " + antiguedad_empleado + 
											 "\n  recibe 7 dias de vacaciones.");
					}

					if (antiguedad_empleado.equals("2 a 6 anos de servicio")) {
						ta_resultado.setText("\n  El empleado " + nombre_empleado + " " + ap_empleado + " " + am_empleado + 
											 "\n  quien labora en " + departamento_empleado + " con " + antiguedad_empleado + 
											 "\n  recibe 15 dias de vacaciones.");
					}

					if (antiguedad_empleado.equals("7 anos o mas de servicio")) {
						ta_resultado.setText("\n  El empleado " + nombre_empleado + " " + ap_empleado + " " + am_empleado + 
											 "\n  quien labora en " + departamento_empleado + " con " + antiguedad_empleado + 
											 "\n  recibe 22 dias de vacaciones.");
					}
				}

				if (departamento_empleado.equals("Departamento de gerencia")) {
					
					if (antiguedad_empleado.equals("1 ano de servicio")) {
						ta_resultado.setText("\n  El empleado " + nombre_empleado + " " + ap_empleado + " " + am_empleado + 
											 "\n  quien labora en " + departamento_empleado + " con " + antiguedad_empleado + 
											 "\n  recibe 10 dias de vacaciones.");
					}

					if (antiguedad_empleado.equals("2 a 6 anos de servicio")) {
						ta_resultado.setText("\n  El empleado " + nombre_empleado + " " + ap_empleado + " " + am_empleado + 
											 "\n  quien labora en " + departamento_empleado + " con " + antiguedad_empleado + 
											 "\n  recibe 20 dias de vacaciones.");
					}

					if (antiguedad_empleado.equals("7 anos o mas de servicio")) {
						ta_resultado.setText("\n  El empleado " + nombre_empleado + " " + ap_empleado + " " + am_empleado + 
											 "\n  quien labora en " + departamento_empleado + " con " + antiguedad_empleado + 
											 "\n  recibe 30 dias de vacaciones.");
					}
				}
			}
		}

		if (e.getSource() == mi_creador) {
			JOptionPane.showMessageDialog(null, "Desarrollado por Carlos software developer\ncarlitos2612david@gmail.com");
		}
	}

	public static void main(String[] args) {
		Principal ventana_principal = new Principal();
		ventana_principal.setVisible(true);
		ventana_principal.setBounds(0,0,640,535);
		ventana_principal.setResizable(false);
		ventana_principal.setLocationRelativeTo(null);
	}
}