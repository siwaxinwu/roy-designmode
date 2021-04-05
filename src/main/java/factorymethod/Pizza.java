package factorymethod;

import lombok.Data;

/**
 * 将pizza类做成抽象类
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 19:32 2021-03-21
 */
@Data
public abstract class Pizza {
  private String name;

  /** 准备原材料 ，不同的pizza不一致 */
  public abstract void prepare();

  public void bake() {
    System.out.println(name + "baking....");
  }

  public void cut() {
    System.out.println(name + "cutting....");
  }

  public void box() {
    System.out.println(name + "boxing....");
  }
}
