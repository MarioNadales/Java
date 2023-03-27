//Programa que crea un array de numeros entre 100 y 999 y calcula los sumatorios por filas y columnas con "delay" a la hora de mostrar las sumas
//@Author Mario Nadales
import java.util.Scanner;
public class Ejercicio4T8 {
	
  public static void main (String[] args) {
    
    throws InterruptedException; {
    
    Scanner s=new Scanner(System.in);
    
    int [][] a= new int [5][6];
    
    int filas=4;
    int columnas=5;
    
    int sumf;
    sumf=0;
    
    int sumc=0;
    
    int total=0;
    
    for (int i=0; i<filas; i++){    
     
		
      for (int o=0; o<columnas; o++){ 
	    
	    a[i][o]=(int)(Math.random()*900+100);
   
   }
  }
	for (int i=0; i<filas; i++){    
     
      for (int o=0; o<columnas; o++){ 
		sumf=sumf+a[i][o];
	    System.out.printf("%10d ",a[i][o]);
	    
	    
	    
	    
   }System.out.print(" "+sumf);
   sumf=0;
   System.out.println("");
   
   }
  	for (int i=0; i<5; i++){    
      for (int o=0; o<4; o++) { 
        
        sumc=sumc+a[o][i];
        total=total+a[o][i];
		 
     
   } System.out.printf("%10d ",sumc);
        sumc=0;
    Thread.sleep(1000); 
   }System.out.print(" "+total);
  }
 }
}
