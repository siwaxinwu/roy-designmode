package builder;

/**
 * @description:
 * @author: dingyawu
 * @date: created in 21:09 2021-02-01
 * @history:
 */
public class PersonDirector {
  public Person constructPerson(PersonBuilder pb) {
    pb.buildHead();
    pb.buildBody();
    pb.buildFoot();
    return pb.buildPerson();
  }
}
