package template.milk;

/**
 * �����࣬��ʾ����
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 19:03 2021-03-17
 */
public abstract class SoyaMilk {
  /** ģ�巽������ʾ����������������ģ�巽����������final����������ȥ���� */
  final void make() {
    select();
    if (customerWantCondiments()) {
      addCondiments();
    }
    soak();
    beat();
  }

  /** ���� */
  public void beat() {
    System.out.println(" fouth: beat.....");
  };

  /** ���� */
  public void soak() {
    System.out.println("third: soak.....");
  };

  /** ��ӵ�ζƷ */
  public abstract void addCondiments();

  /** ѡ�� */
  public void select() {
    System.out.println("first: select best dou ");
  };

  /**
   * �ͻ��Ƿ���Ҫ���� ���ӷ����������Ƿ���Ҫ������� ģ�巽��������ӹ��ӷ���
   *
   * @return boolean
   */
  boolean customerWantCondiments() {
    return true;
  }
}
