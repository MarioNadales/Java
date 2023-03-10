import java.util.Scanner;
public class Ejercicio9T4 {
	public static void main(String[] args) {
	  
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("Dame tres numeros a, b y c y calculare la raiz cuadrada");
	  
	  double a;
	  a= s.nextDouble();
	  
	  double b;
	  b= s.nextDouble();
	  
	  double c;
	  c= s.nextDouble();
	  
	  double b1;
	  b1= b*b;
	  
	  double c1;
	  c1= 4*a*c;
	  
	  double raiz;
	  raiz= (b1-c1);
	  
	  double raiz1;
	  raiz1= Math.sqrt(raiz);
	  
	  if (raiz<0) {
		  System.out.println("La raiz no se puede realizar con numeros negativos");
		  
	  } else {
	  double total;
	  total= -b+raiz1/(2*a);
	  
	  double total1;
	  total1= -b-raiz1/(2*a);
	  System.out.println(total+" "+total1);
	  
  }
	  
	  
	}
}
