package ejerciciocomposite;

public class Etiqueta implements Componente {

  private String nombre;

  public Etiqueta() {
    this.setNombre("");
  }

  public Etiqueta(String nombre) {
    this.setNombre(nombre);
  }

  public void pintar(String color) {
    System.out.println("Se pintó a " + nombre + " de color " + color);
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
