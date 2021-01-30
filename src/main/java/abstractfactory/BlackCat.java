package abstractfactory;

/**
 * @description：
 * @author： dingyawu
 * @date： created in 11:49 2021-01-24
 * @history:
 */
public class BlackCat implements ICat {
  @Override
  public void eat() {
    System.out.println("The black cat is eating!");
  }
}
