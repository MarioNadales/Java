/*Programa que solicita tres notas y calcula la media sumandolas y dividiendolas entre 3 y te dice si suspendes o no
 * 
 * Autor= Mario Nadales Suarez
 */

import java.util.Scanner;
public class Ejercicio8T4 {

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
	
	if (total<5){
	System.out.println("Lo siento has suspendido");	
	
	} else if (total>=5 && total<6) {  
	  System.out.println("Has aprobado por los pelos con un suficiente");
	} else  if(total>=6 && total<7) {			   
	  System.out.println("Tu nota es un bien");
	} else if (total>=7 && total<9) {
	  System.out.println("Tu nota es un notable");
	} else if (total>=9 && total<10) {
	  System.out.println("Tu nota es un sobresaliente");
	} else if (total==10) {
	  System.out.println("Tu nota es un 10");	 
	}
	
		System.out.println("Tu nota media es= "+total);
	}
}
