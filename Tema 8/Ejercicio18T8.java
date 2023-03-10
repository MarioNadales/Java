import java.util.Scanner;
public class Ejercicio18T8 {
	
  public static void main (String[] args) {
    
    Scanner s=new Scanner(System.in);
    
    int n;
    n=10;
    
    int [] a=new int [n];
    
    int [] b=new int [n];
    
    int [] aux=new int [n];
    
    int menor=0;
    int mayor=0;
    
    for (int i=0; i<n; i++) {
	  
	  a[i]=(int)(Math.random()*201);
	  
	  System.out.print(a[i]+" ");
	  
	  if (a[i]<=100) {
	    b[i]=a[i]; 
	    menor++;
		  } else {aux[i]=a[i]; mayor++;}
	 }System.out.println();

    for (int i=0; i<n; i++) {
		a[i]=b[i];
		menor--;
	 }else {
		  a[i]=aux[i];
		  mayor--;
			 }
	  System.out.print(a[i]+" ");
	}
  }


