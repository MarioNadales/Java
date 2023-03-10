/* Programa que calcula el area y el perimetro de un rectangulo
 * 
 * 
 * @autor Mario Nadales Suarez
*/
import misFunciones.Geometria;
import java.util.Scanner;
public class Ejercicio7 {
  public static void main(String []args) {
    
    Scanner s=new Scanner(System.in);

    double ancho;
    
    double largo;

    System.out.println("Escribe el largo y el ancho para poder calcular el area y el perimetro");
    System.out.print("Largo: ");
    largo=s.nextDouble();
    System.out.print("Ancho: ");
    ancho=s.nextDouble();

    System.out.println("El perimetro del rectangulo es: "+Geometria.perimetroRectangulo(ancho, largo));
    System.out.print("El area del rectangulo es: "+Geometria.areaRectangulo(ancho, largo));
  }
}
