package strategy.duckdemo;

public class PekingDuck extends Duck {

  /** 北京鸭的飞翔技术一般 */
  public PekingDuck() {
    // TODO Auto-generated constructor stub
    flyBehavior = new BadFlyBehavior();
  }

  @Override
  public void display() {
    // TODO Auto-generated method stub
    System.out.println("北京鸭");
  }
}
