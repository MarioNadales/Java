import java.util.Scanner;
public class Ejercicio14T6 {
  public static void main(String[] args) {

	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("Introduce una base y un exponente y te dire el resultado");
	  
	  int a;
	  a= s.nextInt();
	  
	  int b;
	  b= s.nextInt();
	  
	  int prod;
	  prod=1;
	  
	  int acum;
	  acum= 1;
	  
	  for (int cont=1; b>=cont; cont++) {		 
		 
		 prod= prod * a;
		 
		 acum=prod;

		} 
	    System.out.println("La respuesta es= "+acum);
	}
}
