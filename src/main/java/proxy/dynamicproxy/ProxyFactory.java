package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 21:06 2021-03-18
 */
public class ProxyFactory implements InvocationHandler {
  private Object target;

  /**
   * 构建构造器，对target进行初始化
   *
   * @param target 目标
   */
  public ProxyFactory(Object target) {
    this.target = target;
  }

  /**
   * 获得代理实例 给目标对象生成一个代理对象 loader：指定当前目标对象使用的类加载器 interfaces：目标对象实现的接口类型
   * h:事件处理，执行目标对象的方法的时候，会触发事情处理器方法，会把当前执行的目标对象方法作为参数传入
   *
   * @return {@link Object}
   */
  public Object getProxyInstance() {
    return Proxy.newProxyInstance(
        target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("JDK动态代理开始");
    Object result = method.invoke(target, args);
    System.out.println("JDK动态代理结束");
    return result;
  }
}
