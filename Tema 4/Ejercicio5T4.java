import java.util.Scanner;
public class Ejercicio5T4 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, introduzca el valor de a");
    
    double a;
    a= s.nextInt();
    
    System.out.println("Por favor, introduzca el valor de b y solucionare una ecuacion de primer grado.");
    
    double b;
    b= s.nextInt();
    
    double total;
    total= -b/a;
    
    if (a==0) {
	  System.out.println("Esta ecuacion no tiene resultacio");
		}else {
		  System.out.println("El resultado de la ecuacion es= "+total);
			}
    
    }
}
