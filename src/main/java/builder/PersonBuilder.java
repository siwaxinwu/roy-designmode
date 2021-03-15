package builder;

/**
 * @description:
 * @author: dingyawu
 * @date: created in 21:07 2021-02-01
 * @history:
 */
public interface PersonBuilder {
  void buildHead();

  void buildBody();

  void buildFoot();

  Person buildPerson();
}
