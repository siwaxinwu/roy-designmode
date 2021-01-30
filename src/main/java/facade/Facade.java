package facade;

/**
 * @description：
 * @author： dingyawu
 * @date： created in 15:13 2021-01-24
 * @history:
 */
public class Facade {
  ServiceA sa;
  ServiceB sb;
  ServiceC sc;

  public Facade() {
    sa = new ServiceAImpl();
    sb = new ServiceBImpl();
    sc = new ServiceCImpl();
  }

  public void methodA() {
    sa.methodA();
    sb.methodB();
  }

  public void methodB() {
    sb.methodB();
    sc.methodC();
  }

  public void methodC() {
    sc.methodC();
    sa.methodA();
  }
}
