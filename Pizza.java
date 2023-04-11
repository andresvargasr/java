public abstract class Pizza {

  private String nombre;
  private String descripcion;
  protected transient Double precio;

  public Pizza(String nombre, String descripcion) {
    this.nombre = nombre;
    this.descripcion = descripcion;
  }

  public abstract Double calcularPrecio();

  @Override
  public String toString() {
    return "Pizza{" +
        "nombre='" + nombre + '\'' +
        ", descripcion='" + descripcion + '\'' +
        ", precio=" + calcularPrecio() +
        '}';
  }
}
