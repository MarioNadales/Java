/* Programa que muestra pantalla desde el 0 hasta el numero introducido
 * 
 * 
 * Autor= Mario Nadales Suarez
 */
import java.util.Scanner;
public class Ej2EjmploBucle {
	public static void main(String[] args) {
	  
	  Scanner num= new Scanner(System.in);
	  int num2=num.nextInt();
	  
	  for (int num1=0; num1<=num2; num1++) {
		  System.out.println(num1);
	 }
}
}
