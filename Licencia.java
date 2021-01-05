import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ChangeListener, ActionListener {

	private JLabel logo_tipo, titulo;
	private JTextArea terminos_y_condiciones;
	private JScrollPane scroll;
	private JCheckBox aceptar;
	private JButton continuar, no_acepto;
	String nombre;

	public Licencia() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de uso");

		Bienvenida ventana_bienvenida = new Bienvenida();
		nombre = ventana_bienvenida.usuario;

		//Agregar icono
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		//Crear objeto JLabel
		titulo = new JLabel("TERMINOS Y CONDICIONES");
		titulo.setBounds(200,5,200,30);
		titulo.setFont(new Font("Times New Roman", 1, 14));
		titulo.setForeground(new Color(0,0,0));
		add(titulo);

		//Crear objeto JTextArea
		terminos_y_condiciones = new JTextArea();
		terminos_y_condiciones.setEditable(false);
		terminos_y_condiciones.setFont(new Font("Times New Roman", 0, 11));
		terminos_y_condiciones.setText("\n\n       TERMINOS Y CONDICIONES" + 
									   "\n\n       A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE THE SOFTWARE DEVELOPER." + 
									   "\n       B.  PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISENO DE LAS INTERFACES GRAFICAS." + 
									   "\n       C.  THE SOFTWARE DEVELOPER NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." + 
									   "\n\n       LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE" + 
									   "\n       SOFTWARE. (THE SOFTWARE DEVELOPER), NO SE RESPONSABILIZA DEL USO QUE USTED HAGA" + 
									   "\n       CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" + 
									   "\n       SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
									   "\n\n       PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
									   "\n       GMAIL: CARLITOS2612DAVID@GMAIL.COM");
		scroll = new JScrollPane(terminos_y_condiciones);
		scroll.setBounds(5,40,575,200);
		add(scroll);

		//Crear objeto JCheckBox
		aceptar = new JCheckBox("Yo " + nombre + " acepto");
		aceptar.setBounds(10,250,300,30);
		aceptar.setFont(new Font("Times New Roman", 1, 14));
		aceptar.setForeground(new Color(255,0,0));
		aceptar.addChangeListener(this);
		add(aceptar);

		//Crear objetos JButton
		continuar = new JButton("Continuar");
		continuar.setBounds(10,290,100,30);
		continuar.setBackground(new Color(255,255,255));
		continuar.setFont(new Font("Time New Roman", 1, 12));
		continuar.setForeground(new Color(255,0,0));
		continuar.addActionListener(this);
		continuar.setEnabled(false);
		add(continuar);

		no_acepto = new JButton("No acepto");
		no_acepto.setBounds(120,290,100,30);
		no_acepto.setBackground(new Color(255,255,255));
		no_acepto.setFont(new Font("Time New Roman", 1, 12));
		no_acepto.setForeground(new Color(255,0,0));
		no_acepto.addActionListener(this);
		no_acepto.setEnabled(true);
		add(no_acepto);

		//Crear objeto imagen
		ImageIcon imagen = new ImageIcon("images/coca-cola.png");
		//Crear objeto JLabel
		logo_tipo = new JLabel(imagen);
		logo_tipo.setBounds(315,135,300,300);
		add(logo_tipo);
	}

	public void stateChanged(ChangeEvent e) {
		if (aceptar.isSelected() == true) {
			no_acepto.setEnabled(false);
			continuar.setEnabled(true);
		} else {
			no_acepto.setEnabled(true);
			continuar.setEnabled(false);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == continuar) {
			Principal ventana_principal = new Principal();
			ventana_principal.setVisible(true);
			ventana_principal.setBounds(0,0,640,535);
			ventana_principal.setResizable(false);
			ventana_principal.setLocationRelativeTo(null);
			this.setVisible(false);
		}

		if (e.getSource() == no_acepto) {
			Bienvenida ventana_bienvenida = new Bienvenida();
			ventana_bienvenida.setVisible(true);
			ventana_bienvenida.setBounds(0,0,350,450);
			ventana_bienvenida.setResizable(false);
			ventana_bienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}

	public static void main(String[] args) {
		Licencia ventana_licencia = new Licencia();
		ventana_licencia.setVisible(true);
		ventana_licencia.setBounds(0,0,600,360);
		ventana_licencia.setResizable(false);
		ventana_licencia.setLocationRelativeTo(null);
	}
}