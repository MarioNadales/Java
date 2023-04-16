import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
public class FuncionesDeExecptions {  
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int teclado;

System.out.println("Selecciona el error entre estas opciones: ");
System.out.println("1. NumberFormatException");
System.out.println("2. StackOverflowError");
System.out.println("3. ArrayIndexOutOfBoundsException");
System.out.println("4. FileNotFoundException");
System.out.println("5. ArithmeticException");
System.out.println("6. Salir");
    do {
    teclado = s.nextInt();
    
    switch (teclado) {
      case 1:
      try {ExceptionNumberFormat(1);
        
      }catch (NumberFormatException e) {System.out.println("Error "+e.getClass());
    }
      break;
      case 2:
      try {ExceptionOverFlow();
        
      }catch (StackOverflowError e) {System.out.println("Error "+e.getClass());
      System.out.println("Error "+e.getMessage());
    }
      break;
      case 3:
      try {ExceptionArrayIndex(5);
        
      }catch (ArrayIndexOutOfBoundsException e) {System.out.println("Clase "+e.getClass());
      System.out.println("Error "+e.getMessage());
    }
      break;
      case 4:
      try {ExceptionFileNotFound();
        
      }catch (FileNotFoundException e) {System.out.println("Clase "+e.getClass());
      System.out.println("Error "+e.getMessage());
    }
      break;
      case 5:
      try {ExceptionArithmetic();
        
      }catch (ArithmeticException e) {System.out.println("Clase "+e.getClass());
      System.out.println("Error "+e.getMessage());
    }
      break;
    
      default:
        
    }
  } while(teclado<6);
  }
  public static void ExceptionOverFlow() throws StackOverflowError{
    
    ExceptionOverFlow();
  } 
  public static void ExceptionNumberFormat(int x) throws NumberFormatException{
    
    Integer.parseInt("Letra");
  } 
  public static void ExceptionArrayIndex(int x) throws ArrayIndexOutOfBoundsException{
    
    int a[]=new int [5];
    a[6]=1;
  }
  public static void ExceptionFileNotFound() throws FileNotFoundException{

    FileReader a = new FileReader("fichero1.txt");
    
  }
  public static int ExceptionArithmetic() throws ArithmeticException{
    
    return 2/0;
  }
}

