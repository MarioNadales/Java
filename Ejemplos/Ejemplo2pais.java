/*Programa que hace una ppreguntay si respondes bien aparece un mensaje, si es incorrecto aparecere otro
 * 
 * Autor: Mario Nadales Suarez
 */

public class Ejemplo2pais {
  public static void main(String[] args) {
	
	System.out.print("¿Cual es el idioma oficial de Argentina? ");
	String respuesta = System.console().readLine();
	//Se hace una pregunta y se lee un mensaje por pantalla
	if (respuesta.equals("español")) {
	System.out.println("¡La respuesta es correcta!");
	//El mensaje se iguala a la respuesta correcta y aparecera su correspondiente mensaje
	} else {
	System.out.println("Lo siento, la respuesta es incorrecta.");
	//Si es incorrecto mostrara otro mensaje
}	
	}
}
