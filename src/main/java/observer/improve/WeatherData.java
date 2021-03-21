package observer.improve;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 核心类 包含最新的天气情况信息， 含有观察者集合，使用arraylist集合管理 , 主动调用arraylist,通知所有的接入方
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 7:51 2021-03-19
 */
@Data
public class WeatherData implements Subject {
  private float temparature;

  private float pressure;

  private float humidity;

  private List<Observer> observers;

  public WeatherData() {
    this.observers = new ArrayList<Observer>();
  }

  /**
   * 当数据有更新的时候就调用setData
   *
   * @param temparature 稍加观察
   * @param pressure 压力
   * @param humidity 湿度
   */
  public void setData(float temparature, float pressure, float humidity) {
    this.temparature = temparature;
    this.pressure = pressure;
    this.humidity = humidity;
    notifyObservers();
  }

  /**
   * 注册一个观察者
   *
   * @param observer 观察者
   */
  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  /**
   * 移除一个观察者
   *
   * @param observer 观察者
   */
  @Override
  public void removeObserver(Observer observer) {
    if (observers.contains(observer)) {
      observers.remove(observer);
    }
  }

  /** 遍历观察者,并通知 */
  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(this.temparature, this.pressure, this.humidity);
    }
  }
}
