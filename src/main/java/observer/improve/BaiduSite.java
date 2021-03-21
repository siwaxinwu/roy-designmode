package observer.improve;

/**
 * 百度网站观察者
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 15:04 2021-03-21
 */
public class BaiduSite implements Observer {
  private float temparature;

  private float pressure;

  private float humidity;

  private void display() {
    System.out.println("百度今天的温度：" + temparature);
    System.out.println("百度今天的气压：" + pressure);
    System.out.println("百度今天的湿度：" + humidity);
  }

  @Override
  public void update(float temparature, float pressure, float humidity) {
    this.temparature = temparature;
    this.pressure = pressure;
    this.humidity = humidity;
    display();
  }
}
