package prototype.deepclone;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 22:15 2021-03-15
 */
@Data
public class Horse implements Serializable, Cloneable {
  private String name;

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
