package abstractfactory.pizzaabstractfactory.order;

import abstractfactory.pizzaabstractfactory.pizza.Pizza;

/**
 * 一个抽象工厂模式的抽象层（接口）
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 16:42 2021-04-03
 */
public interface AbsFactory {
  /**
   * 让下面的工厂子类来具体实现
   *
   * @param orderType 订单类型
   * @return {@link Pizza}
   */
  public Pizza createPizza(String orderType);
}
