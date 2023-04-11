public class PizzaSimple extends Pizza {
  Double precioBase;
  Boolean aplicaPromocion10porCiento;

  public PizzaSimple(String nombre, String descripcion, Double precioBase,
      Boolean aplicaPromocion10porCiento) {
    super(nombre, descripcion);
    this.precioBase = precioBase;
    this.aplicaPromocion10porCiento = aplicaPromocion10porCiento;
  }

  @Override
  public Double calcularPrecio() {
    if (this.precio != null)
      return precio;
    if (aplicaPromocion10porCiento) {
      precio = this.precioBase * 0.9;
      return precio;
    }
    else
      return precio = precioBase;
  }
}
