import java.util.Scanner;

public class menu {

	public static void main(String[] args) {

		int selec = 0;
		do{
			System.out.println("..::Bienvenido a Love Letter::.. \n");
			System.out.println("[1] Jugar una partida");
			System.out.println("[2] Seleccionar el número de tokens a jugar");
			System.out.println("[3] Mostrar las reglas de juego");
			System.out.println("[4] Salir");

			Scanner s = new Scanner(System.in);

			selec = s.nextInt();

			switch(selec){

			case 1:
				iniciar_juego.partida();
				break;

			case 2:
				token.eleccion();
				break;

			case 3:
				reglas.juego();
				break;

			case 4:
				//analisis.cartas();
				salir.juego();
				
				break;

			default:
				System.out.println("Opción no valida, elija unas de las opciones(1-4).");
				break;
			}
		}while(selec == 1 || selec == 2 || selec == 3 || selec == 4);
	}

}
