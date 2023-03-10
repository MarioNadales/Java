/*Genera 20 numeros entre 0 y 15 sin decimales
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejemplo3T7 {
  public static void main(String[] args) {
	
	System.out.println("20 números aleatorios entre 0 y 15 (sin decimales):");
	
	for (int i = 1; i <= 20; i++) {
	  
	  System.out.println((int)(Math.random()*16));
	}
  }
}
