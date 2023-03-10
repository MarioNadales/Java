import java.util.Scanner;
public class Ejercicio12T4 {
	public static void main(String[] args) {
	  
	  Scanner s= new Scanner(System.in);

	  System.out.println("Responde las sigientes preguntas (con a, b o c) para calificar tu conocimiento");
	  
	  int total;
	  total=0;
	  
	  System.out.println("1. Partes del Hardware de un ordenador");
	  System.out.println("a. Tarjeta grafica");
	  System.out.println("b. Manzana");
	  System.out.println("c. Sistema operativo");
	  
	  String p1;
	  p1= s.nextLine();
	  
	  switch (p1) {
		
		case "a":
		  System.out.println("!Respuesta correcta¡");
		  total=total+1;
		
		break;
		
		case "b":
		  System.out.println("Respuesta incorrecta");
		  
		
		break;
		
		case "c":
		  System.out.println("Respuesta incorrecta");
		  
		
		break;
	    }
	    
	  System.out.println("");	  
	  System.out.println("2. Partes del Software de un ordenador");
	  System.out.println("a. Tarjeta grafica");
	  System.out.println("b. SO");
	  System.out.println("c. Manzana");
  
	  p1= s.nextLine();
	  
	  switch (p1) {
		
		case "a":
		  System.out.println("Respuesta incorrecta");
		  
		
		break;
		
		case "b":
		  System.out.println("!Respuesta correcta¡");
		  total=total + 1;
		
		break;
		
		case "c":
		  System.out.println("Respuesta incorrecta");
		  
		
		break;
		}
		
	  System.out.println("");	  
	  System.out.println("3. Variable que almacene numeros");
	  System.out.println("a. Int");
	  System.out.println("b. Char");
	  System.out.println("c. Boolean");
  
	  p1= s.nextLine();
	  
	  switch (p1) {
		
		case "a":
		  System.out.println("!Respuesta correcta¡");
		  total=total + 1;
		
		break;
		
		case "b":
		  System.out.println("Respuesta incorrecta");
		  
		
		break;
		
		case "c":
		  System.out.println("Respuesta incorrecta");
		  
		
		break;
		}
		
      System.out.println("");	  
	  System.out.println("4. Variable de HTML para iniciar un cuestionario");
	  System.out.println("a. <input>");
	  System.out.println("b. <Form>");
	  System.out.println("c. <option>");
  
	  p1= s.nextLine();
	  
	  switch (p1) {
		
		case "a":
		  System.out.println("Respuesta incorrecta");
		  
		
		break;
		
		case "b":
		  System.out.println("!Respuesta correcta¡");
		  total=total + 1;
		
		break;
		
		case "c":
		  System.out.println("Respuesta incorrecta");
		  
		
		break;
		}
		
	  System.out.println("");	  
	  System.out.println("5. Variable de HTML para iniciar un area de texto");
	  System.out.println("a. <textarea>");
	  System.out.println("b. <input type=textarea>");
	  System.out.println("c. <label>");
  
	  p1= s.nextLine();
	  
	  switch (p1) {
				
		case "a":
		  System.out.println("!Respuesta correcta¡");
		  total=total + 1;
		
		break;
		
		case "b":
		  System.out.println("Respuesta incorrecta");
		  
		
		break;
		
		case "c":
		  System.out.println("Respuesta incorrecta");
		  
		
		break;
		}
		
	  System.out.println("");	  
	  System.out.println("6. En Java como mostramos algo por pantalla");
	  System.out.println("a. System.out.print");
	  System.out.println("b. String");
	  System.out.println("c. Con Scanner");
  
	  p1= s.nextLine();
	  
	  switch (p1) {
		
		case "a":
		  System.out.println("!Respuesta correcta¡");
		  total=total + 1;
		
		break;
		
		case "b":
		  System.out.println("Respuesta incorrecta");
		  
		
		break;
		
		case "c":
		  System.out.println("Respuesta incorrecta");
		  
		
		break;
		}
		  
	    
	  System.out.println("Tu calificacion total es= "+total+"/6");
	}
}
