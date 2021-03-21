package strategy.duckdemo;

public class ToyDuck extends Duck {

  public ToyDuck() {
    // TODO Auto-generated constructor stub
    flyBehavior = new NoFlyBehavior();
  }

  @Override
  public void display() {
    // TODO Auto-generated method stub
    System.out.println("玩具鸭");
  }

  @Override
  public void quack() {
    System.out.println("玩具鸭不能叫");
  }

  @Override
  public void swim() {
    System.out.println("玩具鸭不会游泳");
  }
}
