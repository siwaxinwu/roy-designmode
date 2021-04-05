package simplefactory;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 23:53 2021-04-02
 */
public class PepperPizza extends Pizza {
  @Override
  public void prepare() {
    System.out.println("给胡椒披萨准备原材料");
  }
}
