package adaptor.charge;

/**
 * 被适配的类
 *
 * @author siwaxinwu5
 * @date 2021/03/17
 */
public class Voltage220V {

  public int output220V() {
    int src = 220;
    System.out.println("电压=" + src + "伏");
    return src;
  }
}
