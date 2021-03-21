package responsibilitychain;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 16:31 2021-03-21
 */
public abstract class Approver {
  Approver next;

  String name;

  public Approver(String name) {
    this.name = name;
  }

  public void setNext(Approver approver) {
    this.next = approver;
  }

  /**
   * 处理审批请求的方法，得到一个请求，处理是子类完成，因此该方法做成抽象
   *
   * @param purchaseRequest 购买请求
   */
  public abstract void processRequest(PurchaseRequest purchaseRequest);
}
