package observer.improve;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 0:49 2021-03-21
 */
public class CurrentConditions implements Observer {
  private float temparature;

  private float pressure;

  private float humidity;

  private void display() {
    System.out.println("今天的温度：" + temparature);
    System.out.println("今天的气压：" + pressure);
    System.out.println("今天的湿度：" + humidity);
  }

  /**
   * 更新 更新天气情况，由weatherdata来调用，我们使用推送模式
   *
   * @param temparature 稍加观察
   * @param pressure 压力
   * @param humidity 湿度
   */
  @Override
  public void update(float temparature, float pressure, float humidity) {
    this.temparature = temparature;
    this.pressure = pressure;
    this.humidity = humidity;
    display();
  }
}
