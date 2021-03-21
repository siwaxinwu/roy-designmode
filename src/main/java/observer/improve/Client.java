package observer.improve;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 14:57 2021-03-21
 */
public class Client {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditions currentConditions = new CurrentConditions();
    BaiduSite baiduSite = new BaiduSite();
    weatherData.registerObserver(currentConditions);
    weatherData.registerObserver(baiduSite);
    System.out.println("通知各个观察者，更新数据");
    weatherData.setData(10f, 20f, 30f);
  }
}
