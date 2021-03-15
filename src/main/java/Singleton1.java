/**
 * @description: 双重检验模式：两层null判断的必要性，
 * @author: dingyawu
 * @date: created in 21:46 2021-02-01
 * @history:
 */
public class Singleton1 {
  private static volatile Singleton1 singleton;
  private static Object object = new Object();

  public static Singleton1 getInstance() {
    if (null == singleton) {
      synchronized (object) {
        if (null == singleton) {
          singleton = new Singleton1();
        }
      }
    }
    return singleton;
  }

  public static void main(String[] args) {
    Singleton1 instance = Singleton1.getInstance();
    Singleton1 instance1 = Singleton1.getInstance();
    System.out.println(instance == instance1);
  }
}
