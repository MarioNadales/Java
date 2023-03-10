/*Programa que calcula el horoscopo segun el dia y el mes que le indiques
 * 
 * Autor= Mario Nadales Suarez
 */
import java.util.Scanner;
public class Ejercicio10T5 {
	public static void main(String[] args) {
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println("Dime tu dia y mes de nacimiento y te dire tu horoscopo");
	  
	  int dia;
	  dia= s.nextInt();
	  String mes;
	  mes= s.next();
	  mes= mes.toLowerCase();
	  
	  switch (mes) {
		case "enero":
		  
		  if (dia<=19) {
			
			System.out.println("Tu horoscopo es capricornio");
		  }else {
			
			System.out.println("Tu horoscopo es acuario");
			}break;
		case "febrero":
		  
		  if (dia<=18) {
			
			System.out.println("Tu horoscopo es acuario");
		  }else {
			
			System.out.println("Tu horoscopo es piscis");
			}break;
		case "marzo":
		  
		  if (dia<=19) {
			
			System.out.println("Tu horoscopo es piscis");
		  }else {
			
			System.out.println("Tu horoscopo es aries");
			}break;
		case "abril":
		  
		  if (dia<=19) {
			
			System.out.println("Tu horoscopo es aries");
		  }else {
			
			System.out.println("Tu horoscopo es tauro");
			}break;
		case "mayo":
		  
		  if (dia<=19) {
			
			System.out.println("Tu horoscopo es tauro");
		  }else {
			
			System.out.println("Tu horoscopo es geminis");
			}break;
		case "junio":
		  
		  if (dia<=19) {
			
			System.out.println("Tu horoscopo es geminis");
		  }else {
			
			System.out.println("Tu horoscopo es cancer");
			}break;
		case "julio":
		  
		  if (dia<=19) {
			
			System.out.println("Tu horoscopo es cancer");
		  }else {
			
			System.out.println("Tu horoscopo es leo");
			}break;
		case "agosto":
		  
		  if (dia<=19) {
			
			System.out.println("Tu horoscopo es leo");
		  }else {
			
			System.out.println("Tu horoscopo es libra");
			}break;
		case "septiembre":
		  
		  if (dia<=19) {
			
			System.out.println("Tu horoscopo es libra");
		  }else {
			
			System.out.println("Tu horoscopo es escorpio");
			}break;
		case "octubre":
		  
		  if (dia<=19) {
			
			System.out.println("Tu horoscopo es escorpio");
		  }else {
			
			System.out.println("Tu horoscopo es sagitario");
			}break;
		case "noviembre":
		  
		  if (dia<=19) {
			
			System.out.println("Tu horoscopo es sagitario");
		  }else {
			
			System.out.println("Tu horoscopo es capricornio");
			}break;
		case "diciembre":
		  
		  if (dia<=19) {
			
			System.out.println("Tu horoscopo es capricornio");
		  }else {
			
			System.out.println("Tu horoscopo es acuario");
			}break;		
	
	  }
    }
  }

