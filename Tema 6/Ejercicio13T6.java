import java.util.Scanner;
public class Ejercicio13T6 {
  public static void main(String[] args) {

	Scanner s=new Scanner(System.in);

	System.out.println("Introduze 10 numeros positivos o negativos");
	
	int n;
	n= 0;
	
	int p;
	p= 0;
	
	for (int i = 0; i < 10; i++) {
	int num;
	num= s.nextInt();
	  if (num < 0) {
		n++;
		
	} else {
		p++;
	}
}
	System.out.println("Ha introducido " + p + " positivos y " + n + " negativos");
	}
}
