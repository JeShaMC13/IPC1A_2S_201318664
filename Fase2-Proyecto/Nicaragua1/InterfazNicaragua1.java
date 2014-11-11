package
Nicaragua1;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
public class InterfazNicaragua1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField Tipohabitaciones;

	private JTextField Nombre;
	private JTextField NIT;
	private JTextField Telefono;

	
	
	PrincipalNicaragua1 n= new PrincipalNicaragua1();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazNicaragua1 frame = new InterfazNicaragua1();
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
	public InterfazNicaragua1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 20, 60));
		contentPane.setForeground(new Color(139, 69, 19));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setForeground(new Color(210, 180, 140));
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Datos personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(21, 11, 276, 95);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Nombre");
		label.setBounds(20, 23, 46, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("No.  telefono");
		label_1.setBounds(20, 45, 68, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("NIT");
		label_2.setBounds(20, 70, 46, 14);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(91, 20, 175, 19);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(91, 67, 175, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(91, 42, 175, 19);
		panel.add(textField_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setForeground(new Color(210, 180, 140));
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Reservacion", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(21, 117, 276, 253);
		contentPane.add(panel_1);
		
		JLabel label_3 = new JLabel("No. habitaciones");
		label_3.setBounds(10, 20, 80, 14);
		panel_1.add(label_3);
		
		JSpinner Habitaciones = new JSpinner();
		Habitaciones.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		Habitaciones.setBounds(118, 16, 37, 23);
		panel_1.add(Habitaciones);
		
		JLabel label_4 = new JLabel("Tipo de habitaci\u00F3n");
		label_4.setBounds(10, 50, 98, 23);
		panel_1.add(label_4);
		
		Tipohabitaciones = new JTextField();
		Tipohabitaciones.setColumns(10);
		Tipohabitaciones.setBounds(118, 50, 133, 23);
		panel_1.add(Tipohabitaciones);
		
		JComboBox Piso = new JComboBox();
		Piso.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7"}));
		Piso.setBounds(118, 81, 37, 20);
		panel_1.add(Piso);
		
		JSpinner Hospedaje = new JSpinner();
		Hospedaje.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		Hospedaje.setBounds(118, 112, 37, 23);
		panel_1.add(Hospedaje);
		
		JComboBox Tipodepago = new JComboBox();
		Tipodepago.setModel(new DefaultComboBoxModel(new String[] {"Tarjeta de credito.", "Tarjeta de debito.", "Cheque", "Contado"}));
		Tipodepago.setBounds(118, 146, 131, 23);
		panel_1.add(Tipodepago);
		
		JComboBox Mes = new JComboBox();
		Mes.setModel(new DefaultComboBoxModel(new String[] {"Enero ", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre ", "Noviembre ", "Diciembre"}));
		Mes.setBounds(153, 206, 82, 20);
		panel_1.add(Mes);
		
		JLabel label_5 = new JLabel("Mes");
		label_5.setBounds(121, 209, 22, 14);
		panel_1.add(label_5);
		
		JSpinner Dia = new JSpinner();
		Dia.setModel(new SpinnerNumberModel(0, 0, 31, 1));
		Dia.setBounds(67, 205, 37, 23);
		panel_1.add(Dia);
		
		JLabel label_6 = new JLabel("Dia");
		label_6.setBounds(35, 209, 22, 14);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Fecha de reservac\u00F3n");
		label_7.setBounds(10, 180, 113, 14);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("Forma de pago");
		label_8.setBounds(10, 146, 80, 23);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Dias de hospedaje");
		label_9.setBounds(10, 121, 98, 14);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("Piso");
		label_10.setBounds(10, 84, 46, 14);
		panel_1.add(label_10);
		
		JButton button = new JButton("Listo");
		button.setBackground(new Color(75, 0, 130));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n.getFecha(Dia.getValue().toString(), Mes.getSelectedItem().toString());
				//		c.getPais(Pais.getSelectedItem().toString());
				n.getHabitaciones(Habitaciones.getValue().toString(), Hospedaje.getValue().toString(), Tipodepago.getSelectedItem().toString(), Tipohabitaciones.getText().toString());
				n.getImprimir();
			}
		});
		button.setForeground(new Color(248, 248, 255));
		button.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		button.setBounds(10, 381, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Limpiar");
		button_1.setBackground(new Color(75, 0, 130));
		button_1.setForeground(new Color(248, 248, 255));
		button_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		button_1.setBounds(109, 381, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Salir");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		button_2.setBackground(new Color(75, 0, 130));
		button_2.setForeground(new Color(248, 248, 255));
		button_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		button_2.setBounds(208, 381, 89, 23);
		contentPane.add(button_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(211, 211, 211));
		panel_2.setForeground(new Color(210, 180, 140));
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Servicios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(328, 19, 196, 173);
		contentPane.add(panel_2);
		
		JLabel label_11 = new JLabel("Gimnacio");
		label_11.setBounds(20, 48, 68, 14);
		panel_2.add(label_11);
		
		JLabel label_12 = new JLabel("Discoteca");
		label_12.setBounds(20, 73, 46, 14);
		panel_2.add(label_12);
		
		JLabel label_13 = new JLabel("Centro de convenciones");
		label_13.setBounds(20, 98, 125, 14);
		panel_2.add(label_13);
		
		JLabel label_14 = new JLabel("Anfiteatro");
		label_14.setBounds(20, 123, 54, 14);
		panel_2.add(label_14);
		
		JLabel label_15 = new JLabel("Master Snack");
		label_15.setBounds(20, 148, 68, 14);
		panel_2.add(label_15);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_3.setBounds(155, 70, 29, 20);
		panel_2.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_4.setBounds(155, 95, 29, 20);
		panel_2.add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_5.setBounds(155, 120, 29, 20);
		panel_2.add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_6.setBounds(155, 45, 29, 20);
		panel_2.add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_7.setBounds(155, 145, 29, 20);
		panel_2.add(spinner_7);
		
		JLabel label_16 = new JLabel("Personas a asistir:");
		label_16.setBounds(100, 21, 96, 14);
		panel_2.add(label_16);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 248, 220));
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "Precios servicios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(534, 28, 258, 164);
		contentPane.add(panel_3);
		
		JLabel label_17 = new JLabel("Gimnacio");
		label_17.setBounds(21, 30, 60, 14);
		panel_3.add(label_17);
		
		JLabel label_18 = new JLabel("Discoteca");
		label_18.setBounds(21, 62, 60, 14);
		panel_3.add(label_18);
		
		JLabel label_19 = new JLabel("Centro de convenciones");
		label_19.setBounds(21, 87, 123, 14);
		panel_3.add(label_19);
		
		JLabel label_20 = new JLabel("Anfiteatro");
		label_20.setBounds(21, 112, 70, 14);
		panel_3.add(label_20);
		
		JLabel label_21 = new JLabel("Master Snack");
		label_21.setBounds(21, 144, 87, 14);
		panel_3.add(label_21);
		
		JLabel label_22 = new JLabel("Q. 25.00 por persona");
		label_22.setBounds(143, 30, 117, 14);
		panel_3.add(label_22);
		
		JLabel label_23 = new JLabel("Q. 250.00 por grupo");
		label_23.setBounds(143, 87, 117, 14);
		panel_3.add(label_23);
		
		JLabel label_24 = new JLabel("Q. 35.00 por persona");
		label_24.setBounds(143, 112, 117, 14);
		panel_3.add(label_24);
		
		JLabel label_25 = new JLabel("Q. 40.00 por persona");
		label_25.setBounds(143, 144, 117, 14);
		panel_3.add(label_25);
		
		JLabel label_26 = new JLabel("Q. 15.00 por persona");
		label_26.setBounds(143, 62, 117, 14);
		panel_3.add(label_26);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(211, 211, 211));
		panel_4.setForeground(new Color(210, 180, 140));
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Restaurantes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(328, 217, 402, 173);
		contentPane.add(panel_4);
		
		JLabel label_27 = new JLabel("Rest. Mayan Place");
		label_27.setBounds(10, 48, 103, 14);
		panel_4.add(label_27);
		
		JLabel label_28 = new JLabel("Personas a asistir:");
		label_28.setBounds(125, 26, 96, 14);
		panel_4.add(label_28);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(160, 70, 29, 20);
		panel_4.add(spinner_8);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(160, 95, 29, 20);
		panel_4.add(spinner_9);
		
		JSpinner spinner_10 = new JSpinner();
		spinner_10.setBounds(160, 120, 29, 20);
		panel_4.add(spinner_10);
		
		JSpinner spinner_11 = new JSpinner();
		spinner_11.setBounds(160, 45, 29, 20);
		panel_4.add(spinner_11);
		
		JSpinner spinner_12 = new JSpinner();
		spinner_12.setBounds(160, 145, 29, 20);
		panel_4.add(spinner_12);
		
		JLabel label_29 = new JLabel("Rest. Mayan Nights");
		label_29.setBounds(10, 73, 103, 14);
		panel_4.add(label_29);
		
		JLabel label_30 = new JLabel("Rest. Italian Noodles");
		label_30.setBounds(10, 98, 103, 14);
		panel_4.add(label_30);
		
		JLabel label_31 = new JLabel("Rest. Mediterranean Flavor");
		label_31.setBounds(10, 123, 139, 14);
		panel_4.add(label_31);
		
		JLabel label_32 = new JLabel("Rest. y bar Mayan Grill");
		label_32.setBounds(10, 148, 125, 14);
		panel_4.add(label_32);
		
		JLabel label_33 = new JLabel("Eligir especialidades:");
		label_33.setBounds(262, 26, 125, 14);
		panel_4.add(label_33);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Desayunos internacionales ", "Almuerzos internacionales", "Cenas internacionales"}));
		comboBox_3.setBounds(245, 45, 139, 20);
		panel_4.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Desayuno", "Almuerzo", "Cenas Thai a la carta"}));
		comboBox_4.setBounds(245, 70, 139, 20);
		panel_4.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Pastas con un toque jamaiquino"}));
		comboBox_5.setBounds(245, 95, 139, 20);
		panel_4.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Especialidades de carnes.", "Carnes a la parrilla."}));
		comboBox_6.setBounds(245, 120, 139, 20);
		panel_4.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Sabores Mediterraneos", "Sabores Internacionales"}));
		comboBox_7.setBounds(245, 145, 139, 20);
		panel_4.add(comboBox_7);
	}
}
