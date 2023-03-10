import java.util.Scanner;
public class EjercicioPizarra {
	
  public static void main (String[] args) {
    
    Scanner s=new Scanner(System.in);
	
	int [][] t= new int [6][4];
	
	int aux;
	aux=1;
		
	for (int o=0; o<4; o++) {
	  for (int i=0; i<6; i++) {
	    
	    t[i][o]=aux;
	    aux=aux+1;
		

	 }
}	System.out.print("\033[31m");
	for (int o=0; o<6; o++) {
	  for (int i=0; i<4; i++) {
	    
	    if (o==2) {System.out.print("\033[33m");}
	    if (o==4) {System.out.print("\033[31m");}
		System.out.printf("%10d ", t[o][i]);
		
	 }
	System.out.println("");
	}
	System.out.print("\033[39m");
}
}
