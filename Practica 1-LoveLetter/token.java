import java.util.Scanner;

public class token {
	
	public static int numtoken=1;

	static void eleccion(){
		
		int numero;
		
			System.out.println("Elija la cantidad de tokens con la que desea jugar");
			
			do{	
			System.out.println("[1] Un token");
			System.out.println("[2] Tres token");
			System.out.println("[3] Siete tokens");

			Scanner t = new Scanner(System.in);
			numero = t.nextInt();

			switch(numero){

			case 1:
				token.numtoken=1;
				System.out.println("Jugando a 1 token \n");
				break;
			case 2:
				token.numtoken=3;
				System.out.println("Jugando a 3 tokens \n");
				break;
			case 3:
				token.numtoken=7;
				System.out.println("Jugando a 7 tokens \n");
			default:
				System.out.println("Opción no valida, elija unas de las opciones(1-3).");
			}
		}while(numero==1 && numero==2 && numero==3);
	}
}
