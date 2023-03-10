/*Programa que muestra por pantalla una piramide en una direccion segun le indiques
 * 
 * Autor= Mario Nadales Suarez
 */
import java.util.Scanner;
public class Ejercicio15T5 {
	public static void main(String[] args) {
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("Escribe un numero dependiendo de la direccion que quieras de la piramide");
	  System.out.println("1.arriba");
	  System.out.println("2.izquierda");
	  System.out.println("3.derecha");
	  System.out.println("4.abajo");
	  
	  int num;
	  num= s.nextInt();
	  
	  switch (num) {
		  case 1:
		    
		    System.out.println("  *");
		    System.out.println(" ***");
		    System.out.println("*****");
		  break;
		  case 2:
		    System.out.println("  *");
		    System.out.println(" **");
		    System.out.println("***");
		    System.out.println(" **");
		    System.out.println("  *");
		  break;
		  case 3:
		    System.out.println(" *");
		    System.out.println(" **");
		    System.out.println(" ***");
		    System.out.println(" **");
		    System.out.println(" *");
		  break;
		  case 4:
		    System.out.println("******");
		    System.out.println(" ***");
		    System.out.println("  *");
		    
		}	    
	}
}
