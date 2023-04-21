public class Producto {
//Atributos
  private String nombre;
  private int cantidad;

//Constructor
  public Producto(String n) {
  this.nombre=n;
}
//Metodos
public void setNombre(String n){
  this.nombre=n;
}
public void setCantidad(String c){
  this.nombre=c;
}
public String getNombre(){
  return nombre;
}
public int getCantidad(){
  return cantidad;
}
}
