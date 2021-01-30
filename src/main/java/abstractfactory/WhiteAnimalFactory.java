package abstractfactory;

/**
 * @description：
 * @author： dingyawu
 * @date： created in 11:49 2021-01-24
 * @history:
 */
public class WhiteAnimalFactory implements IAnimalFactory {
  @Override
  public ICat createCat() {
    return new WhiteCat();
  }

  @Override
  public IDog createDog() {
    return new WhiteDog();
  }
}
