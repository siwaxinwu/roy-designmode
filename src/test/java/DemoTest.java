import abstractfactory.*;
import adaptor.Adaptee;
import adaptor.Adapter;
import adaptor.Target;
import builder.ManBuilder;
import builder.Person;
import builder.PersonDirector;
import chain1.handler.HRRequestHandler;
import chain1.handler.PMRequestHandler;
import chain1.handler.RequestHandler;
import chain1.handler.TLRequestHandler;
import chain1.request.AddMoneyRequest;
import chain1.request.DimissionRequest;
import chain1.request.Request;
import facade.*;
import org.junit.Test;
import prototype.ConcretePrototype;
import prototype.Prototype;
import strategy.Context;
import strategy.StrategyImplA;
import strategy.StrategyImplB;
import strategy.StrategyImplC;
import template.Template;
import template.TemplateConcrete;

/**
 * @description：
 * @author： dingyawu
 * @date： created in 11:53 2021-01-24
 * @history:
 */
public class DemoTest {
  @Test
  public void testFactory() {
    IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
    ICat blackCat = blackAnimalFactory.createCat();
    blackCat.eat();
    IDog blackDog = blackAnimalFactory.createDog();
    blackDog.eat();
    IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
    ICat whiteCat = whiteAnimalFactory.createCat();
    whiteCat.eat();
    IDog whiteDog = whiteAnimalFactory.createDog();
    whiteDog.eat();
  }

  @Test
  public void testChain() {
    RequestHandler hr = new HRRequestHandler();
    RequestHandler pm = new PMRequestHandler(hr);
    RequestHandler tl = new TLRequestHandler(pm);

    // team leader处理离职请求
    Request request = new DimissionRequest();
    tl.handleRequest(request);

    System.out.println("===========");

    // team leader处理加薪请求
    request = new AddMoneyRequest();
    tl.handleRequest(request);

    System.out.println("========");

    // 项目经理上理辞职请求
    request = new DimissionRequest();
    pm.handleRequest(request);
  }

  @Test
  public void testTemplate() {
    Template temp = new TemplateConcrete();
    temp.update();
  }

  @Test
  public void testFacade() {
    ServiceA sa = new ServiceAImpl();
    ServiceB sb = new ServiceBImpl();
    sa.methodA();
    sb.methodB();
    System.out.println("========");
    // facade
    Facade facade = new Facade();
    facade.methodA();
    facade.methodB();
  }

  /** 策略模式的演示demo */
  @Test
  public void testStrategy() {
    Context ctx = new Context(new StrategyImplA());
    ctx.doMethod();
    ctx = new Context(new StrategyImplB());
    ctx.doMethod();
    ctx = new Context(new StrategyImplC());
    ctx.doMethod();
  }

  @Test
  public void testAdaptor() {
    Target target = new Adapter(new Adaptee());
    target.adapteeMethod();
    target.adapterMethod();
  }

  @Test
  public void testBuilder() {
    PersonDirector pd = new PersonDirector();
    Person person = pd.constructPerson(new ManBuilder());
    System.out.println(person.getBody());
    System.out.println(person.getFoot());
    System.out.println(person.getHead());
  }

  @Test
  public void testPrototype() {
    Prototype pro = new ConcretePrototype("prototype");
    Prototype pro2 = (Prototype) pro.clone();
    System.out.println(pro.getName());
    System.out.println(pro2.getName());
  }
}
