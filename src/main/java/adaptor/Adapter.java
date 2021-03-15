package adaptor;

/**
 * @description:
 * @author: dingyawu
 * @date: created in 20:50 2021-02-01
 * @history:
 */
public class Adapter implements Target {

  private Adaptee adaptee;

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void adapteeMethod() {
    adaptee.adapteeMethod();
  }

  @Override
  public void adapterMethod() {
    System.out.println("Adapter method!");
  }
}
