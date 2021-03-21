package responsibilitychain;

import lombok.Data;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 16:29 2021-03-21
 */
@Data
public class PurchaseRequest {

  private Integer type;
  private Integer id;
  private float price = 0f;

  /**
   * 购买请求
   *
   * @param type 类型
   * @param id id
   * @param price 价格
   */
  public PurchaseRequest(Integer type, Integer id, float price) {
    this.type = type;
    this.id = id;
    this.price = price;
  }
}
