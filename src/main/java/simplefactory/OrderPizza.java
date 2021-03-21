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
  public OrderPizza() {
    Pizza pizza = null;
    String orderType;
    do {
      orderType = gettype();
      if ("greek".equals(orderType)) {
        pizza = new GreekPizza();
        pizza.setName("希腊pizza");
      }

      if ("cheese".equals(orderType)) {
        pizza = new CheesePizza();
        pizza.setName("奶酪pizza");
      } else {
        break;
      }
      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();

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
