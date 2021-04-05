package state.money;

/**
 * 状态接口
 *
 * @author siwaxinwu5
 * @date 2021/04/05
 */
public interface State {

  /**
   * 电审
   *
   * @param context 上下文
   */
  void checkEvent(Context context);

  /**
   * 电审失败
   *
   * @param context 上下文
   */
  void checkFailEvent(Context context);

  /**
   * 定价发布
   *
   * @param context 上下文
   */
  void makePriceEvent(Context context);

  /**
   * 接单
   *
   * @param context 上下文
   */
  void acceptOrderEvent(Context context);

  /**
   * 无人接单失效
   *
   * @param context 上下文
   */
  void notPeopleAcceptEvent(Context context);

  /**
   * 付款
   *
   * @param context 上下文
   */
  void payOrderEvent(Context context);

  /**
   * 接单有人付款失效
   *
   * @param context 上下文
   */
  void orderFailureEvent(Context context);

  /**
   * 反馈事件
   *
   * @param context 上下文
   */
  void feedBackEvent(Context context);

  String getCurrentState();
}
