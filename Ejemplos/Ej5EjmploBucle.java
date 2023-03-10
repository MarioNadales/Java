/* Programa que solicita una base y un exponente y los calcula
 * 
 * 
 * Autor= Mario Nadales Suarez
 */
import java.util.Scanner;
public class Ej5EjmploBucle {
	public static void main(String[] args) {
	  
	  Scanner s= new Scanner(System.in);
	  
	  int a;
	  a= s.nextInt();
	  
	  int b;
	  b= s.nextInt();
	  
	  int prod;
	  prod=1;
	  
	  int acum;
	  acum= 1;
	  
	  for (int cont=1; b>=cont; cont++) {		 
		 
		 prod= prod * a;
		 
		 acum=prod;

		} 
	    System.out.println("La respuesta es= "+acum);
	}
}
