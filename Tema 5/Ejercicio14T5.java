/*Programa que calcula si un numero es par o no
 * 
 * Autor= Mario Nadales Suarez
 */
import java.util.Scanner;
public class Ejercicio14T5 {
	public static void main(String[] args) {
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("Escribe un numero y te dire si es par o no");
	  
	  int num;
	  num= s.nextInt(); 
	  
	  if (num%2==0){
		System.out.println("El numero que has introducido es par");
		  
	  } else {
		System.out.println("El numero que has introducido es impar");
		
    }
  }
}
