import java.util.Scanner;
/*Programa que pregunta el nombre y la edad y la muestra por pantalla
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejercicio4ex{
  public static void main (String[] args){
  
    Scanner s= new Scanner(System.in);
    
    System.out.println("Escribe tu nombre y tu edad porfavor");
    
    String nom;
    nom= s.nextLine();
    
    int edad;
    edad= s.nextInt();
    //Se crea una variable Scanner que almacena un nombre y una edad en variables string e int, y se musestran por pantalla
    System.out.println("Mi nombre es: "+nom+" y tengo "+edad+" años");
    }
}
