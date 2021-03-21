package observer;

import lombok.Data;

/**
 * 核心类 包含最新的天气情况信息 ， 含有curerentConditions对象 当数据有更新的时候，
 * 主动调用curerentConditions对象的update（）方法，这样他们就可以看到最新的消息，
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 7:51 2021-03-19
 */
@Data
public class WeatherData {
  private float temparature;

  private float pressure;

  private float humidity;

  private CurrentConditions currentConditions;

  public WeatherData(CurrentConditions currentConditions) {
    this.currentConditions = currentConditions;
  }

  /** 推送信息给接入方 */
  private void dataChange() {
    currentConditions.update(getTemparature(), getPressure(), getHumidity());
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
    dataChange();
  }
}
