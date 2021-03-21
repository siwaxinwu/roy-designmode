package observer.improve;

/**
 * 观察者接口，由观察者来实现
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 0:46 2021-03-21
 */
public interface Observer {

  public void update(float temparature, float pressure, float humidity);
}
