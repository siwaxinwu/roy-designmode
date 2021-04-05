package simplefactory;

/**
 * 简单工厂类
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 0:06 2021-04-03
 */
public class SimpleFactory {
  /**
   * 根据orderType类型返回一个pizza对象 有些地方直接把这个创建对象的方法做成静态的 所以简单工厂模式也叫静态工厂模式
   *
   * @param orderType 订单类型
   * @return {@link Pizza}
   */
  public Pizza createPizza(String orderType) {
    Pizza pizza = null;
    System.out.println("使用简单工厂模式");
    if ("greek".equals(orderType)) {
      pizza = new GreekPizza();
      pizza.setName("希腊pizza");
    }

    if ("cheese".equals(orderType)) {
      pizza = new CheesePizza();
      pizza.setName("奶酪pizza");
    }
    if ("pepper".equals(orderType)) {
      pizza = new PepperPizza();
      pizza.setName("胡椒披萨");
    }
    return pizza;
  }

  public static Pizza createPizza1(String orderType) {
    Pizza pizza = null;
    System.out.println("使用简单工厂模式");
    if ("greek".equals(orderType)) {
      pizza = new GreekPizza();
      pizza.setName("希腊pizza");
    }

    if ("cheese".equals(orderType)) {
      pizza = new CheesePizza();
      pizza.setName("奶酪pizza");
    }
    if ("pepper".equals(orderType)) {
      pizza = new PepperPizza();
      pizza.setName("胡椒披萨");
    }
    return pizza;
  }
}
