import java.util.Scanner;
public class Ejercicio13T8 {
	
  public static void main (String[] args) {
	  
	Scanner n= new Scanner(System.in);
	
	int [] a=new int [100];
	
	int max= Integer.MIN_VALUE;
	int min= Integer.MAX_VALUE;
	
	for (int i=0; i<100; i++) {
	  
	  a[i]=(int)(Math.random()*501);
	  
	  if (a[i]<min) {
		min=a[i];
		  }
	  if (a[i]>max) {
		max=a[i];
		  }
	  
	  System.out.print(a[i]+" ");
	  }
	
	System.out.println("¿Quieres destacar el 1.maximo o el 2.minimo?");
	
	int teclado;
	teclado=n.nextInt();

	switch (teclado) {
		
	  case 1:
	    for (int i=0; i<100; i++) {
	  
	    if (a[i]==max){
		
		  System.out.print("**"+a[i]+"**");
	    }
	    else {
		  System.out.print(a[i]+" ");}
		}
	  break;
	  
	  case 2:
		for (int i=0; i<100; i++) {
	  
	    if (a[i]==min){
		
		  System.out.print("**"+a[i]+"**");
	    }
	    else {
		  System.out.print(a[i]+" ");}
		}
		break;	
	}
  }
}
