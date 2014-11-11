import java.util.Scanner;
import javax.swing.JOptionPane;
public class Tarea3 {
	public static void main(String[] args) {
        int num1=0;
        Scanner hola = new Scanner(System.in); 
        num1= hola.nextInt();
       JOptionPane.showMessageDialog(null, hola);
        if(num1>0){
            if (num1%2==0){
                JOptionPane.showMessageDialog(null, num1);
          
             }
            else {
                   System.out.println("Es Positivo e impar");
            } 
        }
        else if (num1<0) {
            
            if (num1%2==0){
            System.out.println("Es Negativo y par");
             }
            else {
                   System.out.println("Es Negativo e impar");
             
        }
    }
    }
}
