package template.milk;

/**
 * 红豆豆浆的制作过程
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 19:11 2021-03-17
 */
public class RedBeanSoyaMilk extends SoyaMilk {
  @Override
  public void addCondiments() {
    System.out.println("add best redbean");
  }

  /** 也可以重写一些方法，不一定是抽象方法 */
  @Override
  public void select() {
    System.out.println("select different douzi for redbean");
  }
}
