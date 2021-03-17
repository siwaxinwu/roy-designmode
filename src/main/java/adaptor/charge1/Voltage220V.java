package adaptor.charge1;

/**
 * 被适配的类
 *
 * @author siwaxinwu5
 * @date 2021/03/16
 */
public class Voltage220V {

  public int output220V() {
    int src = 220;
    System.out.println("电压 = " + src + "V");
    return src;
  }
}
