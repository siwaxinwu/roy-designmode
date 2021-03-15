package prototype.deepclone;

/**
 * 测试原型模式的两种使用方式 clone方法 序列化和反序列化
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 22:21 2021-03-15
 */
public class CopyClient {
  public static void main(String[] args) throws CloneNotSupportedException {
    Sheep sheep = new Sheep();
    Horse horse = new Horse();
    horse.setName("jack");

    sheep.setName("tom");
    sheep.setHorse(horse);

    Sheep clone = (Sheep) sheep.clone();
    System.out.println(clone);

    Sheep deepClone = sheep.deepClone();
    System.out.println(deepClone);
  }
}
