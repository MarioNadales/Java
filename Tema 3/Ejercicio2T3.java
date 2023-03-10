/*Programa que solicita un numero de euros y realiza la conversion a pesetas
 * 
 * 
 * Autor= Mario Nadales Suarez
 */

public class Ejercicio2T3 {
	public static void main(String[] args) {
	  
	  String num;
	  
	  System.out.println("Dame una cantidad de euros y hare la conversion a pesetas");
	  num= System.console().readLine();
	  int euros;
	  euros= Integer.parseInt(num);
	  
	  double pesetas;
	  pesetas= euros * 166.38;
	  
	  System.out.println("El numero de pesetas con respecto a tu numero de euros son= "+pesetas);
	}
}

    
