package proxy.staticproxy;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 20:35 2021-03-18
 */
public class TeacherDao implements IteacherDao {
  @Override
  public void teach() {
    System.out.println("老师讲课中...............");
  }
}
