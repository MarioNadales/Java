/*Programa que solicita la base imponible de una factura y calcula y suma el IVA
 * 
 * 
 * Autor= Mario Nadales Suarez
 */

public class Ejercicio7T3 {
	public static void main(String[] args) {
	  
	  String num;
	  
	  System.out.println("Escribe el coste de tu factura sin IVA y yo lo calculare");
	  num= System.console().readLine();
	  double baseImp;
	  baseImp= Double.parseDouble(num);
	  
	  double iva;
	  iva= 0.21;
	  
	  double total;
	  total= (baseImp * 0.21) + baseImp;
	  
	  System.out.println("Esta es tu factura sin IVA= "+baseImp);
	  System.out.println("Esta es tu factura con IVA= "+total);
	  

	
	}
}
