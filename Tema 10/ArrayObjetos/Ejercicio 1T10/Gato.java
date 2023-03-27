//Clase Gato para mostrar los datos de los gatos en un array
//@Author Mario Nadales Suarez
public class Gato {

  //Atributos
  private String color;
  private String sexo;
  private String nombre;
  private int sardinas=10;

  //Constructor
  Gato (String s){
    this.sexo=("Macho");
  }
  //Metodos
  public String Getnombre(){
    return nombre;
  }
  public void Setnombre(String n){
    this.nombre=n;
  }
  public String Getcolor(){
    return color;
  }
  public void Setcolor(String c){
    this.color=c;
  }
  public String Getsexo(){
    return sexo;
  }
  public int Getsardinas(){
    return sardinas;
  }
  public void Setsardinas(int s){
    this.sardinas=sardinas-s;
    for (int i=s ; i>0 ; i--) {
      Getsardinas();
      if (sardinas==0){
        System.out.println("Ya no hay sardinas");
      }else {
      System.out.print("Ñam...");
      
      } 
    }
  }
}
