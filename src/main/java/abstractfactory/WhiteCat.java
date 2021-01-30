package abstractfactory;

/**
 * @description：
 * @author： dingyawu
 * @date： created in 11:50 2021-01-24
 * @history:
 */
public class WhiteCat implements ICat {
  @Override
  public void eat() {
    System.out.println("The white cat is eating!");
  }
}
