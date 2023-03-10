/*El programa calcula la conversion de 64,38 euros a pesetas
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejercicio1ex {
  public static void main(String[] args) {
    //Se crea la variable euros y le damos el valor que queremos convertir
    double euros;
    euros= 64.38;
    //Se crea la variable pesetas con la operacion y nos da el resultado de la conversion
    double pesetas;
    pesetas= euros * 166.386;
    
    System.out.println("64,38 euros son= "+pesetas);
    }
}
