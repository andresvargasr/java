public class PizzaDemo {
  public static void main(String[] args) {
    Pizzeria laPizzeriaDeAndy = new Pizzeria();
    PizzaFactory fabrica = PizzaFactory.getInstance();
    laPizzeriaDeAndy.agregarAlMenu(fabrica.prepararPizza("ESPECIAL"));
    laPizzeriaDeAndy.agregarAlMenu(fabrica.prepararPizza("POLLO"));
    laPizzeriaDeAndy.agregarAlMenu(fabrica.prepararPizza("CHAMP"));
    laPizzeriaDeAndy.agregarAlMenu(fabrica.prepararPizza("POLLO&CHAMP"));

    laPizzeriaDeAndy.listarMenu();
  }

}
