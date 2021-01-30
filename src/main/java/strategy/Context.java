package strategy;

/**
 * @description：
 * @author： dingyawu
 * @date： created in 22:04 2021-01-26
 * @history:
 */
public class Context {
  private Strategy strategy;

  public Context(Strategy stra) {
    this.strategy = stra;
  }

  public void doMethod() {
    strategy.method();
  }
}
