import java.util.Scanner;

public class salir{

	static void juego(){


		System.out.println("Está segur@ que desea salir");
		System.out.println("[1] Si");
		System.out.println("[2] No");

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		if(a==1){
			System.out.println("Te esperamos en la proxima partida");
			System.exit(0);
		}
	}
}
