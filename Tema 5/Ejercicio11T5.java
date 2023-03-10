/*Programa que solicita la hora y los minutos y calcula los segundos faltantes hasta las 12 de la noche
 * 
 * Autor= Mario Nadales Suarez
 */
import java.util.Scanner;
public class Ejercicio11T5 {	
  public static void main (String[] args) {
	
	Scanner s= new Scanner(System.in);
	
	System.out.println("Por favor introduce la hora actual y los minutos");
    
    int h;
    h = s.nextInt();
    
    int min;
    min= s.nextInt();

    int seg;
    seg = (h * 3600) + (min * 60);
    
    int segH;
    segH= 24 * 3600;
    
    int segFaltantes; 
    segFaltantes= segH - seg;
            
    System.out.printf("Desde tu hora falta "+segFaltantes+" segundos hasta media noche");  
	    	
	}
}

