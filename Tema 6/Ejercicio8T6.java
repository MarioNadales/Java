import java.util.Scanner;
public class Ejercicio8T6 {
	public static void main(String[] args) {
	  
	  Scanner i=new Scanner(System.in);
	  
	  System.out.print("Numero introducido para ver su tabla: ");
	  
	  int num;
	  num= i.nextInt();  
	  
	  for (int tabla=0; tabla<=10; tabla++){
	    
	    int total;
	    total= num*tabla;
	    
	    System.out.println(total);
	  }
	}
}
	  
