/*
* Concatena las variables y las muestra por pantalla en una frase 
*
* Autor= Mario Nadales Suarez
*/
  public class Ejercicio7T2 {
    public static void main(String[] args) {
      
      char letra1;
      letra1='E';
      char letra2;
      letra2='s';
      char letra3;
      letra3='p';
      char letra4;
      letra4='a';
      char letra5;
      letra5='ñ';
      
      String frase;
      frase="\033[31m País\033[33m de\033[31m Europa\033[39m= ";
      
      System.out.println(frase+"\033[31m"+ letra1+ letra2+"\033[33m"+letra3+ letra4+ "\033[31m"+letra5+ letra4+"\033[39m.");
    }
}
