/*El programa concatena las letras de mi apellido y lo muestra por pantalla
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejercicio2ex {
  public static void main(String[] args) {
	
	char letra1;
	letra1= 'N';
	
	char letra2;
	letra2= 'a';
	
	char letra3;
	letra3= 'd';
	
	char letra4;
	letra4= 'a';
	
	char letra5;
	letra5= 'l';
	
	char letra6;
	letra6= 'e';
	
	char letra7;
	letra7= 's';
	//Se crea una variable char por cada letra del apellido
	String apellido;
	apellido= (""+letra1+letra2+letra3+letra4+letra5+letra6+letra7);
	//Se concatenan en un string y se muestra por pantalla
	System.out.println("Mi apellido es: "+apellido);
	System.out.println(""+apellido);
	
	}
}
