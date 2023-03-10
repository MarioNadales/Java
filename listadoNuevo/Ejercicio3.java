/* Programa que muestra el menor de 2 numeros introducidos
 * 
 * 
 * @autor Mario Nadales Suarez
*/
import misFunciones.Geometria;
import java.util.Scanner;
public class Ejercicio3 {
  public static void main(String []args) {
    
    Scanner s=new Scanner(System.in);

    int x=s.nextInt();
    int y=s.nextInt();


    System.out.println("El menor de los dos numeros es: "+misFunciones.Geometria.minimo(x, y));
  }
}
