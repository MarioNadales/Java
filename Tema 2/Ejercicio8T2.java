/*
* Concatena las variables y las muestra por pantalla en una frase 
*
* Autor= Mario Nadales Suarez
*/
  public class Ejercicio8T2 {
    public static void main(String[] args) {
      
      char v1;
      v1= 'G';
      char v2;
      v2= 'O';
      char v3;
      v3= 'L';
      char v4;
      v4= 'E';
      
      String frase;
      frase=("\033[94m"+v1+"\033[31m"+v2+"\033[33m"+v2+"\033[94m"+v1+"\033[32m"+v3+"\033[31m"+v4+"\033[37m");
      
      System.out.println(" "+frase);
	}
}
