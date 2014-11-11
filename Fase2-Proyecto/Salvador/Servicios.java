package Salvador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JList;

public class Servicios extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Servicios frame = new Servicios();
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
	public Servicios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Servicios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 196, 173);
		contentPane.add(panel);
		
		JLabel Gimnacio = new JLabel("Gimnacio");
		Gimnacio.setBounds(20, 48, 68, 14);
		panel.add(Gimnacio);
		
		JLabel label_1 = new JLabel("Discoteca");
		label_1.setBounds(20, 73, 46, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Centro de convenciones");
		label_2.setBounds(20, 98, 125, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Anfiteatro");
		label_3.setBounds(20, 123, 54, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Master Snack");
		label_4.setBounds(20, 148, 68, 14);
		panel.add(label_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(155, 70, 29, 20);
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(155, 95, 29, 20);
		panel.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(155, 120, 29, 20);
		panel.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(155, 45, 29, 20);
		panel.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(155, 145, 29, 20);
		panel.add(spinner_4);
		
		JLabel label_5 = new JLabel("Personas a asistir:");
		label_5.setBounds(100, 21, 96, 14);
		panel.add(label_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Precios servicios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 204, 252, 164);
		contentPane.add(panel_1);
		
		JLabel label_6 = new JLabel("Gimnacio");
		label_6.setBounds(21, 30, 60, 14);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Discoteca");
		label_7.setBounds(21, 62, 60, 14);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("Centro de convenciones");
		label_8.setBounds(21, 87, 123, 14);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Anfiteatro");
		label_9.setBounds(21, 112, 70, 14);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("Master Snack");
		label_10.setBounds(21, 144, 87, 14);
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel("Q. 25.00 por persona");
		label_11.setBounds(143, 30, 117, 14);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("Q. 250.00 por grupo");
		label_12.setBounds(143, 87, 117, 14);
		panel_1.add(label_12);
		
		JLabel label_13 = new JLabel("Q. 35.00 por persona");
		label_13.setBounds(143, 112, 117, 14);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("Q. 40.00 por persona");
		label_14.setBounds(143, 144, 117, 14);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("Q. 15.00 por persona");
		label_15.setBounds(143, 62, 117, 14);
		panel_1.add(label_15);
		
		JList lista = new JList();
		lista.setBounds(286, 53, 131, 281);
		contentPane.add(lista);
	}
}
