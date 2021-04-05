package state.activity;

/**
 * 奖品发送完毕的状态，当我们的activity改变成DispenseOutState，即所有的抽奖活动结束
 *
 * @author siwaxinwu5
 * @date 2021/04/05
 */
public class DispenseOutState extends State {

  /** 初始化的时候传入活动引用 */
  RaffleActivity activity;

  public DispenseOutState(RaffleActivity activity) {
    this.activity = activity;
  }

  @Override
  public void deductMoney() {
    System.out.println("奖品发送完了，请下次参加");
  }

  @Override
  public boolean raffle() {
    System.out.println("奖品发送完了，请下次参加");
    return false;
  }

  @Override
  public void dispensePrize() {
    System.out.println("奖品发送完了，请下次参加");
  }
}
