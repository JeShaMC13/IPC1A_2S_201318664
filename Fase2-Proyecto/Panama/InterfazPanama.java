package Panama;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;

import LISTA.Usuario;
import Salvador.PrincipalSalvador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazPanama extends JFrame {
	DefaultListModel modelolista= new DefaultListModel();

	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField NIT;
	private JTextField Telefono;
	private JTextField Tipohabitaciones;

	/**
	 * Launch the application.
	 */
	PrincipalPanama p= new PrincipalPanama();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazPanama frame = new InterfazPanama();
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
	public InterfazPanama() {
		setForeground(new Color(0, 100, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 100, 0));
		contentPane.setForeground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 0));
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 322, 424);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(107, 142, 35));
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Datos personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(25, 11, 276, 95);
		panel.add(panel_1);
		
		JLabel label = new JLabel("Nombre");
		label.setBounds(20, 23, 46, 14);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("No.  telefono");
		label_1.setBounds(20, 45, 68, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("NIT");
		label_2.setBounds(20, 70, 46, 14);
		panel_1.add(label_2);
		
		Nombre = new JTextField();
		Nombre.setColumns(10);
		Nombre.setBounds(91, 20, 175, 19);
		panel_1.add(Nombre);
		
		NIT = new JTextField();
		NIT.setColumns(10);
		NIT.setBounds(91, 67, 175, 19);
		panel_1.add(NIT);
		
		Telefono = new JTextField();
		Telefono.setColumns(10);
		Telefono.setBounds(91, 42, 175, 19);
		panel_1.add(Telefono);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(107, 142, 35));
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Reservacion", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(25, 117, 276, 253);
		panel.add(panel_2);
		
		JLabel label_3 = new JLabel("No. habitaciones");
		label_3.setBounds(10, 20, 80, 14);
		panel_2.add(label_3);
		
		JSpinner Habitaciones = new JSpinner();
		Habitaciones.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		Habitaciones.setBounds(118, 16, 37, 23);
		panel_2.add(Habitaciones);
		
		JLabel label_4 = new JLabel("Tipo de habitaci\u00F3n");
		label_4.setBounds(10, 50, 98, 23);
		panel_2.add(label_4);
		
		Tipohabitaciones = new JTextField();
		Tipohabitaciones.setColumns(10);
		Tipohabitaciones.setBounds(118, 50, 133, 23);
		panel_2.add(Tipohabitaciones);
		
		JComboBox Piso = new JComboBox();
		Piso.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7"}));
		Piso.setBounds(118, 81, 37, 20);
		panel_2.add(Piso);
		
		JSpinner Hospedaje = new JSpinner();
		Hospedaje.setModel(new SpinnerNumberModel(1, 1, 15, 1));
		Hospedaje.setBounds(118, 112, 37, 23);
		panel_2.add(Hospedaje);
		
		JComboBox Tipodepago = new JComboBox();
		Tipodepago.setModel(new DefaultComboBoxModel(new String[] {"Tarjeta de credito.", "Tarjeta de debito.", "Cheque.", "Contado."}));
		Tipodepago.setBounds(118, 146, 131, 23);
		panel_2.add(Tipodepago);
		
		JComboBox Mes = new JComboBox();
		Mes.setModel(new DefaultComboBoxModel(new String[] {"Enero ", "Febrero", "Marzo ", "Abril", "Mayo ", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre ", "Diciembre"}));
		Mes.setBounds(153, 206, 82, 20);
		panel_2.add(Mes);
		
		JLabel label_5 = new JLabel("Mes");
		label_5.setBounds(121, 209, 22, 14);
		panel_2.add(label_5);
		
		JSpinner Dia = new JSpinner();
		Dia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		Dia.setBounds(67, 205, 37, 23);
		panel_2.add(Dia);
		
		JLabel label_6 = new JLabel("Dia");
		label_6.setBounds(35, 209, 22, 14);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("Fecha de reservac\u00F3n");
		label_7.setBounds(10, 180, 113, 14);
		panel_2.add(label_7);
		
		JLabel label_8 = new JLabel("Forma de pago");
		label_8.setBounds(10, 146, 80, 23);
		panel_2.add(label_8);
		
		JLabel label_9 = new JLabel("Dias de hospedaje");
		label_9.setBounds(10, 121, 98, 14);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("Piso");
		label_10.setBounds(10, 84, 46, 14);
		panel_2.add(label_10);
		
		JButton Listo = new JButton("Listo");
		Listo.setBackground(new Color(0, 100, 0));
		Listo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.getFecha(Dia.getValue().toString(), Mes.getSelectedItem().toString());
				//p.getPais(Pais.getSelectedItem().toString());
				p.getHabitaciones(Habitaciones.getValue().toString(), Hospedaje.getValue().toString(), Tipodepago.getSelectedItem().toString(), Tipohabitaciones.getText().toString());
				p.getImprimir();
			
				
			
			}
		});
		Listo.setForeground(new Color(248, 248, 255));
		Listo.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		Listo.setBounds(14, 381, 89, 23);
		panel.add(Listo);
		
		JButton Limpiar = new JButton("Limpiar");
		Limpiar.setBackground(new Color(0, 100, 0));
		Limpiar.setForeground(new Color(248, 248, 255));
		Limpiar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		Limpiar.setBounds(113, 381, 89, 23);
		panel.add(Limpiar);
		
		JButton Salir = new JButton("Salir");
		Salir.setBackground(new Color(0, 100, 0));
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Salir.setForeground(new Color(248, 248, 255));
		Salir.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		Salir.setBounds(212, 381, 89, 23);
		panel.add(Salir);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(107, 142, 35));
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Servicios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(324, 20, 196, 173);
		contentPane.add(panel_3);
		
		JLabel label_11 = new JLabel("Gimnacio");
		label_11.setBounds(20, 48, 68, 14);
		panel_3.add(label_11);
		
		JLabel label_12 = new JLabel("Discoteca");
		label_12.setBounds(20, 73, 46, 14);
		panel_3.add(label_12);
		
		JLabel label_13 = new JLabel("Centro de convenciones");
		label_13.setBounds(20, 98, 125, 14);
		panel_3.add(label_13);
		
		JLabel label_14 = new JLabel("Anfiteatro");
		label_14.setBounds(20, 123, 54, 14);
		panel_3.add(label_14);
		
		JLabel label_15 = new JLabel("Master Snack");
		label_15.setBounds(20, 148, 68, 14);
		panel_3.add(label_15);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(155, 70, 29, 20);
		panel_3.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_1.setBounds(155, 95, 29, 20);
		panel_3.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_2.setBounds(155, 120, 29, 20);
		panel_3.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_3.setBounds(155, 45, 29, 20);
		panel_3.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_4.setBounds(155, 145, 29, 20);
		panel_3.add(spinner_4);
		
		JLabel label_16 = new JLabel("Personas a asistir:");
		label_16.setBounds(100, 21, 96, 14);
		panel_3.add(label_16);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(107, 142, 35));
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Restaurantes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(328, 208, 402, 173);
		contentPane.add(panel_4);
		
		JLabel label_17 = new JLabel("Rest. Mayan Place");
		label_17.setBounds(10, 48, 103, 14);
		panel_4.add(label_17);
		
		JLabel label_18 = new JLabel("Personas a asistir:");
		label_18.setBounds(125, 26, 96, 14);
		panel_4.add(label_18);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(160, 70, 29, 20);
		panel_4.add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(160, 95, 29, 20);
		panel_4.add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(160, 120, 29, 20);
		panel_4.add(spinner_7);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(160, 45, 29, 20);
		panel_4.add(spinner_8);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(160, 145, 29, 20);
		panel_4.add(spinner_9);
		
		JLabel label_19 = new JLabel("Rest. Mayan Nights");
		label_19.setBounds(10, 73, 103, 14);
		panel_4.add(label_19);
		
		JLabel label_20 = new JLabel("Rest. Italian Noodles");
		label_20.setBounds(10, 98, 103, 14);
		panel_4.add(label_20);
		
		JLabel label_21 = new JLabel("Rest. Mediterranean Flavor");
		label_21.setBounds(10, 123, 139, 14);
		panel_4.add(label_21);
		
		JLabel label_22 = new JLabel("Rest. y bar Mayan Grill");
		label_22.setBounds(10, 148, 125, 14);
		panel_4.add(label_22);
		
		JLabel label_23 = new JLabel("Eligir especialidades:");
		label_23.setBounds(262, 26, 125, 14);
		panel_4.add(label_23);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Desayunos internacionales ", "Almuerzos internacionales", "Cenas internacionales"}));
		comboBox.setBounds(245, 45, 139, 20);
		panel_4.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Desayuno", "Almuerzo", "Cenas Thai a la carta"}));
		comboBox_1.setBounds(245, 70, 139, 20);
		panel_4.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Pastas con un toque jamaiquino"}));
		comboBox_2.setBounds(245, 95, 139, 20);
		panel_4.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Especialidades de carnes.", "Carnes a la parrilla."}));
		comboBox_3.setBounds(245, 120, 139, 20);
		panel_4.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Sabores Mediterraneos", "Sabores Internacionales"}));
		comboBox_4.setBounds(245, 145, 139, 20);
		panel_4.add(comboBox_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(173, 255, 47));
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(null, "Precios servicios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(530, 20, 258, 164);
		contentPane.add(panel_5);
		
		JLabel label_24 = new JLabel("Gimnacio");
		label_24.setBounds(21, 30, 60, 14);
		panel_5.add(label_24);
		
		JLabel label_25 = new JLabel("Discoteca");
		label_25.setBounds(21, 62, 60, 14);
		panel_5.add(label_25);
		
		JLabel label_26 = new JLabel("Centro de convenciones");
		label_26.setBounds(21, 87, 123, 14);
		panel_5.add(label_26);
		
		JLabel label_27 = new JLabel("Anfiteatro");
		label_27.setBounds(21, 112, 70, 14);
		panel_5.add(label_27);
		
		JLabel label_28 = new JLabel("Master Snack");
		label_28.setBounds(21, 144, 87, 14);
		panel_5.add(label_28);
		
		JLabel label_29 = new JLabel("Q. 25.00 por persona");
		label_29.setBounds(143, 30, 117, 14);
		panel_5.add(label_29);
		
		JLabel label_30 = new JLabel("Q. 250.00 por grupo");
		label_30.setBounds(143, 87, 117, 14);
		panel_5.add(label_30);
		
		JLabel label_31 = new JLabel("Q. 35.00 por persona");
		label_31.setBounds(143, 112, 117, 14);
		panel_5.add(label_31);
		
		JLabel label_32 = new JLabel("Q. 40.00 por persona");
		label_32.setBounds(143, 144, 117, 14);
		panel_5.add(label_32);
		
		JLabel label_33 = new JLabel("Q. 15.00 por persona");
		label_33.setBounds(143, 62, 117, 14);
		panel_5.add(label_33);
	}

}
