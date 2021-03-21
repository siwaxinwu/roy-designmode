package proxy.staticproxy;

/**
 * 静态代理对象
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 20:36 2021-03-18
 */
public class TeacherDaoProxy implements IteacherDao {

  /** 被代理的对象 */
  private IteacherDao target;

  public TeacherDaoProxy(IteacherDao target) {
    this.target = target;
  }

  @Override
  public void teach() {
    System.out.println("静态代理开始.....");
    target.teach();
    System.out.println("静态代理结束.....");
  }
}
