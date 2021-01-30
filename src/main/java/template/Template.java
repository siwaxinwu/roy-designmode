package template;

/**
 * @description：
 * @author： dingyawu
 * @date： created in 15:06 2021-01-24
 * @history:
 */
public abstract class Template {

  public abstract void print();

  public void update() {
    System.out.println("开始打印");
    for (int i = 0; i < 10; i++) {
      print();
    }
  }
}
