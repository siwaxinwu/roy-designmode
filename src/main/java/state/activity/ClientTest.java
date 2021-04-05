package state.activity;

public class ClientTest {

  public static void main(String[] args) {
    // 创建一个活动对象，总共有一个奖品
    RaffleActivity activity = new RaffleActivity(1);
    // 连续抽奖
    for (int i = 0; i < 3; i++) {
      System.out.println("-------第" + (i + 1) + "次抽奖-------------");
      // 参与抽奖，扣除积分
      activity.debuctMoney();
      // 抽奖
      activity.raffle();
    }
  }
}
