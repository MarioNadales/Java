/*Genera 10 numeros entre 0 y 15
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejermplo1T7 {
  public static void main(String[] args) {
	
	System.out.println("Diez números aleatorios entre 0 y 15");
	
	for (int i = 1; i < 11; i++) {
	  
	  System.out.println(Math.random()*16);
	}
  }
}
