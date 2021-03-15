package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 它的三个参数分别是加载动态生成的代理类的类加载器、业务类实现的接口和上面介绍的InvocationHandler对象。
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 8:18 2021-03-04
 */
public class InvokeHandler implements InvocationHandler {
  private Object target;

  public InvokeHandler(Subject subject) {
    this.target = subject;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    return method.invoke(target, args);
  }

  public Object getProxy() {
    return Proxy.newProxyInstance(
        Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
  }

  public static void main(String[] args) {
    RealSubject subject = new RealSubject();
    InvokeHandler invokeHandler = new InvokeHandler(subject);
    Subject proxy = (Subject) invokeHandler.getProxy();
    proxy.dosth();
  }
}
