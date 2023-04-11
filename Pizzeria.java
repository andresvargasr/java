import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

  private List<Pizza> pizzaList;

  public Pizzeria(){
    pizzaList = new ArrayList<>();
  }

  public void agregarAlMenu(Pizza pizza){
    pizzaList.add(pizza);
  }

  public void listarMenu(){
    for (Pizza p : pizzaList){
      System.out.println(p);
    }
  }

}
