package simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 演示静态工厂，等同于简单工厂模式
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 19:40 2021-03-21
 */
public class OrderPizza1 {

  Pizza pizza;

  public OrderPizza1() {
    String orderType = "";
    do {
      orderType = gettype();
      pizza = SimpleFactory.createPizza1(orderType);
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
