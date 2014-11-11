import java.awt.*;
	import java.awt.event.*;
	
public class PruebaMenu {
	
	    private Frame ventana;
	 
	    public PruebaMenu(){
	        ventana = new Frame("Prueba de menu");
	        MenuBar principal = new MenuBar();
	 
	        //crearemos un menú clásico para que se entienda la idea
	        Menu archivo = new Menu("Archivo");
	        MenuItem archivo_abrir = new MenuItem("Abrir");
	        MenuItem archivo_guardar = new MenuItem("Guardar");
	        MenuItem archivo_guardarComo = new MenuItem("Guardar como...");
	        Menu importar = new Menu("Importar");
	        MenuItem archivo_salir = new MenuItem("Salir");
	 
	        //ahora, agregamos los elementos del menú archivo.
	        archivo.add(archivo_abrir);
	        archivo.add(archivo_guardar);
	        archivo.add(archivo_guardarComo);
	        archivo.addSeparator(); //agrega línea divisoria
	        archivo.add(importar);
	        archivo.add(archivo_salir);
	 
	        //los elementos del menú importar
	        MenuItem importar_imagen = new MenuItem("Importar desde imagen");
	        MenuItem importar_odf = new MenuItem("Importar desde ODF");
	        MenuItem importar_html = new MenuItem("Importar desde HTML");
	        MenuItem importar_pdf = new MenuItem("Importar desde HTML");
	        CheckboxMenuItem importar_repetidos = new CheckboxMenuItem("Importar elementos repetidos", true);
	        importar.add(importar_imagen);
	        importar.add(importar_odf);
	        importar.add(importar_html);
	        importar.add(importar_pdf);
	        importar.addSeparator();
	        importar.add(importar_repetidos);
	 
	        //agregar el listener para los elementos del menú
	        EscuchaItemMenu eim = new EscuchaItemMenu();
	        archivo_abrir.addActionListener(eim);
	        archivo_guardar.addActionListener(eim);
	        archivo_guardarComo.addActionListener(eim);
	        archivo_salir.addActionListener(eim);
	        importar_imagen.addActionListener(eim);
	        importar_odf.addActionListener(eim);
	        importar_html.addActionListener(eim);
	        importar_pdf.addActionListener(eim);
	        importar_repetidos.addItemListener(new ItemListener(){
	            public void itemStateChanged(ItemEvent e){
	                System.out.println("  Importar repetidos: " + (e.getStateChange() == ItemEvent.SELECTED));
	            }
	        });
	 
	        //ahora, indicamos que el menú "archivo" forma parte de la barra de menú
	        principal.add(archivo);
	 
	        //Por último, le decimos a la ventana cuál es su barra de menu
	        ventana.setMenuBar(principal);
	 
	        ventana.setSize(300, 300);
	        ventana.setResizable(false);
	        ventana.addWindowListener(new WindowListener(){
	            public void windowOpened(WindowEvent e){}
	            public void windowActivated(WindowEvent e){}
	            public void windowDeactivated(WindowEvent e){}
	            public void windowIconified(WindowEvent e){}
	            public void windowDeiconified(WindowEvent e){}
	            public void windowClosed(WindowEvent e){}
	            public void windowClosing(WindowEvent e){
	                ventana.setVisible(false);
	                ventana.dispose();
	            }
	        });
	        ventana.setVisible(true);
	    }
	 
	    class EscuchaItemMenu implements ActionListener{
	        public void actionPerformed(ActionEvent e){
	            MenuItem item = (MenuItem)e.getSource();
	            String texto = item.getLabel();
	            System.out.println("Opcion seleccionada: " + texto);
	            if (texto.equals("Salir")){
	                ventana.setVisible(false);
	                ventana.dispose();
	            }
	            else if (texto.equals("Importar elementos repetidos")){
	                CheckboxMenuItem check = (CheckboxMenuItem)e.getSource();
	                System.out.println("  Importa repetidos: " + check.getState());
	            }
	        }
	    }
	 
	    public static void main(String[] args){
	        PruebaMenu pm = new PruebaMenu();
	    }
	}
