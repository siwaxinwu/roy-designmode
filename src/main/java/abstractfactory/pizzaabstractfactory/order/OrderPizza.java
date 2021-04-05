package abstractfactory.pizzaabstractfactory.order;

import abstractfactory.pizzaabstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 19:40 2021-03-21
 */
public class OrderPizza {
  AbsFactory absFactory;

  public OrderPizza(AbsFactory absFactory) {
    setFactory(absFactory);
  }

  private void setFactory(AbsFactory absFactory) {
    Pizza pizza = null;
    String orderType = "";
    this.absFactory = absFactory;
    do {
      orderType = gettype();
      // 抽象方法，由工厂子类来完成
      pizza = absFactory.createPizza(orderType);
      if (pizza != null) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
      } else {
        System.out.println("order fail");
      }
    } while (true);
  }

  private String gettype() {
    try {
      BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("input pizza type:");
      String str = strin.readLine();
      return str;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "";
  }
}
