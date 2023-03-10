/*Programa que solicita un numero e indica si es capicua o no
 * 
 * Autor= Mario Nadales Suarez
 */
import java.util.Scanner;
public class Ejercicio20T5 {
	public static void main(String[] args) {
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("Escribe un numero y te dire si es capicua");
	  
	  int n;
	  n= s.nextInt();
	  
	  boolean cap;
	  cap = false;
	  
    if (n < 10) {
      cap = true;
    }
    
    if ((n >= 10) && (n < 100)) {
      if ((n / 10) == (n % 10)) {
        cap= true;
      }
    }

    if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        cap= true;
      }
    }

    if ((n >= 1000) && (n < 10000)) {
      if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
        cap= true;
      }
    }
    
    if (n >= 10000) {
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        cap= true;
      }
    }
    
    if (cap==true) {
      System.out.println("El número si es capicua.");
    } else {
      System.out.println("El número no es capicua.");
    }
  }
}
