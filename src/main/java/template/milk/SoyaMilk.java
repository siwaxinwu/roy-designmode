package template.milk;

/**
 * 抽象类，表示豆浆
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 19:03 2021-03-17
 */
public abstract class SoyaMilk {
  /** 模板方法，表示豆浆的制作方法，模板方法可以做成final，不让子类去覆盖 */
  final void make() {
    select();
    if (customerWantCondiments()) {
      addCondiments();
    }
    soak();
    beat();
  }

  /** 打碎 */
  public void beat() {
    System.out.println(" fouth: beat.....");
  };

  /** 浸泡 */
  public void soak() {
    System.out.println("third: soak.....");
  };

  /** 添加调味品 */
  public abstract void addCondiments();

  /** 选料 */
  public void select() {
    System.out.println("first: select best dou ");
  };

  /**
   * 客户是否需要配料 钩子方法，决定是否需要添加配料 模板方法里面添加钩子方法
   *
   * @return boolean
   */
  boolean customerWantCondiments() {
    return true;
  }
}
