import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

import java.util.Date;
import java.util.Calendar;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
public class Interfaz extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//protected static final Component  = null;
	private JTextField txtnombre;
	private JTextField txtNumero;
	private JTextField txtnit;
	//private JTextField textField;


	
	private JTextField Tipohabitaciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		getContentPane().setBackground(SystemColor.window);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 494);
		getContentPane().setLayout(null);

		JButton btnDatos = new JButton("Listo");
		btnDatos.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		btnDatos.setForeground(Color.BLACK);
		btnDatos.setBounds(10, 419, 89, 23);
		getContentPane().add(btnDatos);

		Panel panel = new Panel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(20, 10, 266, 126);
		getContentPane().add(panel);
		panel.setLayout(null);

		txtnit = new JTextField();
		txtnit.setBounds(96, 95, 86, 20);
		panel.add(txtnit);
		txtnit.setColumns(10);

		txtNumero = new JTextField();
		txtNumero.setBounds(96, 64, 153, 20);
		panel.add(txtNumero);
		txtNumero.setColumns(10);

		JLabel lblNit = new JLabel("NIT");
		lblNit.setBounds(10, 101, 46, 14);
		panel.add(lblNit);

		JLabel lblNoDeTelefono = new JLabel("No. de telefono");
		lblNoDeTelefono.setBounds(10, 67, 80, 14);
		panel.add(lblNoDeTelefono);

		JLabel lbNombre = new JLabel("Nombre");
		lbNombre.setBounds(10, 33, 46, 23);
		panel.add(lbNombre);

		txtnombre = new JTextField();
		txtnombre.setBounds(96, 30, 153, 23);
		panel.add(txtnombre);
		txtnombre.setColumns(10);

		JLabel lblDatosClientes = new JLabel("Datos clientes");
		lblDatosClientes.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 15));
		lblDatosClientes.setBounds(70, 5, 135, 14);
		panel.add(lblDatosClientes);

		Panel panel_1 = new Panel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBounds(20, 142, 266, 271);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNoHabitaciones = new JLabel("No. habitaciones");
		lblNoHabitaciones.setBounds(10, 36, 80, 14);
		panel_1.add(lblNoHabitaciones);


		JLabel lblTipoDeHabitacin = new JLabel("Tipo de habitaci\u00F3n");
		lblTipoDeHabitacin.setBounds(10, 71, 98, 23);
		panel_1.add(lblTipoDeHabitacin);

		JLabel lblFormaDePago = new JLabel("Forma de pago");
		lblFormaDePago.setBounds(10, 167, 80, 23);
		panel_1.add(lblFormaDePago);

		JLabel lblServicios = new JLabel("Reservaci\u00F3n");
		lblServicios.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 15));
		lblServicios.setBounds(77, 11, 113, 14);
		panel_1.add(lblServicios);


		JComboBox Tipodepago = new JComboBox();
		Tipodepago.setBounds(118, 167, 131, 23);
		panel_1.add(Tipodepago);
		Tipodepago.setModel(new DefaultComboBoxModel(new String[] {"Tarjeta de credito.", "Tarjeta de debito.", "Cheque", "Efectivo"}));

		JSpinner Habitaciones = new JSpinner();
		Habitaciones.setModel(new SpinnerNumberModel(1, 1, 20, 1));
		Habitaciones.setBounds(118, 32, 37, 23);
		panel_1.add(Habitaciones);

		JLabel lblFechaDeReservacn = new JLabel("Fecha de reservac\u00F3n");
		lblFechaDeReservacn.setBounds(10, 201, 113, 14);
		panel_1.add(lblFechaDeReservacn);

		JSpinner Dia = new JSpinner();
		Dia.setModel(new SpinnerNumberModel(1, 1, 36, 1));
		Dia.setBounds(67, 226, 37, 23);
		panel_1.add(Dia);

		JLabel lblDiasDeHopedaje = new JLabel("Dias de hospedaje");
		lblDiasDeHopedaje.setBounds(10, 142, 98, 14);
		panel_1.add(lblDiasDeHopedaje);

		JSpinner Hospedaje = new JSpinner();
		Hospedaje.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		Hospedaje.setBounds(118, 133, 37, 23);
		panel_1.add(Hospedaje);

		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(35, 230, 22, 14);
		panel_1.add(lblDia);

		JComboBox Mes = new JComboBox();
		Mes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril ", "Mayo", "Junio", "Julio ", "Agosto ", "Septiembre ", "Noviembre", "Diciembre"}));
		Mes.setBounds(153, 227, 82, 20);
		panel_1.add(Mes);
		
		Tipohabitaciones = new JTextField();
		Tipohabitaciones.setBounds(118, 71, 133, 23);
		panel_1.add(Tipohabitaciones);
		Tipohabitaciones.setColumns(10);
		
		JLabel lblPiso = new JLabel("Piso");
		lblPiso.setBounds(10, 105, 46, 14);
		panel_1.add(lblPiso);
		
		JComboBox Nopiso = new JComboBox();
		Nopiso.setBounds(118, 102, 87, 20);
		panel_1.add(Nopiso);
		Nopiso.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7"}));
		
				JLabel lblMes = new JLabel("Mes");
				lblMes.setBounds(121, 230, 22, 14);
				panel_1.add(lblMes);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		btnSalir.setForeground(Color.BLACK);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(208, 419, 89, 23);
		getContentPane().add(btnSalir);
		
				JButton btnLimpiar = new JButton("Limpiar");
				btnLimpiar.setBounds(109, 419, 89, 23);
				getContentPane().add(btnLimpiar);
				btnLimpiar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
				btnLimpiar.setForeground(Color.BLACK);
		btnDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				c.getFecha(Dia.getValue().toString(), Mes.getSelectedItem().toString());
				//c.getPais(Pais.getSelectedItem().toString());
				c.getHabitaciones(Habitaciones.getValue().toString(), Hospedaje.getValue().toString(), Tipodepago.getSelectedItem().toString(), Tipohabitaciones.getText().toString());
				c.getImprimir();

			}
		});
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
