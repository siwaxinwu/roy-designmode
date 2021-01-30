package singleton;

/**
 * @description:
 * @author: dingyawu
 * @date: created in 0:05 2021-01-31
 * @history:
 */
public class StaticNestClassSingleton {
  private static class Singleton {
    private static StaticNestClassSingleton singleton = new StaticNestClassSingleton();
  }

  private static StaticNestClassSingleton getInstance() {
    return Singleton.singleton;
  }
}
