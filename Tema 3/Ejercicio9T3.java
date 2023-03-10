import java.util.Scanner;
/*Programa que solicita la altura y base de un cono y calcula el volumen
 * 
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejercicio9T3 {
	public static void main(String[] args) {
      
      Scanner s = new Scanner(System.in);
	  
	  System.out.println("Escribe la altura del cono");
      double alt;
      alt= s.nextDouble();
     
      System.out.println("Ademas escribe la base del cono y calculare el volumen");
      double r; 
      r= s.nextDouble();
      
      double pi;
      pi= 3.14;
      
      double v; 
      v= (1.0/3.0) * pi * (r * r) * alt;
      System.out.println("El volumen del cono es de " +v+ " cm³");
  }
}

