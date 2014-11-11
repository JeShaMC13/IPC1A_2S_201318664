package Nicaragua1;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class PrincipalNicaragua1 {

	public PrincipalNicaragua1() {
		// TODO Auto-generated constructor stub


			}

			private int Dia =0;
			private  String Mes ="";
			private String Pais ="";
			private int Habitaciones=0;
			private int Hospedaje=0;
			private String Tipohabitaciones= "Sencilla ,Regular, Exclusiva";
			private String Tipodepago="";
			private int salida=0;
			private int precio=0;
			private String Sencilla;
			private String Regular;
			private String Exclusiva;
		    private int habitacion;
		    private String Nombre;
		    private int Piso;
		    

		    /*ArrayList<String> Nombre1= new ArrayList();
		    public void agregardatos(String Nombre){
		    
		    	Nombre1.add(Nombre);	
		    }
		    public void mostrar(){
		    	
		    }*/
		    
		    
		    public PrincipalNicaragua1(String Nombre, int Piso, int Habitaciones,  String Tipohabitaciones){
		    	this.Nombre = Nombre;
		        this.Tipohabitaciones=Tipohabitaciones;
		        this.Piso=Piso;
		        this.setHabitaciones(Habitaciones);
		        
		    			
		    }
		    
		    
			public PrincipalNicaragua1(JTextField nombre2, JComboBox piso2,JSpinner habitaciones2, JTextField tipohabitaciones2) {
				// TODO Auto-generated constructor stub
			}


			public void getFecha(String a, String b){
				Dia = Integer.parseInt(a);
				Mes = b;
			}

			
			public void getPais(String d){
				Pais=d;
			}

			
			public void getHabitaciones(String e, String f, String h, String g){
				Habitaciones =Integer.parseInt(e);
				Hospedaje =Integer.parseInt(f);
				Tipohabitaciones=g;
				Tipodepago=h;

				//Precio por habitación	
				if (Tipohabitaciones==Sencilla){
						precio = Habitaciones*175;
				}else
					if(Tipohabitaciones==Regular){
							precio = Habitaciones*240;
					}else
							//if(Tipohabitaciones==Exclusiva ){
							precio = Habitaciones*300;
						
				
				//ASIGNACION DE HABITACIONES
				
				}
			
	/*switch(habitacion){
				case Sencilla:
						precio = Habitaciones*175;		
					break;
				case Regular:
					precio=Habitaciones *240;
					break;
				case Exclusiva:
				precio= Habitaciones*300;
					break;
				default:
				//	System.out.println("Opción no valida, elija unas de las opciones(1-4).");
					break;
				}*/
			

			public void getImprimir(){
				JOptionPane.showMessageDialog(null," Dias de hospedaje :  "+Hospedaje+"  No.de habitaciones:   " + getHabitaciones()+  "   Tipo de habitacines:  "+ Tipohabitaciones+"    Su forma de pago sera:  "+ Tipodepago+  "El precio a pagar por habitaciones es de: " +precio);
				JOptionPane.showMessageDialog(null,"La fecha de ingreso es:  " + Dia + "  Mes:  " +Mes+ "  Fecha de salida:    Dia:  " + (Dia +Hospedaje)+"  Mes:  " +Mes );

			}


			private String getExclusiva() {
				return Exclusiva;
			}


			private void setExclusiva(String exclusiva) {
				Exclusiva = exclusiva;
			}


			private int getPiso() {
				return Piso;
			}


			private void setPiso(int piso) {
				this.Piso = piso;
			}


			String getNombre() {
				return Nombre;
			}


			private void setNombre(String nombre) {
				Nombre = nombre;
			}


			int getHabitaciones() {
				return Habitaciones;
			}


			private void setHabitaciones(int habitaciones) {
				Habitaciones = habitaciones;
			}
	
	}


