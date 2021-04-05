package factorymethod;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 0:34 2021-04-03
 */
public class LDCheesePizza extends Pizza {
  @Override
  public void prepare() {
    setName("伦敦的奶酪披萨");
    System.out.println("伦敦的奶酪披萨准备原材料");
  }
}
