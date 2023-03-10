/* Programa que multiplica 2 numeros introducidos por teclado
 * 
 * @autor Mario Nadales Suarez
*/
import misFunciones.Geometria;
import java.util.Scanner;
public class Ejercicio1 {
  public static void main(String []args) {
    
    Scanner s=new Scanner(System.in);
    
    double x;
    double y;

    x=s.nextDouble();
    y=s.nextDouble();

    double num;
    num= misFunciones.Geometria.multiplica(x, y);

    System.out.println(num);
  }
}
