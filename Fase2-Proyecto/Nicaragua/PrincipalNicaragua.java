package Nicaragua;

import javax.swing.JOptionPane;

public interface PrincipalNicaragua {
public PrincipalNicaragua(){

	}

	private int Dia =0;
	private  String Mes ="";
	private String Pais ="";
	private int Habitaciones=0;
	private int Hospedaje=0;
	private String Tipohabitacion= "Sencilla ,Regular, Exclusiva";
	private String Tipodepago="";
	private int salida=0;
	private int precio=0;
	private String Sencilla;
	private String Regular;
	private String Exclusiva;
   private int habitacion;


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

		//Precio por habitaci�n	
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
	 public void Asignaciones(){
		
	 }
		
		switch(habitacion){
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
		//	System.out.println("Opci�n no valida, elija unas de las opciones(1-4).");
			break;
		}
	

	public void getImprimir(){
		JOptionPane.showMessageDialog(null,"Pais en el que se hospedara:  " +Pais+"  Dias de hospedaje :  "+Hospedaje+"  No.de habitaciones:   " + Habitaciones+  "   Tipo de habitacines:  "+ Tipohabitaciones+"    Su forma de pago sera:  "+ Tipodepago+  "El precio a pagar por habitaciones es de: " +precio);
		JOptionPane.showMessageDialog(null,"La fecha de ingreso es:  " + Dia + "  Mes:  " +Mes+ "  Fecha de salida:    Dia:  " + (Dia +Hospedaje)+"  Mes:  " +Mes );

	}*/
	

}
