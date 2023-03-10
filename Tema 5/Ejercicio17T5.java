/*Programa que te dice la ultima cifra del numero que escribas
 * 
 * Autor= Mario Nadales Suarez
 */
import java.util.Scanner;
public class Ejercicio17T5 {
	public static void main(String[] args) {
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("Escribe un numero entero y te dire la ultima cifra");
	  
	  int num;
	  num= s.nextInt();
	  
	  int cifra;
	  cifra= num%10;
	
	  System.out.println("La ultima cifra de tu numero es= "+cifra);
	}
}
