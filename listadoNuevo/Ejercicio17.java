/* Programa que introduces numeros y te dice si son primos o no, hasta que metes un 0
 * 
 * 
 * @autor Mario Nadales Suarez
*/
import misFunciones.Geometria;
import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);

    int x;
    x=0;


    do {x=s.nextInt();
    boolean primo;
    primo=Geometria.numPrimo(x);
      if (primo==false) {System.out.println("No es primo");
    } else {
      System.out.println("Es primo");
    }
      }
    while (x!=0); 
      
    
  
    
    
  }
}
