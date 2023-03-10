import java.util.Scanner;
/*Programa que solicita un numero de kb y calcula los mb
 * 
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejercicio11T3 {
	public static void main(String[] args) {
	  
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("Escribe un numero de kilo bytes y calculo los mega bytes");
	  
	  int kb;
	  kb= s.nextInt();
	  
	  double mb;
	  mb= (double)kb/1024;
	  
	  System.out.println("El numero de Mb con respecto a tus Kb es= "+mb);
	}
}
