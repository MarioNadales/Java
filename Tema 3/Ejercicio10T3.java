import java.util.Scanner;
/*Programa que solicita un numero de mb y calcula los kb
 * 
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejercicio10T3 {
	public static void main(String[] args) {
	  
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("Escribe un numero de mega bytes y calculo los kilo bytes");
	  
	  int mb;
	  mb= s.nextInt();
	  
	  int kb;
	  kb= mb * 1024;
	  
	  System.out.println("El numero de Kb con respecto a tus Mb es= "+kb);
	}
}
