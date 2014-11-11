package Nicaragua;

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
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import Salvador.PrincipalSalvador;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazNicaragua extends JFrame {

	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField NIT;
	private JTextField Telefono;
	private JTextField TipoHabitacion;

	/**
	 * Launch the application.
	 */
	PrincipalNicaragua n= new PrincipalNicaragua();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazNicaragua frame = new InterfazNicaragua();
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
	public InterfazNicaragua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 322, 446);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Datos personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(25, 29, 276, 95);
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
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Reservacion", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(25, 135, 276, 253);
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
		
		TipoHabitacion = new JTextField();
		TipoHabitacion.setColumns(10);
		TipoHabitacion.setBounds(118, 50, 133, 23);
		panel_2.add(TipoHabitacion);
		
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
		Listo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n.getFecha(Dia.getValue().toString(), Mes.getSelectedItem().toString());
			//	c.getPais(Pais.getSelectedItem().toString());
				n.getHabitaciones(Habitaciones.getValue().toString(), Hospedaje.getValue().toString(), Tipodepago.getSelectedItem().toString(), Tipohabitacion.getText().toString());
				n.getImprimir();

			}
		});
		Listo.setForeground(Color.BLACK);
		Listo.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		Listo.setBounds(14, 399, 89, 23);
		panel.add(Listo);
		
		JButton Limpiar = new JButton("Limpiar");
		Limpiar.setForeground(Color.BLACK);
		Limpiar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		Limpiar.setBounds(113, 399, 89, 23);
		panel.add(Limpiar);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Salir.setForeground(Color.BLACK);
		Salir.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		Salir.setBounds(212, 399, 89, 23);
		panel.add(Salir);
	}

}
