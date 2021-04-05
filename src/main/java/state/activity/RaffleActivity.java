package state.activity;

import lombok.Data;

/**
 * 抽奖活动
 *
 * @author siwaxinwu5
 * @date 2021/04/05
 */
@Data
public class RaffleActivity {

  /** 便是活动的当前状态 */
  State state = null;

  /** 奖品数量 */
  int count = 0;

  /** 4个属性，表示4中状态 */
  State noRafflleState = new NoRaffleState(this);

  State canRaffleState = new CanRaffleState(this);
  State dispenseState = new DispenseState(this);
  State dispensOutState = new DispenseOutState(this);

  /**
   * 初始化当前的活动状态为不能抽奖的状态和奖品数量
   *
   * @param count 数
   */
  public RaffleActivity(int count) {
    this.state = getNoRafflleState();
    this.count = count;
  }

  /** 扣积分 */
  public void debuctMoney() {
    state.deductMoney();
  }

  /** 抽奖活动 */
  public void raffle() {
    // 如果当前状态是抽奖成功
    if (state.raffle()) {
      // 领取奖品
      state.dispensePrize();
    }
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  /**
   * 每领取一次奖品，count--
   *
   * @return int
   */
  public int getCount() {
    int curCount = count;
    count--;
    return curCount;
  }
}
