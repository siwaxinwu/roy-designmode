package strategy.duckdemo;

public class WildDuck extends Duck {

  public WildDuck() {
    // TODO Auto-generated constructor stub
    flyBehavior = new GoodFlyBehavior();
  }

  @Override
  public void display() {
    // TODO Auto-generated method stub
    System.out.println("这是野鸭");
  }
}
