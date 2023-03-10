/* Programa que imprime un numero dependiendo el numero introducido
 * 
 * 
 * @autor Mario Nadales Suarez
*/
import misFunciones.Geometria;
import java.util.Scanner;
public class Ejercicio4 {
  public static void main(String[]args) {
    
    Scanner s=new Scanner(System.in);
    System.out.print("Dame un numero: ");
    int x=s.nextInt();

    System.out.print("Si el numero introducido es negativo aparecera un -1 si es positivo un 1 y si es 0 el 0: "+Geometria.dimeSigno(x));
  }
}
