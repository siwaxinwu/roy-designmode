package state.money;

public abstract class AbstractState implements State {

  protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");

  /**
   * 抽象类默认实现了state接口的所有方法，子类可以有选择的重写
   *
   * @param context 上下文
   */
  @Override
  public void checkEvent(Context context) {
    throw EXCEPTION;
  }

  @Override
  public void checkFailEvent(Context context) {
    throw EXCEPTION;
  }

  @Override
  public void makePriceEvent(Context context) {
    throw EXCEPTION;
  }

  @Override
  public void acceptOrderEvent(Context context) {
    throw EXCEPTION;
  }

  @Override
  public void notPeopleAcceptEvent(Context context) {
    throw EXCEPTION;
  }

  @Override
  public void payOrderEvent(Context context) {
    throw EXCEPTION;
  }

  @Override
  public void orderFailureEvent(Context context) {
    throw EXCEPTION;
  }

  @Override
  public void feedBackEvent(Context context) {
    throw EXCEPTION;
  }
}
