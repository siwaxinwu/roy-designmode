package state.money;

/**
 * 环境上下文
 *
 * @author siwaxinwu5
 * @date 2021/04/05
 */
public class Context extends AbstractState {

  /** 当前状态，根据我们的业务流程处理，不停地变化 */
  private State state;

  @Override
  public void checkEvent(Context context) {
    state.checkEvent(this);
    getCurrentState();
  }

  @Override
  public void checkFailEvent(Context context) {
    state.checkFailEvent(this);
    getCurrentState();
  }

  @Override
  public void makePriceEvent(Context context) {
    state.makePriceEvent(this);
    getCurrentState();
  }

  @Override
  public void acceptOrderEvent(Context context) {
    state.acceptOrderEvent(this);
    getCurrentState();
  }

  @Override
  public void notPeopleAcceptEvent(Context context) {
    state.notPeopleAcceptEvent(this);
    getCurrentState();
  }

  @Override
  public void payOrderEvent(Context context) {
    state.payOrderEvent(this);
    getCurrentState();
  }

  @Override
  public void orderFailureEvent(Context context) {
    state.orderFailureEvent(this);
    getCurrentState();
  }

  @Override
  public void feedBackEvent(Context context) {
    state.feedBackEvent(this);
    getCurrentState();
  }

  public State getState() {
    return state;
  }

  /**
   * 设置状态
   *
   * @param state 状态
   */
  public void setState(State state) {
    this.state = state;
  }

  @Override
  public String getCurrentState() {
    System.out.println("当前状态：" + state.getCurrentState());
    return state.getCurrentState();
  }
}
