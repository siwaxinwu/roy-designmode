package observer.improve;

/**
 * 接口，让weatherdata来实现
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 0:43 2021-03-21
 */
public interface Subject {
  public void registerObserver(Observer observer);

  public void removeObserver(Observer observer);

  public void notifyObservers();
}
