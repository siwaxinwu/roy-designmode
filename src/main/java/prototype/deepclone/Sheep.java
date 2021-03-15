package prototype.deepclone;

import lombok.Data;

import java.io.*;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 22:15 2021-03-15
 */
@Data
public class Sheep implements Serializable, Cloneable {
  private String name;

  private Horse horse;

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Sheep deepObj = (Sheep) super.clone();
    deepObj.setHorse((Horse) horse.clone());
    // deepObj.horse = (Horse) horse.clone();
    return deepObj;
  }

  public Sheep deepClone() {
    ByteArrayOutputStream bos = null;
    ObjectOutputStream oos = null;
    ByteArrayInputStream bis = null;
    ObjectInputStream ois = null;
    try {
      bos = new ByteArrayOutputStream();
      oos = new ObjectOutputStream(bos);
      // 当前这个对象以对象流的方式输出
      oos.writeObject(this);
      // 反序列化
      bis = new ByteArrayInputStream(bos.toByteArray());
      ois = new ObjectInputStream(bis);
      return (Sheep) ois.readObject();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    } finally {
      try {
        bos.close();
        oos.close();
        bis.close();
        ois.close();
      } catch (Exception e2) {
        System.out.println(e2.getMessage());
      }
    }
  }
}
