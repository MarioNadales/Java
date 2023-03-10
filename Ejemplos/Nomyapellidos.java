/*Solicita tu nombre y luego tus apellidos para mostrarlos por pantalla
 * 
 * 
 */

public class Nomyapellidos {
  public static void main(String[] args) {
	
	String nombre;
	String apellidos;
	//se crean las variable donde se almacenaran los datos que se escriban
	System.out.println("Escribe tu nombre por favor");
	nombre = System.console().readLine();
	//primero te solicita el nombre y lo almacena en la variable
	System.out.println("Ahora escribeme tus apellidos");
	apellidos = System.console().readLine();
	//y luego lo mismo con los apellidos
	System.out.println("Hola, "+nombre+" "+apellidos+", encantado de conocerte");
	//al final aparecen juntos por pantalla
	
	
	}
}
