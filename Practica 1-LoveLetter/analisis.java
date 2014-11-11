import java.util.Random;
public class analisis {

	public static int m=0;
	public static int n=0;
	public static int x=0;
	public static int y=0;

	public static void cartas(){ 
		Random rnd = new Random();	

		do{
			analisis.m= (int) (Math.random() * 15) + 0;
			analisis.n= (int) (Math.random() * 15) + 0;	
		}while(n==m);
		
		do{
			analisis.x= (int) (Math.random() * 15) + 0;
			analisis.y= (int) (Math.random() * 15) + 0;	
		}while(x==y);

	}
}
