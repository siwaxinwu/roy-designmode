/**
 * @description:
 * @author: dingyawu
 * @date: created in 21:46 2021-02-01
 * @history:
 */
public class Singleton {
  private static Singleton singleton = new Singleton();

  public static Singleton getInstance() {
    return singleton;
  }

  public static void main(String[] args) {
    Singleton instance = Singleton.getInstance();
    Singleton instance1 = Singleton.getInstance();
    System.out.println(true);
  }
}
