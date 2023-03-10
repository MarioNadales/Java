import java.util.Scanner;
public class Ejercicio5T8 {
	
  public static void main (String[] args) {
	
	Scanner s= new Scanner(System.in);
	
	int [] num= new int [10];
	
	int maximo = Integer.MIN_VALUE;
	int minimo = Integer.MAX_VALUE;
	
	int i;
	
	System.out.println("Introduce numeros enteros");
	
	for (i=0; i<10; i++) {
	  
	  num[i]=s.nextInt();
	  
	  if (num[i]<minimo) {
	    
	    minimo=num[i];
	  
	}
	if (num[i]>maximo){
	  
	  maximo=num[i];
	  
    }
  }
    System.out.println(" ");
  
    for (i=0; i<10; i++) {

	  if (num[i]==maximo) {
	    System.out.print("maximo: ");
	  }else {System.out.println(num[i]+" ");}
	  if (num[i]==minimo) {
		System.out.print("minimo: ");
		
	  }else {System.out.println(num[i]+" ");}
	}
  }
}
