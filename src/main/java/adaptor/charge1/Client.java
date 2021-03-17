package adaptor.charge1;

/**
 * 客户端，演示对象适配器
 *
 * @author siwaxinwu5
 * @date 2021/03/16
 */
public class Client {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(" === 对象适配器模式 ====");
    Phone phone = new Phone();
    phone.charging(new VoltageAdapter(new Voltage220V()));
  }
}
