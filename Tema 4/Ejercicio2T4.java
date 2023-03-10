import java.util.Scanner;
public class Ejercicio2T4 {
  public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	
	
    System.out.println("Introduze la hora actual ");
    
    int hora;
    hora= s.nextInt();
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos días");
      }
        
    if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes");
      }
      
    if ((hora >= 21) && (hora < 24)) {
      System.out.println("Buenas noches");
      }
    if ((hora <= 5) && (hora >= 0)) {
	  System.out.println("Buenas noches");
      }
  }
}
