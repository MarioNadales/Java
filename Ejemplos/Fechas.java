	public class Fechas  {

		public static void main (String[] args)  {

		 int fecha1 ;
		 int fecha2 ;
		 int suma;
		 char nom1;
		 char nom2;
		 boolean mayor;
		 boolean menor;
		 boolean igual;
		 boolean distinto;
		 boolean mayorletra;	
			fecha1=2002;
		    fecha2=2003;
		    nom1='m';
		    nom2='g';
		
				suma=fecha1 + fecha2;
				mayor= fecha1 > fecha2;
				menor= fecha1 < fecha2;
				igual= fecha1 == fecha2;
				distinto= fecha1 != fecha2;
				mayorletra= nom1 > nom2;
				
		
		System.out.println("La suma de los años es ="+suma);
		System.out.println("El primer año es mayor ="+mayor);
		System.out.println("El primer año es menor ="+menor);
		System.out.println("El primer año es igual al segundo año ="+igual);
		System.out.println("El primer año es distinto al segundo año ="+distinto);
		System.out.println("La primera letra de mi nombre es  mayor ="+mayorletra);
		
		
		
		}

	}
