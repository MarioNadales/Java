/*Genera 20 numeros entre 50 y 65 sn decimales
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejemplo5T7 {
  public static void main(String[] args) {
	
	System.out.println("20 números aleatorios entre 50 y 65 (sin decimales):");
	
	for (int i = 1; i <= 20; i++) {
	  
	  System.out.println(((int)(Math.random()*16)+50 ));
	}
  }
}
