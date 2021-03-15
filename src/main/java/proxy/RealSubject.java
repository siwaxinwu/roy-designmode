package proxy;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 8:16 2021-03-04
 */
public class RealSubject implements Subject {

  @Override
  public void dosth() {
    System.out.println("this is proxy designmode");
  }
}
