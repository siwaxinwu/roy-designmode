package builder.builderhousedemo;

/**
 * 客户端
 *
 * @author siwaxinwu5
 * @date 2021/03/15
 */
public class Client {
  public static void main(String[] args) {

    CommonHouse commonHouse = new CommonHouse();
    HouseDirector houseDirector = new HouseDirector();
    houseDirector.setHouseBuilder(commonHouse);

    House house = houseDirector.constructHouse();
    System.out.println("--------------------------");

    HighBuilding highBuilding = new HighBuilding();
    houseDirector.setHouseBuilder(highBuilding);
    houseDirector.constructHouse();
  }
}
