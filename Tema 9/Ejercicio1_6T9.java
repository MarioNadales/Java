import java.util.Scanner;
public class Ejercicio1_6T9 {
	
	//Funciones//////////
	
  public static boolean esCapicua(int x){
	
	int cap;
	cap= x*10 + x%10;
	cap=x/10;
		
	if (cap==x) {
		return true;
		}
	
	
	
	return false;}
  public static boolean esPrimo(int x){
	
	for (int x2=2; x2<x-1; x2++) {
		
      if (x % x2==0) { return false;}
		}
	    return true; }
  
  public static int sigtPrimo(int x){
	
	for (int x2=x; x2<x-1; x2++) {
		
      if (x % x2==0) {x2++;}
		}
	    return x; }

  public static void main (String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	int n;
	n=s.nextInt();
	
	int primo2;
	primo2=0;
	
	for (primo2=n ; primo2<n;primo2++ ) {
		
      if (x % x2==0) {
		  
		  }
  }
	
	if (esPrimo(n)) {
	  System.out.print("Es un numero primo: "+n);
	}else {
	  System.out.print("No es un numero primo: "+n);	
		}
	
	if (sigtPrimo(n)) {
	  System.out.print("Es un numero primo: "+n);
	}else {
	  System.out.print("No es un numero primo: "+n);	
		}
	
	}
}

