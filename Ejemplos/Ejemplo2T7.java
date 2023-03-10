/*Genera 20 numeros entre 0 y 15
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejemplo2T7 {
  public static void main(String[] args) {
	
	System.out.print("20 números aleatorios entre 0 y 15,");
	
	System.out.println(" sin llegar a 15 (con decimales):");
	
	for (int i = 1; i <= 20; i++) {
	 
	  System.out.println( Math.random()*15);
	}
  }
}
