package factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 19:40 2021-03-21
 */
public abstract class OrderPizza {

  public OrderPizza() {
    String orderType = "";
    do {
      orderType = gettype();
      // 抽象方法，由工厂子类来完成
      Pizza pizza = createPizza(orderType);
      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();
    } while (true);
  }

  public abstract Pizza createPizza(String orderType);

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
