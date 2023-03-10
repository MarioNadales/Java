import java.util.Scanner;
public class Ejercicio8T8 {
	
  public static void main (String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Dame la temperatura media de los meses del año");
	
	int [] num= new int [12];
	
	int n=0;
	
	String[] mes={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	
	for (int i=0; i<12; i++) {
	  
	  System.out.println("Temperatura media de "+mes[i]);
	  
	  n=s.nextInt();
	  
	  num[i]=n;
  }	
	for (int i=0; i<12; i++) {

	    

	  for (int j=0; j<num[i]; j++) {
		  
	    System.out.print("*");
		 	
	    }
	  System.out.println(""+num[i]+" grados en el mes "+mes[i]);
    
    }
  }
}
