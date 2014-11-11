
import java.util.Scanner;

public class iniciar_juego {

	static void partida(){	
		String jugador1;
		int tokj1=0;
		int tokcpu=0;
				
		System.out.println("Ingrese su nombre");
		Scanner s = new Scanner(System.in);
		jugador1 = s.next();
		
		String contrincante;
		System.out.println("Ingrese el nombre de su contrincante");
		Scanner u = new Scanner(System.in);
		contrincante = s.next();
		
		String a[];
		a=new String[16];
		a[0]="Baron";
		a[1]="Guard";
		a[2]="Guard";
		a[3]="Guard";
		a[4]="Guard";
		a[5]="Guard";
		a[6]="Countess";
		a[7]="Prince";
		a[8]="Baron";
		a[9]="Baron";
		a[10]="Priest";
		a[11]="Priest";
		a[12]="Handmain";
		a[13]="Handmain";
		a[14]="King";
		a[15]="Princess";

		int b[];
		b=new int[8];

		b[0]=1;
		b[1]=2;
		b[2]=3;
		b[3]=4;
		b[4]=5;
		b[5]=6;
		b[6]=7;
		b[7]=8;

	
		System.out.println(jugador1+ " vrs. "+contrincante+ ":");
		System.out.println("''"+jugador1+"'' -->("+tokj1+")       ''"+contrincante+"''-->("+tokcpu+")");

		//Cartas aleatorios del jugador.
		do{
			analisis.m= (int) (Math.random() * 15) + 0;
			analisis.n= (int) (Math.random() * 15) + 0;	
		}while(analisis.n==analisis.m);
		System.out.println("Se esta jugando con ("+token.numtoken+") token(s)");
		System.out.println("Tienes en tu mano: "+ a[analisis.n]+ "  ->   "+a[analisis.m]);
	
		System.out.println("(1) Usar carta  "   +a[analisis.n]);
	System.out.println("(2) Usar carta  " +a[analisis.m]);
	
	//Cartas aleatorios del jugador.	
	do{
			analisis.x= (int) (Math.random() * 15) + 0;
			analisis.y= (int) (Math.random() * 15) + 0;	
		}while(analisis.x==analisis.y);

		
		
		
		
				//logica del juego que todavia no esta
		do{
		System.out.println("\n \n Ganador de la ronda");
		System.out.println("[1] "+jugador1);
		System.out.println("[2] "+contrincante);
		
		int vencedor=s.nextInt();
		
		switch(vencedor){
		case 1:
			tokj1+=1;
			break;
		case 2:
			tokcpu+=1;
			break;
		default:
			System.out.println("No valido");
		}
		
		
		
		
		}while(tokj1!=token.numtoken && tokcpu!=token.numtoken);
	
		//fin de la logica del juego
		if(tokj1==token.numtoken){
			System.out.println(jugador1+" gana!!!! XD");
		} 
		
		if(tokcpu==token.numtoken){
			System.out.println(contrincante+" gana!!!! XD");	
		}
		
			
		System.out.println("Game Over!!!!!");
		System.out.println("¿Regresar el menu principal?\n[1] Si\n[2] No");
		int opcion = s.nextInt();
		
		if(opcion==2){
			salir.juego();
		}
	}
}

