/*Genera 50 numeros aleatorios entre 100 y 199
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejercicio5T7 {
  public static void main (String[] args) {
    
      int num;
	  num=0;
	  
	for (int i=0; i<=50; i++) {
	  
	  num=(int)(Math.random()*100)+100;
	  System.out.print(" "+num);
      }
    }
}
