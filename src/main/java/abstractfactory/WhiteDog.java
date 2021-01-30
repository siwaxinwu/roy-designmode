package abstractfactory;

/**
 * @description：
 * @author： dingyawu
 * @date： created in 11:50 2021-01-24
 * @history:
 */
public class WhiteDog implements IDog {
  @Override
  public void eat() {
    System.out.println("The white dog is eating!");
  }
}
