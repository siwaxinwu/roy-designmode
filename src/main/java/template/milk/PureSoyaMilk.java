package template.milk;

/**
 * ´¿Å£ÄÌµÄÖÆ×÷
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 19:30 2021-03-17
 */
public class PureSoyaMilk extends SoyaMilk {

  @Override
  public void addCondiments() {}

  @Override
  boolean customerWantCondiments() {
    return false;
  }
}
