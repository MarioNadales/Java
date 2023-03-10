import java.util.Scanner;
public class Ejercicio4T8 {
	
  public static void main (String[] args) {
	
	Scanner s= new Scanner(System.in);
	
	int [] num= new int [20];
	int [] cua= new int [20];
	int [] cubo= new int [20];

	for (int i=0; i<20;i++) {
	  num[i]=(int)(Math.random()*101)+100;
	  
  }
  	for (int i=0; i<20;i++) {
	  
	  cua[i]=(int)(Math.pow(num[i],2));
	  
  }
  	for (int i=0; i<20;i++) {
	  cubo[i]=(int)(Math.pow(num[i],3));
	  
  }
    for (int i=0; i<20;i++) {
	  
	  System.out.println(num[i]+" "+cua[i]+" "+cubo[i]);
	  
  }
 }
}
