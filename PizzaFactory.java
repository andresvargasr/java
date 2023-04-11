public class PizzaFactory {

  private static PizzaFactory instanciaFabrica;

  public static PizzaFactory getInstance(){
    if (instanciaFabrica == null)
      instanciaFabrica = new PizzaFactory();
    return instanciaFabrica;
  }

  public Pizza prepararPizza(String codigo){
    switch (codigo){
      //TODO add Builder pattern;
      case "ESPECIAL": return new PizzaSimple("Pizza especial", "La mas senccilla", 200.00, true);
      case "POLLO": return new PizzaSimple("Pizza de pollo", "Con pollo desmenuzado", 300.00, false);
      case "CHAMP": return new PizzaSimple("Pizza de champillones", "Con champiñones de la huerta", 320.00, true);
      case "POLLO&CHAMP":
        PizzaCombinada comb = new PizzaCombinada("Pizza de pollo con champiñones","La combinada mas popular");
        comb.agregarCombinacion(prepararPizza("POLLO"));
        comb.agregarCombinacion(prepararPizza("CHAMP"));
        return comb;
      default: return null;
    }
  }
}
