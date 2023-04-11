import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{

  List<Pizza> combinaciones;

  public PizzaCombinada(String nombre, String descripcion) {
    super(nombre, descripcion);
    combinaciones = new ArrayList<>();
  }

  public void agregarCombinacion(Pizza combinacion){
    this.combinaciones.add(combinacion);
  }

  /**
   * Intents to use the transient variable as temporal, like a cache.
   * @return
   */
  @Override
  public Double calcularPrecio() {
    if (precio != null) {
      System.out.println("<<PizzaCombinada>> Asigna precio");
      return precio;
    }
    Double precioMasAlto = 0.0;
    System.out.println("<<PizzaCombinada>> Calcula precio");
    for (Pizza p : combinaciones) {
      if (precioMasAlto < p.calcularPrecio()) {
        precioMasAlto = p.calcularPrecio();
      }
    }
    return precio = precioMasAlto;
  }
}
