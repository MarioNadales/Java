/*Programa que solicita un numero de pesetas y realiza la conversion a euros
 * 
 * 
 * Autor= Mario Nadales Suarez
 */

public class Ejercicio3T3 {
	public static void main(String[] args) {
	  
	  String num;
	  
	  System.out.println("Dame una cantidad de pesetas y hare la conversion a euros");
	  num= System.console().readLine();
	  int pesetas;
	  pesetas= Integer.parseInt(num);
	  
	  double euros;
	  euros= pesetas / 166.38;
	  
	  System.out.println("El numero de euros con respecto a tu numero de pesetas son= "+euros);
	}
}
