/*Programa que solicita la base y la altura de un rectangulo y calcula el area
 * 
 * 
 * Autor= Mario Nadales Suarez
 */

public class Ejercicio5T3 {
	public static void main(String[] args) {
	  
	  String num;
	  
	  System.out.println("Escribe la base de un rectangulo");
	  num= System.console().readLine();
	  double base;
	  base= Double.parseDouble(num);
		
	  System.out.println("Ahora escribeme la altura del mismo rectangulo");
	  num= System.console().readLine();
	  double altura;
	  altura= Double.parseDouble(num);
	  
	  double area;
	  area= base * altura;
	  
	  System.out.println("La base que introdujiste es= "+base);
	  System.out.println("La altura que introdujiste es= "+altura);
	  System.out.println("El area del rectangulo es= "+area);
	  
	  
	}
}
