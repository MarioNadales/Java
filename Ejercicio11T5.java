import java.util.Scanner;
public class Ejercicio11T5 {
	public static void main(String[] args) {
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("\033[31mDime la hora y los minutos y te dire lo que falta para medianoche\033[33m");
	  
	  int hora;
	  hora= s.nextInt();
	  int min;
	  min= s.nextInt();
	  int segHora;
	  segHora= (24 * 3600);
	  
	  int seg;
	  seg= (hora * 3600)+ (min * 60);
	  
	  int total;
	  total= segHora-seg;
	
	  System.out.println("\033[31mLos segundos que faltan para las 12 de la noche son= "+total+"\033[37m");
	  }   
}
