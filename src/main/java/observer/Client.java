package observer;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 8:02 2021-03-19
 */
public class Client {
  public static void main(String[] args) {
    // 创建接入方
    CurrentConditions currentConditions = new CurrentConditions();
    // 注入接入方
    WeatherData weatherData = new WeatherData(currentConditions);
    weatherData.setData(30, 23, 45);

    System.out.println("天气发生变化：");
    weatherData.setData(100, 200, 300);
  }
}
