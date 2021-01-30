package abstractfactory;

/**
 * @description：
 * @author： dingyawu
 * @date： created in 11:43 2021-01-24
 * @history:
 */
public interface IAnimalFactory {
  /**
   * 定义创建Icat接口实例的方法
   *
   * @return
   */
  ICat createCat();
  /**
   * 定义创建IDog接口实例的方法
   *
   * @return
   */
  IDog createDog();
}
