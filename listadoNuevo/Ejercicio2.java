import misFunciones.Geometria;
import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String []args) {
  
    Scanner s=new Scanner(System.in);

    int edad2;
    edad2=s.nextInt();

    Boolean mayor;
    mayor=misFunciones.Geometria.edad(edad2);

    if (mayor==true) {
    
      System.out.println("Es mayor de edad");

    }else {System.out.println("No es mayor de edad");}
    
  }
}
