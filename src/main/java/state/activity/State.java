package state.activity;

/**
 * 状态抽象类
 *
 * @author siwaxinwu5
 * @date 2021/04/04
 */
public abstract class State {

  /** 扣除积分 */
  public abstract void deductMoney();

  /**
   * 是否抽中奖品
   *
   * @return boolean
   */
  public abstract boolean raffle();

  /** 发放奖品 */
  public abstract void dispensePrize();
}
