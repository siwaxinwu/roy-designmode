package simplefactory;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 19:38 2021-03-21
 */
public class CheesePizza extends Pizza {
  @Override
  public void prepare() {
    System.out.println("给制作奶酪pizza准备原材料");
  }
}
