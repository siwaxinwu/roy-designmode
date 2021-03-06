package simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 19:40 2021-03-21
 */
public class OrderPizza {
  SimpleFactory factory;
  Pizza pizza;

  public OrderPizza(SimpleFactory factory) {
    setFactory(factory);
  }

  public void setFactory(SimpleFactory factory) {
    String orderType = "";
    this.factory = factory;
    do {
      orderType = gettype();
      pizza = this.factory.createPizza(orderType);
      if (pizza != null) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
      } else {
        System.out.println("order fail");
        break;
      }

    } while (true);
  }

  public OrderPizza() {}

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
