/*Genera 1 numero y debes adivinarlo sin verlo
 * 
 * Autor= Mario Nadales Suarez
 */
import java.util.Scanner;
public class Ejercicio6T7 {
  public static void main (String[] args) {
	  
	  Scanner s= new Scanner(System.in);
	  
      int num;
	  num=0;
	  
	for (int i=0; i<=4; i++) {
	  
	  num=(int)(Math.random()*101);
      int num1;
	  num1=s.nextInt();
      if (num==num1){
		System.out.println("Bien es el numero correcto");
	 } else{
	 }  System.out.println("Lo siento no es ese numero");
    }
  }
}
