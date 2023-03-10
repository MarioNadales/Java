/*Programa que muestra por pantalla la primera cifra dek numero que escribas
 * 
 * Autor= Mario Nadales Suarez
 */
import java.util.Scanner;
public class Ejercicio18T5 {
	public static void main(String[] args) {
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("Escribe un numero y te dire la primera cifra");
	  
	  int num;
	  num= s.nextInt();
	  
	  int cifra;
	  cifra= num;
	  
	  if ((0<num)&&(num<=9)) {
		
		cifra= num;
		
	   } if ((10<=num)&&(num<=99)) {
		   
		cifra= num/10;
		
	   }if ((100<=num)&&(num<=999)) {
		   
		cifra= num/100;
		
	   }if ((1000<=num)&&(num<=9999)) {
		   
		cifra= num/1000;
		
	   }if ((10000<=num)&&(num<=99999)) {
		   
		cifra= num/10000;
		
		
	   }System.out.println("La primera cifra de tu numero es= "+cifra);
}
}

