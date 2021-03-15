package builder.builderhousedemo;

public class HighBuilding extends HouseBuilder {

  @Override
  public void buildBasic() {
    // TODO Auto-generated method stub
    System.out.println("建设高楼大厦地基100m");
  }

  @Override
  public void buildWalls() {
    // TODO Auto-generated method stub
    System.out.println("建设高楼大厦墙体1m厚");
  }

  @Override
  public void roofed() {
    // TODO Auto-generated method stub
    System.out.println("建设高楼大厦屋顶1m高");
  }
}
