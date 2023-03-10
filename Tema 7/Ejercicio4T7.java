/*Genera 20 numeros aleatorios entre 0 y 10
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejercicio4T7 {
  public static void main (String[] args) {
    
      int num;
	  num=0;
	  
	for (int i=0; i<=20; i++) {
	  
	  num=(int)(Math.random()*11);
	  System.out.print(" "+num);
      }
    }
}
