import java.util.Scanner;
public class Ejercicio15T6 {
  public static void main(String[] args) {

	  Scanner s= new Scanner(System.in);
	  	  
	System.out.println("Introduze una base y un exponente");
	
	int base;
	base= s.nextInt();
	
	int exp;
	exp= s.nextInt();
	
	int p;
	p=0;
	
	int exp2;
	exp2=0;
	
	for (int i = 1; i <= exp; i++) {
	  p = 1;
	  exp2 = i;
	 
	  for (int n = 0; n < exp2; n++) {
	    p *= base;
	    
	}
	  System.out.println(base + "^" + i + " = " + p);
	}
  }
}
