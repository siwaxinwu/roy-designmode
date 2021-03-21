package strategy.duckdemo;

public abstract class Duck {
  // 属性、策略接口
  FlyBehavior flyBehavior;
  // 属性、策略接口
  QuackBehavior quackBehavior;

  public Duck() {}

  // 显示鸭子信息
  public abstract void display();

  public void quack() {
    System.out.println("鸭子嘎嘎叫");
  }

  public void swim() {
    System.out.println("鸭子会游泳");
  }

  public void fly() {

    if (flyBehavior != null) {
      flyBehavior.fly();
    }
  }

  /**
   * 设置动态行为
   *
   * @param flyBehavior 飞的行为
   */
  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
