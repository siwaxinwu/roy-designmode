package adaptor.charge1;

/**
 * 适配器类 ,类适配器由继承被适配者转变成通过构造器注入 ,持有src, 实现dest
 *
 * @author siwaxinwu5
 * @date 2021/03/16
 */
public class VoltageAdapter implements IVoltage5V {

  private Voltage220V voltage220V;

  /**
   * 通过构造器，传入一个 Voltage220V 实例
   *
   * @param voltage220v voltage220v
   */
  public VoltageAdapter(Voltage220V voltage220v) {
    this.voltage220V = voltage220v;
  }

  @Override
  public int output5V() {
    int dst = 0;
    if (null != voltage220V) {
      // 获取220V 电压
      int src = voltage220V.output220V();
      System.out.println("使用对象适配器，进行适配~~");
      dst = src / 44;
      System.out.println("适配完成，输出的电压为=" + dst);
    }
    return dst;
  }
}
