package ejerciciocomposite;

import java.util.ArrayList;

public class Contenedor implements Componente {

  private String nombre;

  private ArrayList<Componente> componentes;

  public Contenedor(String nombre) {
    this.setNombre(nombre);
    this.setComponentes(new ArrayList());
  }

  public Contenedor() {
    this.setNombre("");
    this.setComponentes(new ArrayList());
  }

  @Override
  public void pintar(String color) {
    for (Componente c : componentes) {
      c.pintar(color);
    }

    System.out.println("Se pintó a " + nombre + " de color " + color);
  }

  public void add(Componente c) {
    this.getComponentes().add(c);
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ArrayList<Componente> getComponentes() {
    return this.componentes;
  }

  public void setComponentes(ArrayList<Componente> componentes) {
    this.componentes = componentes;
  }
}
