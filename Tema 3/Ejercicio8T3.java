import java.util.Scanner;
/*Programa que solicita un numero de horas trabajadas y calcula el dinero ganado por 12 euros la hora
 * 
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejercicio8T3 {
	public static void main(String[] args) {
	  
	  Scanner s = new Scanner(System.in);
	  
	  System.out.println("Escribe las horas trabajadas esta semana y te dire lo que has cobrado");
	  int horas;
	  horas= s.nextInt();
	  
	  int dinero;
	  dinero= horas * 12;
	  
	  System.out.println("Este es el dinero que has ganado esa semana= "+dinero);
	  
	}
}
