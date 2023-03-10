/*Programa que iguala una variable con un color si son iguales se muestra un mensage y si son distintos otro
 * 
 *Autor: Mario Nadales Suarez
 */

public class Ejemplo1colores{
  public static void main(String[]args){
	//declaramos la variable String
	String miFruta = "rojo";
	
	if ("naranja".equals(miFruta)) {
	//Si la variable string es igual a naranja escribira por pantalla que son iguales
	System.out.println("iguales");
	} else {
	//Si son diferentes como es el caso aparecera la palabra distintas
	System.out.println("distintas");
}
	}
}
