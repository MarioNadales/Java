import java.util.Scanner;
public class Ejercicio11T6 {
  public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	  
	System.out.print("Introduze un numero");
	
	int num;
	num= s.nextInt();
	
	int cua;
	cua= 0;
	
	int cubo;
	cubo= 0;
	
	for (int x = num; x < num + 5; x++) {
		
	  cua=x*x;
	  
	  cubo=x*x*x;
	  
	  System.out.printf("%4d %6d %8d\n", x , cua, cubo);
	}
}
}
