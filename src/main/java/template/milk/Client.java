package template.milk;

/**
 * 客户端演示
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 19:12 2021-03-17
 */
public class Client {
  public static void main(String[] args) {
    System.out.println("开始制作红豆豆浆");
    RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
    redBeanSoyaMilk.make();

    System.out.println("开始制作花生豆浆");
    PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
    peanutSoyaMilk.make();

    System.out.println("开始制作纯牛奶");
    PureSoyaMilk pureSoyaMilk = new PureSoyaMilk();
    pureSoyaMilk.make();
  }
}
