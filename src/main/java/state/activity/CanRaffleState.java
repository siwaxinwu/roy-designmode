package state.activity;

import java.util.Random;

/**
 * 可以抽奖的状态
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 2021-04-04 23:01
 */
public class CanRaffleState extends State {
  RaffleActivity activity;

  public CanRaffleState(RaffleActivity raffleActivity) {
    super();
    this.activity = raffleActivity;
  }

  /** 已经扣除了积分，不能再扣了 */
  @Override
  public void deductMoney() {
    System.out.println("已经扣取过了积分");
  }

  /**
   * 可以抽奖，抽完奖后，根据实际情况，改成新的状态
   *
   * @return boolean
   */
  @Override
  public boolean raffle() {
    System.out.println("正在抽奖，请稍等");
    Random r = new Random();
    int num = r.nextInt(10);
    // 10%的中奖机会
    if (num == 0) {
      // 改活动状态为发放奖品context
      activity.setState(activity.getDispenseState());
      return true;
    } else {
      System.out.println("很遗憾没有抽中奖品");
      // 改变状态为不能抽奖
      activity.setState(activity.getNoRafflleState());
      return false;
    }
  }

  /** 不能发放奖品 */
  @Override
  public void dispensePrize() {
    System.out.println("没中奖，不能发放奖品");
  }
}
