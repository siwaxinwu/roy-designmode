package proxy.dynamicproxy;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 21:18 2021-03-18
 */
public class Client {
  public static void main(String[] args) {
    IteacherDao target = new TeacherDao();
    ProxyFactory factory = new ProxyFactory(target);
    // 内存中生成了代理对象
    IteacherDao instance = (IteacherDao) factory.getProxyInstance();
    System.out.println(instance.getClass());
    instance.teach();
  }
}
