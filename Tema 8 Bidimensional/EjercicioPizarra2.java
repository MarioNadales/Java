import java.util.Scanner;
public class EjercicioPizarra2 {
	
  public static void main (String[] args) {
    
    Scanner s=new Scanner(System.in);
    
    int [][] t= new int [2][4];
	
	int aux;
	aux=1;
	
	int filas=2;
	int columnas=4;
		
	for (int f=0; f<filas; f++) {
	  for (int c=0; c<columnas; c++) {
	    
	    t[f][c]=aux;
	    aux=aux+1;
		

	 }
}
	for (int c=0; c<columnas; c++) {
	  for (int f=0; f<filas; f++) {
	    
		System.out.printf("%10d ", t[f][c]);
		
	 }
	System.out.println("");
	}
}
}
