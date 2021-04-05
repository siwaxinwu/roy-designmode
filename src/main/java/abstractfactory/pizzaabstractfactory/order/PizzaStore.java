package abstractfactory.pizzaabstractfactory.order;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 17:05 2021-04-03
 */
public class PizzaStore {
  public static void main(String[] args) {
    new OrderPizza(new BJFactory());
  }
}
