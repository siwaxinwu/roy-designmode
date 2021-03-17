package adaptor.charge2;

public class Client {
  public static void main(String[] args) {

    AbsAdapter absAdapter =
        new AbsAdapter() {
          @Override
          public void m1() {
            // TODO Auto-generated method stub
            System.out.println("使用了m1的方法");
          }
        };

    absAdapter.m1();
  }
}
