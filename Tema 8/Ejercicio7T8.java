import java.util.Scanner;
public class Ejercicio7T8 {
	
  public static void main (String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	int[] num=new int [100];	
	
	int i=0;
	
	for (i=0; i<100; i++) {
	  
	  num[i]=(int)(Math.random()*21);	  
	 
	  System.out.print(" "+num[i]);
	 }
	System.out.println("");  
	System.out.println("Introduce un numero de la lista");
	int n1=s.nextInt();
	System.out.println("Introduce el numero por el que lo quieres sustituir");
	int n2=s.nextInt();
	
	for (i=0; i<100; i++) {
	  
	  if (num[i]==n1) {
		
		num[i]=n2;
		System.out.print("'"+num[i]+"'");
		
		}else {
			
			System.out.print(" "+num[i]+" ");
		  }
	 }
	 
  }
}

