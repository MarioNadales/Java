import java.util.Scanner;
public class Ejercicio9T8 {
	
  public static void main (String[] args) {
	
	Scanner n= new Scanner(System.in);
	
	int [] ar= new int [8];
	
	for (int i=0; i<8; i++) {
	  
	  System.out.println("introduce un numero entero");
	  
	  ar[i]=n.nextInt();
  }
	for (int i=0; i<8; i++) {
	  
	  if (ar[i]%2==0){
	    
	    System.out.println(ar[i]+" par"); 
  }
	  else {
	    
	    System.out.println(+ar[i]+" impar");
		}
	
  }
}
}
