import java.util.Scanner;
/*Programa que lee un numero escrito por pantalla y te devuelve la primera asignatura del dia
 * 
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejercicio1T5 {
	public static void main(String[] args) {
		
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("Escribe el dia que quieras saber la asignatura que te toca");
	  System.out.println("1.Lunes");
	  System.out.println("2.Martes");
	  System.out.println("3.Miercoles");
	  System.out.println("4.Jueves");
	  System.out.println("5.Viernes");
	  System.out.print("Escribe tu numero aqui: ");
	  int opcion;
	  opcion= s.nextInt();
	  
	  switch (opcion) {
	    
	    case 1:
	    
	    System.out.println("El lunes a primera tienes FOL");
	    break;
	    
	    case 2:
	    
	    System.out.println("El martes a primera tienes BD");
	    break;
	    case 3:
	    
	    System.out.println("El miercoles a primera tienes BD");
	    break;
	    case 4:
	    
	    System.out.println("El jueves a primera tienes Sist Inf");
	    break;
	    case 5:
	    
	    System.out.println("El viernes a primera tienes ED");
	    break;  
	  }
	}
}
