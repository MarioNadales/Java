import java.util.Scanner;
public class Ejercicio19T6 {
	public static void main(String[] args) {
	  
	  Scanner alt= new Scanner(System.in);
	  
	  int altura;
	  altura= alt.nextInt();
	  
	  int planta;
	  planta=1;
	  
	  int totalb;
	  totalb=altura-1;
	  
	  while (planta<=altura) {
	    for (int b=1; b<=totalb; b++) {
		  
		  System.out.print(" ");
	    }
	    for (int r=1; r<=(2*altura)-1; r++){
		  System.out.print("+");
	}
}
	}
}
