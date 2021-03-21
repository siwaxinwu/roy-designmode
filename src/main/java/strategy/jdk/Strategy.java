package strategy.jdk;

import java.util.Arrays;
import java.util.Comparator;

/**
 * comparator就是一个函数式的策略接口
 *
 * @author dingyawu
 * @version 1.0
 * @date created in 20:06 2021-03-18
 */
public class Strategy {
  public static void main(String[] args) {
    Integer[] data = {1, 4, 6, 2, 9};

    Comparator<Integer> comparator =
        new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
            if (o1 > o2) {
              return -1;
            } else {
              return 1;
            }
          }
        };

    Arrays.sort(data, comparator);
    System.out.println(Arrays.toString(data));
  }
}
