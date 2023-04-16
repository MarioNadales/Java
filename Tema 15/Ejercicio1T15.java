import java.util.Scanner;
public class Ejercicio1T15 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int max=Integer.MIN_VALUE;
    int a[]= new int [6];
    
    String num1;
    int num2=0;
    //Dos bucles for uno para introducir datos y otro para encontrar el numero maximo
System.out.println("Introduce 6 numeros enteros");
    for (int i=0;i<6;i++){
      a[i]=s.nextInt();

    }
    for (int i=0;i<6;i++){
      if (a[i]>max) {
        max=a[i];
      }
    }
    //Try catch para para los errores al introducir algo que no sea un numero
    System.out.println("Introduce el numero maximo que has introducido anteriormente");
    do {
      num1=s.nextLine();
      try {
        num2=Integer.parseInt(num1);
      }catch (Exception e) {
        System.out.println("Escribe un numero entero porfavor");
      }
      
    }while (num2!=max);
  }
}
