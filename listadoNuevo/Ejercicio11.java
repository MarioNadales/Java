/* Programa que imprime la tabla de multiplicar de un numero introducido
 * 
 * 
 * @autor Mario Nadales Suarez
*/
import misFunciones.Geometria;
import java.util.Scanner;
public class Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);

    double num;
    num=s.nextDouble();

    System.out.print(" "+Geometria.tabla(num));
  }
}
