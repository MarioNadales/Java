/* Programa que el sumatorio desde 1 hasta un numero introducido
 * 
 * 
 * @autor Mario Nadales Suarez
*/
import misFunciones.Geometria;
import java.util.Scanner;
public class Ejercicio8_1 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);

    int num;
    num=s.nextInt();

    System.out.print(Geometria.sumaN(num));
  }
}
