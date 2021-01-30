package chain1.handler;

import chain1.request.LeaveRequest;
import chain1.request.Request;

// 项目leader处理
public class TLRequestHandler implements RequestHandler {
  RequestHandler rh;

  public TLRequestHandler(RequestHandler rh) {
    this.rh = rh;
  }

  @Override
  public void handleRequest(Request request) {
    if (request instanceof LeaveRequest) {
      System.out.println("要请假, 项目组长审批!");
    } else {
      rh.handleRequest(request);
    }
  }
}
