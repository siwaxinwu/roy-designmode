package abstractfactory.pizzaabstractfactory.order;

import abstractfactory.pizzaabstractfactory.pizza.BJCheesePizza;
import abstractfactory.pizzaabstractfactory.pizza.BJPepperPizza;
import abstractfactory.pizzaabstractfactory.pizza.Pizza;

/**
 * 这是一个工厂子类
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 16:52 2021-04-03
 */
public class BJFactory implements AbsFactory {
  @Override
  public Pizza createPizza(String orderType) {
    System.out.println("use bjfactory");
    Pizza pizza = null;
    if (orderType.equals("cheese")) {
      pizza = new BJCheesePizza();
    }
    if (orderType.equals("pepper")) {
      pizza = new BJPepperPizza();
    }
    return pizza;
  }
}
