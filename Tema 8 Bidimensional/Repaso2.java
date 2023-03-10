import java.util.Scanner;
public class Repaso2 {
  public static void main (String []Args) {
  
    Scanner s=new Scanner(System.in);
  
    System.out.println("Escribe el numero de filas y columnas del array");
  
    int f=s.nextInt();
  
    int c=s.nextInt();
  
    int [][] n=new int [f][c];
  
    int [] p= new int [200];
  
    int num=0;
    
    int aux=0;
  
    for (int filas=0; filas<f; filas++) {
	  for (int colum=0; colum<c; colum++) {
	  
	  //  n[filas][colum]=(int)(Math.random()*101+100);
	  
	    n[filas][colum]=num;
	    num+=2;
	 
	    System.out.printf("%10d ", n[filas][colum]);
	    
	   if (n[filas][colum]%3==0) {
		
		 p[aux]=n[filas][colum];  
		 aux+=2;
		}
	}
	System.out.println("");
	}
	System.out.println("");
	for (int i=0; i<aux; i++) {
		
		
		System.out.print(p[i]+" ");
		
		}
    }
}
