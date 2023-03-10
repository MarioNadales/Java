import java.util.Scanner;
/*Programa que solicita la nota del primer examen y la que quieres sacar en el trimestre luego calcula lo que debes sacar en el segundo
 * 
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejercicio12T3 {
	public static void main(String[] args) {
	  
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("Escribe la nota que sacaste en el primer examen");	  
	  double nota1;
	  nota1= s.nextDouble();
	  
	  System.out.println("Escribe la nota que quieres tener en el trimestre");
	  double tri;
	  tri= s.nextDouble();
	  
	  double tri2;
	  tri2=-(nota1 * 0.40)+tri;
	  
	  double nota2;
	  nota2= tri2/0.60;
	  	  
	  System.out.println("En el 2º examen debes sacar un = "+nota2);
	}
}
