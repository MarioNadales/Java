/*Programa que solicita 2 numeros y los multiplica 
 * 
 * 
 * Autor= Mario Nadales Suarez
 */

public class Ejercicio1T3 {
	public static void main(String[] args) {
	  
	  String numero;
	  
	  System.out.println("Introduce un numero por favor");
	  System.out.print("1º número=\033[31m ");
	  numero= System.console().readLine();
	  int numero1;
	  numero1= Integer.parseInt(numero);
	  
	  System.out.println("\033[37m Introduce un segundo numero y lo multiplicare por el primero");
	  System.out.print("2º número=\033[33m ");
	  numero= System.console().readLine();
	  int numero2;
	  numero2= Integer.parseInt(numero);
	  
	  int total;
	  total= numero1 * numero2;
	  
	  System.out.print("\033[39m El resultado de la multiplicacion es= \033[31m"+total+"\033[37m");
	}
}
    
