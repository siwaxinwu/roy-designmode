package state.money;

/**
 * 客户端测试
 *
 * @author siwaxinwu5
 * @date 2021/04/05
 */
public class ClientTest {

  public static void main(String[] args) {
    // 创建context对象，将当前状态设置成PublishState
    Context context = new Context();
    context.setState(new PublishState());
    System.out.println(context.getCurrentState());

    // publish --> not pay
    context.acceptOrderEvent(context);
    // not pay --> paid
    context.payOrderEvent(context);
  }
}
