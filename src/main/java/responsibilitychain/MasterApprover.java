package responsibilitychain;

/**
 * @author dingyawu
 * @version 1.0
 * @date created in 16:35 2021-03-21
 */
public class MasterApprover extends Approver {
  public MasterApprover(String name) {
    super(name);
  }

  @Override
  public void processRequest(PurchaseRequest purchaseRequest) {
    if (purchaseRequest.getPrice() > 30000) {
      System.out.println("请求编号id：" + purchaseRequest.getId() + "被" + this.name + "处理");
    } else {
      next.processRequest(purchaseRequest);
    }
  }
}
