package builder.builderhousedemo;

/**
 * 指导者
 *
 * @author siwaxinwu5
 * @date 2021/03/15
 */
public class HouseDirector {

  HouseBuilder houseBuilder = null;

  /**
   * 可以为指导者注入具体的建造者 相比构造方法更为方便，不需要不停地new指导者
   *
   * @param houseBuilder 房屋建造商
   */
  public void setHouseBuilder(HouseBuilder houseBuilder) {
    this.houseBuilder = houseBuilder;
  }

  public House constructHouse() {
    houseBuilder.buildBasic();
    houseBuilder.buildWalls();
    houseBuilder.roofed();
    return houseBuilder.buildHouse();
  }
}
