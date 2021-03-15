package builder.builderhousedemo;

/**
 * 房屋建造商 抽象的建造者
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
   * 建造房子好， 将产品(房子) 返回
   *
   * @return {@link House}
   */
  public House buildHouse() {
    return house;
  }
}
