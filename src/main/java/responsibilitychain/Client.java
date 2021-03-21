package responsibilitychain;

/**
 * 通过职责链来解决OA系统的审批，将处理人构成一个环形，就可以任意一个链节点调用
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 16:46 2021-03-21
 */
public class Client {
  public static void main(String[] args) {
    // 创建一个请求
    PurchaseRequest purchaseRequest = new PurchaseRequest(1, 1, 30000);
    // 创建相关的审批人
    DepartmentApprover departmentApprover = new DepartmentApprover("数学教研组");
    CollegeApprover collegeApprover = new CollegeApprover("数学系");
    ViceMasterApprover viceMasterApprover = new ViceMasterApprover("王副校长");
    MasterApprover masterApprover = new MasterApprover("丁校长");

    // 需要将各个审批级别的下一个设置好(处理人构成环形：)
    departmentApprover.setNext(collegeApprover);
    collegeApprover.setNext(viceMasterApprover);
    viceMasterApprover.setNext(masterApprover);
    masterApprover.setNext(departmentApprover);
    masterApprover.processRequest(purchaseRequest);
  }
}
