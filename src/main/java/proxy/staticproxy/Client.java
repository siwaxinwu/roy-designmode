package proxy.staticproxy;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 20:41 2021-03-18
 */
public class Client {
  public static void main(String[] args) {
    // 创建目标对象
    IteacherDao teacherDao = new TeacherDao();
    // 创建代理对象，同时将被代理对象传递给代理对象
    TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);
    proxy.teach();
  }
}
