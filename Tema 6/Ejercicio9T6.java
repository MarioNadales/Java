import java.util.Scanner;
public class Ejercicio9T6 {
  public static void main(String[] args) {
	 
	Scanner s=new Scanner(System.in); 
	 
    int numD;
    numD= 1;
	
	System.out.println("Escribe un numero y te dire el numero de cifras que tenga");
	
	int n;
	n = s.nextInt();
	
	while (n > 10) {
	  n /= 10;
	  numD++;
	}
	
	System.out.println("El numero introducido tiene "+numD+" cifras");
	  
	}
}
