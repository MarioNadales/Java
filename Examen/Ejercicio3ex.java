import java.util.Scanner;
/*Programa que pregunta un dia un mes y un año y los muestra por pantalla
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejercicio3ex{
  public static void main (String[] args){
	
	Scanner s= new Scanner(System.in);
	
	System.out.println("Escribe tu dia de nacimiento");
	
	int dia;
	dia= s.nextInt();
	//Se crea la variable Scanner y se almacena en una variable int llamda dia
	Scanner s1= new Scanner(System.in);
	
	System.out.println("Escribe tu mes de nacimiento");
	
	String mes;
	mes= s1.nextLine();
	//Se crea la una nueva variable y se almacena la linea escrita por pantalla en un string
	Scanner s2= new Scanner(System.in);
	
	System.out.println("Escribe tu año de nacimiento");
	
	int año;
	año= s2.nextInt();
	//Se crea una tercera variable, se almacena en un int, y se muestra por pantalla la fecha completa
	System.out.println("mi fecha de nacimiento es:\033[31m "+dia+"\033[37m de\033[33m "+mes+"\033[37m de\033[31m "+año+"\033[37m");
    }
}
