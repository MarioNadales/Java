import java.util.Scanner;
public class ArrayGato {
  public static void main(String[] args) {
    
    Gato[] g=new Gato [5];
    Scanner s=new Scanner(System.in);
    //Bucle para introducir datos
    for (int i=1;i<5;i++) {
      System.out.println("Introduce el sexo del gato "+i);
      g[i]=new Gato(s.nextLine());
      System.out.println("Introduce el color del gato "+i);
      g[i].Setcolor(s.nextLine());
      System.out.println("Introduce el nombre del gato "+i);
      g[i].Setnombre(s.nextLine());
    }
    //Bucle para introducir numero de sardinas
    for (int i=1;i<5;i++) {
      System.out.println("Introduce el numero de sardinas que comera el gato "+i);
      g[i].Setsardinas(s.nextInt());
    }
    //Bucle para mostrar datos de los gatos
    System.out.println("Aqui estan los datos de los gatos");
    for(int i=1; i<5;i++){
      
      System.out.println("Gato "+i);
      System.out.println("Nombre: "+g[i].Getnombre()+" ");
      System.out.println("Sexo "+g[i].Getsexo()+" ");
      System.out.println("Color "+g[i].Getcolor()+" ");
    }
  }

}
