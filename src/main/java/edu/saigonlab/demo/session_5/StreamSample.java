package edu.saigonlab.demo.session_5;

import edu.saigonlab.demo.utils.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSample {

  public static void main(String[] args) {
    LogUtils.log("######################## Generate Stream ####################");
    generateStream();

    LogUtils.log("######################## Process Stream ####################");
    processStream();
  }

  private static void generateStream() {

    // From Collection
    List<String> list = Arrays.asList("A", "B", "C");
    Stream<String> listStream = list.stream();

    // From Stream
    final Stream<String> names = Stream.of("A", "B", "C");

    // From Array
    final String[] arrs = { "A", "B", "C" };
    Stream<String> arrStream = Stream.of(arrs);
  }

  private static void processStream() {
    final List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 7, 0, 90);

    long start = System.currentTimeMillis();
    LogUtils.log("######################## Stream ####################");

    List<Integer> clonedNumbers = numbers.stream().collect(Collectors.toList());
    LogUtils.log(String.format("Cost time in %s ms", (System.currentTimeMillis() - start)));

    start = System.currentTimeMillis();
    clonedNumbers = numbers.parallelStream().collect(Collectors.toList());
    LogUtils.log(String.format("Cost time in %s ms", (System.currentTimeMillis() - start)));

    start = System.currentTimeMillis();
    int sum = numbers.stream().reduce(0, (x, y) -> x + y);
    LogUtils.log(String.format("Cost time in %s ms", (System.currentTimeMillis() - start)));

    start = System.currentTimeMillis();
    sum = numbers.stream().reduce(0, Integer::sum);
    LogUtils.log(String.format("Cost time in %s ms", (System.currentTimeMillis() - start)));
  }
}
