package simplefactory;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 19:39 2021-03-21
 */
public class GreekPizza extends Pizza {
  @Override
  public void prepare() {
    System.out.println("给制作希腊pizza准备原材料");
  }
}
