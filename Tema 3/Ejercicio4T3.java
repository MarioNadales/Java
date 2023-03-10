/*Programa que solicita dos numeros y realiza la multiplicacion, la suma, la resta y la division
 * 
 * 
 * Autor= Mario Nadales Suarez
 */

public class Ejercicio4T3 {
	public static void main(String[] args) {
	  
	  String num;
	  
	  System.out.println("Escribe un numero cualquiera");
	  num= System.console().readLine();
	  int num1;
	  num1= Integer.parseInt(num);
	  
	  System.out.println("Escribe un segundo numero");
	  num= System.console().readLine();
	  int num2;
	  num2= Integer.parseInt(num);
	  
	  int suma;
	  suma=num1 + num2;
	  
	  int resta;
	  resta= num1 - num2;
	  
	  int mult;
	  mult= num1 * num2;
	  
	  double div;
	  div= (double)num1/(double)num2;
	  
	  System.out.println("\033[31mEl primer numero introducido es= "+num1);
	  System.out.println("El segundo numero introducido es= "+num2);
	  System.out.println("\033[33mEl resultado de la suma es= "+suma);
	  System.out.println("El resultado de la resta es= "+resta);
	  System.out.println("\033[31mEl resultado de la mult es= "+mult);
	  System.out.println("El resultado de la div es= "+div+"\033[37m");
	  
	  
	}
}
