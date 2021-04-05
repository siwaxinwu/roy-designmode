package abstractfactory.pizzaabstractfactory.order;

import abstractfactory.pizzaabstractfactory.pizza.LDCheesePizza;
import abstractfactory.pizzaabstractfactory.pizza.LDPepperPizza;
import abstractfactory.pizzaabstractfactory.pizza.Pizza;

/**
 * 这是一个工厂子类
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 16:52 2021-04-03
 */
public class LDFactory implements AbsFactory {
  @Override
  public Pizza createPizza(String orderType) {
    System.out.println("use ldfactory");
    Pizza pizza = null;
    if (orderType.equals("cheese")) {
      pizza = new LDCheesePizza();
    }
    if (orderType.equals("pepper")) {
      pizza = new LDPepperPizza();
    }
    return pizza;
  }
}
