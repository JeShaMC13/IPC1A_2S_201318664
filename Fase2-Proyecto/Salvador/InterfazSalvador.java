package Salvador;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
public class InterfazSalvador<With> extends JFrame {
	protected static final String Items = null;

	java.util.ArrayList<Salvador.PrincipalSalvador>arreglo, mostrar;

	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField NIT;
	private JTextField Telefono;
	private JTextField Tipohabitaciones;

	/**
	 * Launch the application.
	 */

	PrincipalSalvador s= new PrincipalSalvador();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazSalvador frame = new InterfazSalvador();
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
	public InterfazSalvador() {

		arreglo= new java.util.ArrayList<>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 10, 322, 446);
		contentPane.add(panel);

		JPanel panel_1 = new JPanel();
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
		Nombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				//String a[][]= new String[Nombre][Habitacion];
				//	a[0][0]=Nombre.getText().toString(), Habitacion.getValue().toString();








			}
		});
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
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Reservacion", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(25, 117, 276, 253);
		panel.add(panel_2);

		JLabel label_3 = new JLabel("No. habitaciones");
		label_3.setBounds(10, 20, 80, 14);
		panel_2.add(label_3);

		JSpinner Habitaciones = new JSpinner();
		Habitaciones.setModel(new SpinnerNumberModel(1, 1, 18, 1));
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
		Hospedaje.setBounds(118, 112, 37, 23);
		panel_2.add(Hospedaje);

		JComboBox Tipodepago = new JComboBox();
		Tipodepago.setModel(new DefaultComboBoxModel(new String[] {"Tarjeta de credito.", "Tarjeta de debito.", "Cheque", "Contado"}));
		Tipodepago.setBounds(118, 146, 131, 23);
		panel_2.add(Tipodepago);

		JComboBox Mes = new JComboBox();
		Mes.setModel(new DefaultComboBoxModel(new String[] {"Enero ", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre ", "Noviembre ", "Diciembre"}));
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
		Listo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.getFecha(Dia.getValue().toString(), Mes.getSelectedItem().toString());
				//		c.getPais(Pais.getSelectedItem().toString());
				s.getHabitaciones(Habitaciones.getValue().toString(), Hospedaje.getValue().toString(), Tipodepago.getSelectedItem().toString(), Tipohabitaciones.getText().toString());
				s.getImprimir();


			}
		});
		Listo.setForeground(Color.BLACK);
		Listo.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		Listo.setBounds(14, 381, 89, 23);
		panel.add(Listo);


		JButton Limpiar = new JButton("Limpiar");
		Limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				arreglo.add(new Salvador.PrincipalSalvador(Nombre, Piso, Habitaciones, Tipohabitaciones));




				//Listar();


			}

			/*private void Listar() {
				javax.swing.DefaultListModel modelo;
				modelo=new javax.swing.DefaultListModel();


				for(int i=0; i<arreglo.size(); i++){
					modelo.addElement(arreglo.get(i).getNombre()+ ""+ arreglo.get(i).getHabitaciones());
				}
				List=modelo;
			}*/
		});
		Limpiar.setForeground(Color.BLACK);
		Limpiar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		Limpiar.setBounds(113, 381, 89, 23);
		panel.add(Limpiar);

		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Salir.setForeground(Color.BLACK);
		Salir.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		Salir.setBounds(212, 381, 89, 23);
		panel.add(Salir);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Servicios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(332, 29, 196, 173);
		contentPane.add(panel_3);

		JLabel lblRecreacinAcuatica = new JLabel("Gimnacio");
		lblRecreacinAcuatica.setBounds(20, 48, 68, 14);
		panel_3.add(lblRecreacinAcuatica);

		JLabel lblDiscoteca = new JLabel("Discoteca");
		lblDiscoteca.setBounds(20, 73, 46, 14);
		panel_3.add(lblDiscoteca);

		JLabel lblCentroDeConvenciones = new JLabel("Centro de convenciones");
		lblCentroDeConvenciones.setBounds(20, 98, 125, 14);
		panel_3.add(lblCentroDeConvenciones);

		JLabel lblAnfiteatro = new JLabel("Anfiteatro");
		lblAnfiteatro.setBounds(20, 123, 54, 14);
		panel_3.add(lblAnfiteatro);

		JLabel lblMasterSnack = new JLabel("Master Snack");
		lblMasterSnack.setBounds(20, 148, 68, 14);
		panel_3.add(lblMasterSnack);

		JSpinner Discoteca = new JSpinner();
		Discoteca.setModel(new SpinnerNumberModel(1, 1, 50, 1));
		Discoteca.setBounds(155, 70, 29, 20);
		panel_3.add(Discoteca);

		JSpinner Convenciones = new JSpinner();
		Convenciones.setModel(new SpinnerNumberModel(1, 1, 200, 1));
		Convenciones.setBounds(155, 95, 29, 20);
		panel_3.add(Convenciones);

		JSpinner Anfiteatro = new JSpinner();
		Anfiteatro.setModel(new SpinnerNumberModel(1, 1, 75, 1));
		Anfiteatro.setBounds(155, 120, 29, 20);
		panel_3.add(Anfiteatro);

		JSpinner Gimnacio = new JSpinner();
		Gimnacio.setModel(new SpinnerNumberModel(1, 1, 40, 1));
		Gimnacio.setBounds(155, 45, 29, 20);
		panel_3.add(Gimnacio);

		JSpinner Snack = new JSpinner();
		Snack.setModel(new SpinnerNumberModel(1, 1, 25, 1));
		Snack.setBounds(155, 145, 29, 20);
		panel_3.add(Snack);

		JLabel label_11 = new JLabel("Personas a asistir:");
		label_11.setBounds(100, 21, 96, 14);
		panel_3.add(label_11);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Precios servicios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(538, 38, 258, 164);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel = new JLabel("Gimnacio");
		lblNewLabel.setBounds(21, 30, 60, 14);
		panel_4.add(lblNewLabel);

		JLabel lblDiscoteca_1 = new JLabel("Discoteca");
		lblDiscoteca_1.setBounds(21, 62, 60, 14);
		panel_4.add(lblDiscoteca_1);

		JLabel lblCentroDeConvenciones_1 = new JLabel("Centro de convenciones");
		lblCentroDeConvenciones_1.setBounds(21, 87, 123, 14);
		panel_4.add(lblCentroDeConvenciones_1);

		JLabel lblAnfiteatro_1 = new JLabel("Anfiteatro");
		lblAnfiteatro_1.setBounds(21, 112, 70, 14);
		panel_4.add(lblAnfiteatro_1);

		JLabel lblMasterSnack_1 = new JLabel("Master Snack");
		lblMasterSnack_1.setBounds(21, 144, 87, 14);
		panel_4.add(lblMasterSnack_1);

		JLabel lblQ = new JLabel("Q. 25.00 por persona");
		lblQ.setBounds(143, 30, 117, 14);
		panel_4.add(lblQ);

		JLabel lblQPor = new JLabel("Q. 250.00 por grupo");
		lblQPor.setBounds(143, 87, 117, 14);
		panel_4.add(lblQPor);

		JLabel lblQPor_1 = new JLabel("Q. 35.00 por persona");
		lblQPor_1.setBounds(143, 112, 117, 14);
		panel_4.add(lblQPor_1);

		JLabel lblQPor_2 = new JLabel("Q. 40.00 por persona");
		lblQPor_2.setBounds(143, 144, 117, 14);
		panel_4.add(lblQPor_2);

		JLabel lblQPor_3 = new JLabel("Q. 15.00 por persona");
		lblQPor_3.setBounds(143, 62, 117, 14);
		panel_4.add(lblQPor_3);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Restaurantes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(332, 227, 402, 173);
		contentPane.add(panel_5);

		JLabel lblRestMayanPlace = new JLabel("Rest. Mayan Place");
		lblRestMayanPlace.setBounds(10, 48, 103, 14);
		panel_5.add(lblRestMayanPlace);

		JLabel lblPersonasAAsistiran = new JLabel("Personas a asistir:");
		lblPersonasAAsistiran.setBounds(125, 26, 96, 14);
		panel_5.add(lblPersonasAAsistiran);

		JSpinner MayanNights = new JSpinner();
		MayanNights.setModel(new SpinnerNumberModel(1, 1, 25, 1));
		MayanNights.setBounds(160, 70, 29, 20);
		panel_5.add(MayanNights);

		JSpinner Italian = new JSpinner();
		Italian.setModel(new SpinnerNumberModel(1, 1, 25, 1));
		Italian.setBounds(160, 95, 29, 20);
		panel_5.add(Italian);

		JSpinner Flavor = new JSpinner();
		Flavor.setModel(new SpinnerNumberModel(1, 1, 25, 1));
		Flavor.setBounds(160, 120, 29, 20);
		panel_5.add(Flavor);

		JSpinner MayanPlace = new JSpinner();
		MayanPlace.setModel(new SpinnerNumberModel(1, 1, 25, 1));
		MayanPlace.setBounds(160, 45, 29, 20);
		panel_5.add(MayanPlace);

		JSpinner Grill = new JSpinner();
		Grill.setModel(new SpinnerNumberModel(1, 1, 25, 1));
		Grill.setBounds(160, 145, 29, 20);
		panel_5.add(Grill);

		JLabel lblRestMayanNighs = new JLabel("Rest. Mayan Nights");
		lblRestMayanNighs.setBounds(10, 73, 103, 14);
		panel_5.add(lblRestMayanNighs);

		JLabel lblRestItalianNoodles = new JLabel("Rest. Italian Noodles");
		lblRestItalianNoodles.setBounds(10, 98, 103, 14);
		panel_5.add(lblRestItalianNoodles);

		JLabel lblRestMediterraneanFlavor = new JLabel("Rest. Mediterranean Flavor");
		lblRestMediterraneanFlavor.setBounds(10, 123, 139, 14);
		panel_5.add(lblRestMediterraneanFlavor);

		JLabel lblRestYBar = new JLabel("Rest. y bar Mayan Grill");
		lblRestYBar.setBounds(10, 148, 125, 14);
		panel_5.add(lblRestYBar);

		JLabel lblEligirEspecialidades = new JLabel("Eligir especialidades:");
		lblEligirEspecialidades.setBounds(262, 26, 125, 14);
		panel_5.add(lblEligirEspecialidades);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Desayunos internacionales ", "Almuerzos internacionales", "Cenas internacionales"}));
		comboBox.setBounds(245, 45, 139, 20);
		panel_5.add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Desayuno", "Almuerzo", "Cenas Thai a la carta"}));
		comboBox_1.setBounds(245, 70, 139, 20);
		panel_5.add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Pastas con un toque jamaiquino"}));
		comboBox_2.setBounds(245, 95, 139, 20);
		panel_5.add(comboBox_2);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Especialidades de carnes.", "Carnes a la parrilla."}));
		comboBox_3.setBounds(245, 120, 139, 20);
		panel_5.add(comboBox_3);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Sabores Mediterraneos", "Sabores Internacionales"}));
		comboBox_4.setBounds(245, 145, 139, 20);
		panel_5.add(comboBox_4);

		JList list = new JList();
		list.setValueIsAdjusting(true);
		list.setBounds(332, 226, 161, 173);
		contentPane.add(list);
	}
}
