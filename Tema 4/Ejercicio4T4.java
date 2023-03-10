import java.util.Scanner;
public class Ejercicio4T4 {
  public static void main(String[] args) {
    
      Scanner s = new Scanner(System.in);
	  
	  System.out.println("Escribe las horas trabajadas esta semana y te dire lo que has cobrado");
	  int horas;
	  horas= s.nextInt();
	  
	  int dinero;
	  dinero= horas * 12;
	  
	  int extra;
	  extra=0;
	  
	  if (horas>40) {		 
		 extra = (horas-40) * 16;
		 System.out.println("Esta semana has cobrado 480 euros mas un extra de "+extra+" euros");		 
		 	  
	  }else{
		System.out.println("Este es el dinero que has ganado esa semana= "+dinero);
	   }
	}
}
    
    

