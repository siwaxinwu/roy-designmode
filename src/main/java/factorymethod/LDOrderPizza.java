package factorymethod;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 1:00 2021-04-03
 */
public class LDOrderPizza extends OrderPizza {
  @Override
  public Pizza createPizza(String orderType) {
    Pizza pizza = null;
    if ("cheese".equals(orderType)) {
      pizza = new LDCheesePizza();
    } else if ("pepper".equals(orderType)) {
      pizza = new LDPepperPizza();
    }
    return pizza;
  }
}
