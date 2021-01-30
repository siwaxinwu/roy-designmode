package abstractfactory;

/**
 * @description：
 * @author： dingyawu
 * @date： created in 11:49 2021-01-24
 * @history:
 */
public class BlackAnimalFactory implements IAnimalFactory {
  @Override
  public IDog createDog() {
    return new BlackDog();
  }

  @Override
  public ICat createCat() {
    return new BlackCat();
  }
}
