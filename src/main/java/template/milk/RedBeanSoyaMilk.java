package template.milk;

/**
 * �춹��������������
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 19:11 2021-03-17
 */
public class RedBeanSoyaMilk extends SoyaMilk {
  @Override
  public void addCondiments() {
    System.out.println("add best redbean");
  }

  /** Ҳ������дһЩ��������һ���ǳ��󷽷� */
  @Override
  public void select() {
    System.out.println("select different douzi for redbean");
  }
}
