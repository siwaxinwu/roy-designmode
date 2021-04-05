package factorymethod;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 0:34 2021-04-03
 */
public class BJPepperPizza extends Pizza {
  @Override
  public void prepare() {
    setName("北京的胡椒披萨");
    System.out.println("北京的胡椒披萨准备原材料");
  }
}
