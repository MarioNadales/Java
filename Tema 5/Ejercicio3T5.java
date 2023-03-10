import java.util.Scanner;
public class Ejercicio3T5 {
	public static void main(String[] args) {
		
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("Escribe un numero y te dire al dia que corresponde");
	  System.out.print("Escribe tu numero aqui: ");
	  int opcion;
	  opcion= s.nextInt();
	  
	  switch (opcion) {
	    
	    case 1:
	    
	    System.out.println("Lunes");
	    break;
	    
	    case 2:
	    
	    System.out.println("Martes");
	    break;
	    case 3:
	    
	    System.out.println("Miercoles");
	    break;
	    case 4:
	    
	    System.out.println("Jueves");
	    break;
	    case 5:
	    
	    System.out.println("Viernes");
	    break;
	    case 6:
	    
	    System.out.println("Sabado");
	    break; 
	    case 7:
	    
	    System.out.println("Domingo");
	    break;   
	  }
	}
}
