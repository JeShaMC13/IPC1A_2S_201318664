package Guatemala;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;

import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

import Panama.PrincipalPanama;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class InterfazGuatemala extends JFrame {

	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField NIT;
	private JTextField Telefono;
	private JTextField TipoHabitacion;

	/**
	 * Launch the application.
	 */
	PrincipalGuatemala g = new PrincipalGuatemala();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGuatemala frame = new InterfazGuatemala();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazGuatemala() {
		setTitle("Bienvenido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 846, 484);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setForeground(SystemColor.inactiveCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Datos personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(25, 29, 276, 95);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 23, 46, 14);
		panel.add(lblNombre);
		
		JLabel lblNoTelefono = new JLabel("No.  telefono");
		lblNoTelefono.setBounds(20, 45, 68, 14);
		panel.add(lblNoTelefono);
		
		JLabel lblNit = new JLabel("NIT");
		lblNit.setBounds(20, 70, 46, 14);
		panel.add(lblNit);
		
		Nombre = new JTextField();
		Nombre.setBounds(91, 20, 175, 19);
		panel.add(Nombre);
		Nombre.setColumns(10);
		
		NIT = new JTextField();
		NIT.setColumns(10);
		NIT.setBounds(91, 67, 175, 19);
		panel.add(NIT);
		
		Telefono = new JTextField();
		Telefono.setColumns(10);
		Telefono.setBounds(91, 42, 175, 19);
		panel.add(Telefono);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Datos personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(25, 135, 276, 253);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("No. habitaciones");
		label.setBounds(10, 20, 80, 14);
		panel_1.add(label);
		
		JSpinner Habitaciones = new JSpinner();
		Habitaciones.setBounds(118, 16, 37, 23);
		panel_1.add(Habitaciones);
		
		JLabel label_1 = new JLabel("Tipo de habitaci\u00F3n");
		label_1.setBounds(10, 50, 98, 23);
		panel_1.add(label_1);
		
		TipoHabitacion = new JTextField();
		TipoHabitacion.setColumns(10);
		TipoHabitacion.setBounds(118, 50, 133, 23);
		panel_1.add(TipoHabitacion);
		
		JComboBox Nopiso = new JComboBox();
		Nopiso.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7"}));
		Nopiso.setBounds(118, 81, 37, 20);
		panel_1.add(Nopiso);
		
		JSpinner Hospedaje = new JSpinner();
		Hospedaje.setModel(new SpinnerNumberModel(1, 1, 15, 1));
		Hospedaje.setBounds(118, 112, 37, 23);
		panel_1.add(Hospedaje);
		
		JComboBox Tipodepago = new JComboBox();
		Tipodepago.setModel(new DefaultComboBoxModel(new String[] {"Tarjeta de credito.", "Tarjeta de debito.", "Cheque.", "Contado."}));
		Tipodepago.setBounds(118, 146, 131, 23);
		panel_1.add(Tipodepago);
		
		JComboBox Mes = new JComboBox();
		Mes.setModel(new DefaultComboBoxModel(new String[] {"Enero ", "Febrero", "Marzo ", "Abril", "Mayo ", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre ", "Diciembre"}));
		Mes.setBounds(153, 206, 82, 20);
		panel_1.add(Mes);
		
		JLabel label_2 = new JLabel("Mes");
		label_2.setBounds(121, 209, 22, 14);
		panel_1.add(label_2);
		
		JSpinner Dia = new JSpinner();
		Dia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		Dia.setBounds(67, 205, 37, 23);
		panel_1.add(Dia);
		
		JLabel label_3 = new JLabel("Dia");
		label_3.setBounds(35, 209, 22, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Fecha de reservac\u00F3n");
		label_4.setBounds(10, 180, 113, 14);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Forma de pago");
		label_5.setBounds(10, 146, 80, 23);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Dias de hospedaje");
		label_6.setBounds(10, 121, 98, 14);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Piso");
		label_7.setBounds(10, 84, 46, 14);
		panel_1.add(label_7);
		
		JButton Listo = new JButton("Listo");
		Listo.setBackground(new Color(47, 79, 79));
		Listo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g.getFecha(Dia.getValue().toString(), Mes.getSelectedItem().toString());
				//c.getPais(Pais.getSelectedItem().toString());
				g.getHabitaciones(Habitaciones.getValue().toString(), Hospedaje.getValue().toString(), Tipodepago.getSelectedItem().toString(), TipoHabitacion.getText().toString());
				g.getImprimir();

			}
		});
		Listo.setForeground(new Color(250, 250, 210));
		Listo.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		Listo.setBounds(25, 412, 89, 23);
		contentPane.add(Listo);
		
		JButton Limpiar = new JButton("Limpiar");
		Limpiar.setBackground(new Color(47, 79, 79));
		Limpiar.setForeground(new Color(250, 250, 210));
		Limpiar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		Limpiar.setBounds(124, 412, 89, 23);
		contentPane.add(Limpiar);
		
		JButton Salir = new JButton("Salir");
		Salir.setBackground(new Color(47, 79, 79));
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		Salir.setForeground(new Color(250, 250, 210));
		Salir.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		Salir.setBounds(223, 412, 89, 23);
		contentPane.add(Salir);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(211, 211, 211));
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Servicios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(321, 29, 196, 173);
		contentPane.add(panel_2);
		
		JLabel label_8 = new JLabel("Gimnacio");
		label_8.setBounds(20, 48, 68, 14);
		panel_2.add(label_8);
		
		JLabel label_9 = new JLabel("Discoteca");
		label_9.setBounds(20, 73, 46, 14);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("Centro de convenciones");
		label_10.setBounds(20, 98, 125, 14);
		panel_2.add(label_10);
		
		JLabel label_11 = new JLabel("Anfiteatro");
		label_11.setBounds(20, 123, 54, 14);
		panel_2.add(label_11);
		
		JLabel label_12 = new JLabel("Master Snack");
		label_12.setBounds(20, 148, 68, 14);
		panel_2.add(label_12);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(155, 70, 29, 20);
		panel_2.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(155, 95, 29, 20);
		panel_2.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(155, 120, 29, 20);
		panel_2.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(155, 45, 29, 20);
		panel_2.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(155, 145, 29, 20);
		panel_2.add(spinner_4);
		
		JLabel label_13 = new JLabel("Personas a asistir:");
		label_13.setBounds(100, 21, 96, 14);
		panel_2.add(label_13);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(211, 211, 211));
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Restaurantes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(321, 227, 402, 173);
		contentPane.add(panel_3);
		
		JLabel label_14 = new JLabel("Rest. Mayan Place");
		label_14.setBounds(10, 48, 103, 14);
		panel_3.add(label_14);
		
		JLabel label_15 = new JLabel("Personas a asistir:");
		label_15.setBounds(125, 26, 96, 14);
		panel_3.add(label_15);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(160, 70, 29, 20);
		panel_3.add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(160, 95, 29, 20);
		panel_3.add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(160, 120, 29, 20);
		panel_3.add(spinner_7);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(160, 45, 29, 20);
		panel_3.add(spinner_8);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(160, 145, 29, 20);
		panel_3.add(spinner_9);
		
		JLabel label_16 = new JLabel("Rest. Mayan Nights");
		label_16.setBounds(10, 73, 103, 14);
		panel_3.add(label_16);
		
		JLabel label_17 = new JLabel("Rest. Italian Noodles");
		label_17.setBounds(10, 98, 103, 14);
		panel_3.add(label_17);
		
		JLabel label_18 = new JLabel("Rest. Mediterranean Flavor");
		label_18.setBounds(10, 123, 139, 14);
		panel_3.add(label_18);
		
		JLabel label_19 = new JLabel("Rest. y bar Mayan Grill");
		label_19.setBounds(10, 148, 125, 14);
		panel_3.add(label_19);
		
		JLabel label_20 = new JLabel("Eligir especialidades:");
		label_20.setBounds(262, 26, 125, 14);
		panel_3.add(label_20);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Desayunos internacionales ", "Almuerzos internacionales", "Cenas internacionales"}));
		comboBox.setBounds(245, 45, 139, 20);
		panel_3.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Desayuno", "Almuerzo", "Cenas Thai a la carta"}));
		comboBox_1.setBounds(245, 70, 139, 20);
		panel_3.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Pastas con un toque jamaiquino"}));
		comboBox_2.setBounds(245, 95, 139, 20);
		panel_3.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Especialidades de carnes.", "Carnes a la parrilla."}));
		comboBox_3.setBounds(245, 120, 139, 20);
		panel_3.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Sabores Mediterraneos", "Sabores Internacionales"}));
		comboBox_4.setBounds(245, 145, 139, 20);
		panel_3.add(comboBox_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(112, 128, 144));
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "Precios servicios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(527, 38, 258, 164);
		contentPane.add(panel_4);
		
		JLabel label_21 = new JLabel("Gimnacio");
		label_21.setBounds(21, 30, 60, 14);
		panel_4.add(label_21);
		
		JLabel label_22 = new JLabel("Discoteca");
		label_22.setBounds(21, 62, 60, 14);
		panel_4.add(label_22);
		
		JLabel label_23 = new JLabel("Centro de convenciones");
		label_23.setBounds(21, 87, 123, 14);
		panel_4.add(label_23);
		
		JLabel label_24 = new JLabel("Anfiteatro");
		label_24.setBounds(21, 112, 70, 14);
		panel_4.add(label_24);
		
		JLabel label_25 = new JLabel("Master Snack");
		label_25.setBounds(21, 144, 87, 14);
		panel_4.add(label_25);
		
		JLabel lblQPor = new JLabel("Q. 35.00 por persona");
		lblQPor.setBounds(143, 30, 117, 14);
		panel_4.add(lblQPor);
		
		JLabel lblQPor_2 = new JLabel("Q. 290.00 por grupo");
		lblQPor_2.setBounds(143, 87, 117, 14);
		panel_4.add(lblQPor_2);
		
		JLabel lblQPor_3 = new JLabel("Q. 39.00 por persona");
		lblQPor_3.setBounds(143, 112, 117, 14);
		panel_4.add(lblQPor_3);
		
		JLabel label_29 = new JLabel("Q. 40.00 por persona");
		label_29.setBounds(143, 144, 117, 14);
		panel_4.add(label_29);
		
		JLabel lblQPor_1 = new JLabel("Q. 18.00 por persona");
		lblQPor_1.setBounds(143, 62, 117, 14);
		panel_4.add(lblQPor_1);
	}
}
