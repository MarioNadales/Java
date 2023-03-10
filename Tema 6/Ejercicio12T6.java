import java.util.Scanner;
public class Ejercicio12T6 {
  public static void main(String[] args) {

	Scanner s=new Scanner(System.in);

	System.out.println("Introduze un el numero de numeros que deseas ver de la serie fibonacci");
	
	int n;
	n= s.nextInt();
	
	switch (n) {
	case 1:	  
	  System.out.print("0");
	  
	break;
	
	case 2:	 
	  System.out.print("0 1");
	  
	break;
	
	default:
	
	System.out.print("0 1");
	
	int f1; 
	f1= 0;
	
	int f2;
	f2 = 1;
	
	int aux;
	aux=0;
	
	while(n > 2) {
	  
	  aux = f1;
	  f1 = f2;
	  f2 = aux + f2;
	  
	  System.out.print(" " + f2);
	  
	  n--;
	}
}
	}
}
