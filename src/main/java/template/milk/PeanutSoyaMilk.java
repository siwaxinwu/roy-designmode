package template.milk;

/**
 * 花生牛奶的制作
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 19:09 2021-03-17
 */
public class PeanutSoyaMilk extends SoyaMilk {
  @Override
  public void addCondiments() {
    System.out.println("add best peanut");
  }
}
