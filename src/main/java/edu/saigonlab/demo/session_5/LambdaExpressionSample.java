package edu.saigonlab.demo.session_5;

import edu.saigonlab.demo.utils.LogUtils;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionSample {

  public static void main(String[] args) {

    final List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 7, 0, 90);

    long start = System.currentTimeMillis();

    LogUtils.log("######################## Java 7 ####################");
    LogUtils.log("findSquareOfMaxOddForJava7 = " + findSquareOfMaxOddForJava7(numbers));
    LogUtils.log(String.format("Cost time in %s ms", (System.currentTimeMillis() - start)));

    start = System.currentTimeMillis();
    LogUtils.log("######################## Java 8 ####################");
    LogUtils.log("findSquareOfMaxOddForJava8 = " + findSquareOfMaxOddForJava8(numbers));
    LogUtils.log(String.format("Cost time in %s ms", (System.currentTimeMillis() - start)));
  }

  private static int findSquareOfMaxOddForJava7(List<Integer> numbers) {
    int max = 0;
    for (int i : numbers) {
      if (i % 2 != 0 && i > 3 && i < 11 && i > max) {
        max = i;
      }
    }
    return max * max;
  }

  private static int findSquareOfMaxOddForJava8(List<Integer> numbers) {
    return numbers.stream()
      .filter(i -> isOdd(i) && isGreaterThanThree(i) && isLessThanEleven(i))
      .max(Comparator.naturalOrder())
      .map(i -> i * i).orElse(0);
  }

  private static boolean isOdd(int i) {
    return i % 2 != 0;
  }

  private static boolean isGreaterThanThree(int i) {
    return i > 3;
  }

  private static boolean isLessThanEleven(int i) {
    return i < 11;
  }
}
