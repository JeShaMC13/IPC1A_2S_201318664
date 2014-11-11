package ListaEnlazada;

import javax.swing.border.EmptyBorder;

//import PruebaMenu.EscuchaItemMenu

import java.awt.*;
import java.awt.event.*;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
public class Canvas extends JFrame implements ActionListener{//implementando el listener de eventos
	JLabel Nombre;
	JButton Boton1;//creando variables globales de los botones
	JButton Boton2;
	public Object Botton1;
	public Object Botton2;
	public Object Label;

	public Canvas(){//constructor de la clase

		JFrame jf = new JFrame("Train Simulator");//creacion de ventana con el titulo
		jf.setLayout(new FlowLayout());//Configurar como se dispondra el espacio del jframe
		Dimension d = new Dimension();//objeto para obtener el ancho de la pantalla

		//Instanciando botones con texto
		JButton Boton1 = new JButton("Retroceder");
		JButton Boton2 = new JButton("Inicio");
		Boton1.setMargin(new Insets(1, 5, 3, 88));
		Boton2.setMargin(new Insets(1, 5, 3, 4));
		Boton1.setBackground(Color.WHITE);
		Boton2.setBackground(Color.WHITE);
		//contenedor = null;
		//contenedor.setLayout(null);  // Eliminamos el layout
		//contenedor.add (Boton1); // Añadimos el botón
		Boton1.setBounds (10,10,40,20); // Botón en posicion 10,10 con ancho 40 pixels y alto 20
		//agregando los botones a la ventana

		jf.add(Boton1, BorderLayout.SOUTH); 
		jf.add(Boton2, BorderLayout.EAST); 
		
		
		//añadiendo el listener a los botones para manipular los eventos del click
		Boton1.addActionListener(this);
		Boton2.addActionListener(this);

	
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X        
		jf.setResizable(false);//para configurar si se redimensiona la ventana
		jf.setLocation((int) ((d.getWidth()/2)+290), 50);//para ubicar inicialmente donde se muestra la ventana (x, y)
		jf.setSize(800, 600);//configurando tamaño de la ventana (ancho, alto)
		jf.setVisible(true);//configurando visualización de la venta
	//Por último, le decimos a la ventana cuál es su barra de menu
		
		class EscuchaItemMenu implements ActionListener{
			public void actionPerformed(ActionEvent e){
				MenuItem item = (MenuItem)e.getSource();
				String texto = item.getLabel();
				System.out.println("Opcion seleccionada: " + texto);
				if (texto.equals("Salir")){
					jf.setVisible(false);
					jf.dispose();
				}
				else if (texto.equals("Importar elementos repetidos")){
					CheckboxMenuItem check = (CheckboxMenuItem)e.getSource();
					System.out.println("  Importa repetidos: " + check.getState());
				}
			
			}
		}
	}
			public void paintComponent(Graphics g){
				super.paintComponents (g);
				//this.setBackground(Color.WHITE);
						
					g.setColor( Color.BLACK );
					g.fillRect( 15, 75, 100, 50 );
					
					g.setColor( Color.cyan );
					g.fillRect( 150, 75, 100, 50 );
					
					g.setColor( Color.YELLOW );
					g.fillRect( 250, 75, 100, 50 );
					
					g.setColor( Color.DARK_GRAY );
					g.fillRect( 400, 75, 100, 50 );
					
					g.setColor( Color.green );
					g.fillRect( 500, 75, 100, 50 );
					}
					public void update(Graphics g){
						//update(g);
					}
				
				
		
	//};

			private static void add(String string, Object b22) {
				// TODO Auto-generated method stub

			}

			public static void main(String[] args){/* throws IOException{*/

				Canvas S = new Canvas();//uso de constructor para la ventana

				
				
				
				//JFileChooser dig= new JFileChooser();
				//int Option = dig.showOpenDialog(this);



				/*		 Scanner scan= new Scanner(System.in);
	 		    System.out.println("Ingrese la ruta al archivo que desea leer ej: C://User/Desktop/file.txt");

	 		    String text= scan.nextLine();

	 		    System.out.println(text);
	           new Canvas(text);
	}

	 	public Canvas(String path) throws IOException
	 	{
	 		BufferedReader br = new BufferedReader(new FileReader(path));
	 	    try {
	 	        StringBuilder sb = new StringBuilder();
	 	        String line = br.readLine();

	 	        while (line != null) {
	 	            sb.append(line);
	 	            sb.append(System.lineSeparator());
	 	            line = br.readLine();
	 	        }
	 	        System.out.println(sb.toString());
	 	    } finally {
	 	        br.close();
	}

	}*/
			}
			
	
			@Override
			public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener
				if(e.getActionCommand().equals("Retroceder")){//podemos comparar por el contenido del boton
					JOptionPane.showMessageDialog(null, e.getActionCommand());
				}
				if(e.getActionCommand().equals("Inicio")){//podemos comparar por el contenido del boton
					JOptionPane.showMessageDialog(null, e.getActionCommand());
				}
				if(e.getSource()==Boton1){//podemos comparar por el nombre del objeto del boton
					JOptionPane.showMessageDialog(null, e.getActionCommand());
				}
				if(e.getSource()==Boton2){//podemos comparar por el nombre del objeto del boton
					JOptionPane.showMessageDialog(null, e.getActionCommand());
				}
			}
		}










