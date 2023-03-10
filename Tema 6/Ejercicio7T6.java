import java.util.Scanner;
public class Ejercicio7T6 {
	public static void main(String[] args) {
	  
	  Scanner s= new Scanner(System.in);
	  
	  int num;
	  num=0;
	  
	  System.out.print("Escribe una combinacion de 4 digitos para abrir la caja, por ejemplo: ");
	  System.out.println("1231");
	  do {
		  
	  System.out.println("Lo siento, esa no es la combinación"); 
	  num= s.nextInt();
	  
		}while (num!=1234);
		
		System.out.println("La caja fuerte se ha abierto satisfactoriamente");
}
}
