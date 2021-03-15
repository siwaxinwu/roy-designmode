package prototype;

/**
 * @description:
 * @author: dingyawu
 * @date: created in 21:37 2021-02-01
 * @history:
 */
public class Prototype implements Cloneable {
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public Object clone() {
    try {
      return super.clone();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
