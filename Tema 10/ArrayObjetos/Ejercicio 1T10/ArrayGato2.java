public class ArrayGato2 {
  public static void main(String[] args) {
    Gato[] g=new Gato [5];
    //Bucle para introducir datos
    for (int i=1;i<5;i++) {
      g[i]=new Gato("Macho");
      g[i].Setcolor("Naranja");
      g[i].Setnombre("Garfield");
    }
    //Bucle para mostrar datos de los gatos
    System.out.println("Aqui estan los datos de los gatos");
    for(int i=1; i<5;i++){
      
      System.out.println("Gato "+i);
      System.out.println("Nombre: "+g[i].Getnombre()+" ");
      System.out.println("Sexo: "+g[i].Getsexo()+" ");
      System.out.println("Color: "+g[i].Getcolor()+" ");
    }
  }
}
