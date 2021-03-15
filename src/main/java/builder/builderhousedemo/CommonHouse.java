package builder.builderhousedemo;

/**
 * 具体的建造者
 *
 * @author siwaxinwu5
 * @date 2021/03/15
 */
public class CommonHouse extends HouseBuilder {

  @Override
  public void buildBasic() {
    // TODO Auto-generated method stub
    System.out.println("建设普通房子的根基 10m深");
  }

  @Override
  public void buildWalls() {
    // TODO Auto-generated method stub
    System.out.println("建设普通房子的墙10cm");
  }

  @Override
  public void roofed() {
    // TODO Auto-generated method stub
    System.out.println("建设普通房子的屋顶1m高");
  }
}
