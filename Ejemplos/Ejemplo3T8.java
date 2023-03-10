import java.util.Scanner;
public class Ejemplo3T8 {
  public static void main(String[] args) {
	  
	 Scanner a= new Scanner(System.in);
	  
	int[] num = new int[10];
	
	num[0] = 1;
	num[1] = 2;
	num[2] = 2*2;
	num[3] = 2*2*2;
	num[4] = 2*2*2*2;
	num[5] = 2*2*2*2*2;
	num[6] = num[2] * 10;
	num[7] = num[2] / 10;
	num[8] = num[0] + num[1] + num[2];
	num[9] = num[8];
	
	System.out.println("El array num contiene los siguientes elementos:");
	
	for (int i = 0; i < 10; i++) {
	  System.out.println(num[i]);
	}
	
	System.out.println("Dime un numero del 0 al 9");
	int t;
	t = a.nextInt();
	System.out.println("La posicion del array que me has indicado es= "+t);
	System.out.println("El numero en esa posicion es "+num[t]);
	
    int sumaP;
    sumaP= num[0]+num[2]+num[4]+num[6]+num[8];
    
	System.out.println("Suma de las posiciones pares "+sumaP);
  }
}
