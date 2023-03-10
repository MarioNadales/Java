package misFunciones;

import java.security.cert.X509CRL;

import javax.lang.model.util.ElementScanner14;

public class Geometria {
//Multiplica 2 numeros
  public static double multiplica(double x,double y)  {
    
    double numM;
    numM=x*y;

    return numM;
  }

//Muestra si es mayor de edad o no

  public static Boolean edad(int x)  {

    if (x>=18) {
      return true;
    }
    return false;

  }

//Caclula un numero minimo entre dos.

public static int minimo(int x, int z)  {

    if (x<z) {
      return x;
    } 
    return z;
  }
//Compara el numero escrito y da un valor dependiendo de si es menor mayor o 0
  public static int dimeSigno(int x)  {
    if (x==0) {return 0;
    }else {
      if (x<0) {return -1;
      } else {
      return 1;
      }
  }
}

//Calcula el perimetro de un rectangulo con el ancho y el largo

public static double perimetroRectangulo(double x, double y)  {

    double perimetro=(x+y)*2;
    
    return perimetro;
}

//Calcula el area de un rectangulo con el ancho y el largo

  public static double areaRectangulo(double x, double y)  {

    double area=x*y;
    return area;
}

//Sumantorio desde 1 a x numero

public static int sumaN(int x)  {
  
  int suma=0;

  for (int i=1; i<=x; i++) {

    suma=suma+i;

  }return suma;
  }

//Factorial de 1 a x numero

public static int factorialN(int x)  {
  int mult=0;

  for (int i=1; i<x; i++) {

    mult=mult*i;

  }return mult;
}

//Calcula el numero intermedio entre 1 y x

public static double intermedioN(int x)  {
  int mult=0;

  for (int i=1; i<x; i++) {

    mult=mult*i;

  }return mult;
}



//

public static boolean maximo(int x, int y)  {

  if (x<y) {
    return false;
  } return true;
  }

//Genera y imprime por pantalla una tabla de multiplicar de un numero introducido

public static double tabla(double x)  {

  double tabla1;
  tabla1=0;

  for (int i=0; i<=10; i++) {
    tabla1=x*i;

    System.out.println("numero*"+i+"= "+ tabla1);
    
  }return x;
  
}

//

public static int triangulo(int x, char y)  {

  int num;
  num=0;

  for (int i=0; i<x; i++) {
    
    System.out.print(y);
    
  }return x;
  
}

//Las dos funciones crean un array de 100 y calculan la media y la suma de todos sus numeros

public static int arraySum(int x[])  {

  int sum=0;
  double media=sum/100;
  
  int cont=0;

  for (int i=0; i<100; i++) {
    
    x[i]=cont;
    cont++;
    sum=sum+x[i];
    media=sum/100;
    System.out.print(" "+x[i]);
  }return sum;
  
  
}
public static double arrayMedia(int x[])  {

  int sum=0;
  double media=0;
  
  int cont=0;

  for (int i=0; i<100; i++) {
    
    x[i]=cont;
    cont++;
    sum=sum+x[i];
    
    
  }media=sum/100;
  return media;
  
}

//Calcula si un numero introducido es primo

public static boolean numPrimo(int x)  {

	for (int i=2; i<x-1; i++) {
		
    if (x % i==0) {return false;}
    
    
    }return true;
  }
  
}
