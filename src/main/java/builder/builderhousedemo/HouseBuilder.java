package builder.builderhousedemo;

/**
 * ���ݽ����� ����Ľ�����
 *
 * @author siwaxinwu5
 * @date 2021/03/15
 */
public abstract class HouseBuilder {

  protected House house = new House();

  public abstract void buildBasic();

  public abstract void buildWalls();

  public abstract void roofed();

  /**
   * ���췿�Ӻã� ����Ʒ(����) ����
   *
   * @return {@link House}
   */
  public House buildHouse() {
    return house;
  }
}
