package singleton;

/** 不允许外部new，直接私有化构造方法，一般我们的工具类也这么写 */
public class LazySingleton {
  private static LazySingleton lazySingleton;

  private LazySingleton() {}

  public static synchronized LazySingleton getInstance() {
    if (null == lazySingleton) {
      lazySingleton = new LazySingleton();
    }
    return lazySingleton;
  }
}
