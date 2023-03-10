import java.util.Scanner;
public class Ejercicio10T6 {
  public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	
	int numT;
	numT= 0;
	
	int num; 
	num= 0;
	
	int suma;
	suma= 0;
	
	System.out.println("introduze numeros y si quieres parar introduze uno negativo");
	
	while (num >= 0) {
	  num= s.nextInt();
	  
	  numT++;
	  
	  suma += num;
	}
	
	int media;
	media= (suma - num)/ (numT - 1);
	
	System.out.println("La media de los números positivos introducidos es= "+media);
}
}
