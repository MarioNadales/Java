/*Programa que solicita tres notas y calcula la media sumandolas y dividiendolas entre 3
 * 
 * Autor= Mario Nadales Suarez
 */

import java.util.Scanner;
public class Ejercicio7T4 {

  public static void main(String[] args){
	
	Scanner s= new Scanner(System.in);
	
	System.out.println("Dame tres notas y calculare la media");
	
	double n1;
	n1= s.nextDouble();
	
	double n2;
	n2= s.nextDouble();
	
	double n3;
	n3= s.nextDouble();
	
	double total;
	total= (n1+n2+n3) / 3;
	
	System.out.println("Tu nota media es= "+total);
    }
}
