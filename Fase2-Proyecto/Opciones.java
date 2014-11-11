import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import Guatemala.InterfazGuatemala;
import Nicaragua.InterfazNicaragua;
import Nicaragua1.InterfazNicaragua1;
import Panama.InterfazPanama;
import Salvador.InterfazSalvador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.UIManager;


public class Opciones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opciones frame = new Opciones();
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
	public Opciones() {
		setBackground(SystemColor.text);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\Hydrangeas.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 210);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setForeground(new Color(250, 240, 230));
		panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), "Bienvenido a Hoteles de Centro America", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(253, 245, 230)));
		panel.setBounds(10, 11, 264, 151);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Elija el pais que desea visitar");
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblNewLabel.setBounds(41, 27, 206, 14);
		panel.add(lblNewLabel);

		JButton Guatemala = new JButton("Guatemala");
		Guatemala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazGuatemala obj = new InterfazGuatemala();
				obj.setVisible(true);
				dispose();
			}
		});
		Guatemala.setBounds(41, 52, 88, 23);
		panel.add(Guatemala);

		JButton Salvador = new JButton("El Salvador");
		Salvador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazSalvador obj = new InterfazSalvador();
				obj.setVisible(true);
				dispose();
			}
		});
		Salvador.setBounds(149, 52, 98, 23);
		panel.add(Salvador);

		JButton Nicaragua = new JButton("Nicaragua");
		Nicaragua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//PrincipalNicaragua n = new PrincipalNicaragua();
				InterfazNicaragua1 obj = new InterfazNicaragua1();
				obj.setVisible(true);
				dispose();

			}
		});
		Nicaragua.setBounds(41, 86, 88, 23);
		panel.add(Nicaragua);

		JButton Panama = new JButton("Panama");
		Panama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazPanama obj = new InterfazPanama();
				obj.setVisible(true);
				dispose();
			}
		});
		Panama.setBounds(149, 86, 98, 23);
		panel.add(Panama);

		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Salir.setBounds(94, 120, 89, 23);
		panel.add(Salir);
	}
}
