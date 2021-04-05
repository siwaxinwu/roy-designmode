package adaptor.charge;

/**
 * 适配器类 继承src，实现dest
 *
 * @author siwaxinwu5
 * @date 2021/03/29
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

  @Override
  public int output5V() {
    // 获取到220V电压
    int srcV = output220V();
    // 转成5v
    return srcV / 44;
  }
}
