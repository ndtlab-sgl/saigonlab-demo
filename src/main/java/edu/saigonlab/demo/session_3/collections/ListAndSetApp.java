package edu.saigonlab.demo.session_3.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.lang3.RandomUtils;

public class ListAndSetApp {

  private static final String LOG_INFO = "Tong thoi gian xu ly = %s ms, size cua collection = %d";

  private static final int SIZE = 1000000;

  private static final int MAX_VAL = SIZE;

  public static void main(String[] args) {

    // randomArrayListOfInt
    long start = System.currentTimeMillis();

    int size = randomArrayListOfInt(SIZE).size();

    long end = System.currentTimeMillis();
    System.out.println(String.format(LOG_INFO, (end - start), size));

    // randomLinkedListOfInt
    start = System.currentTimeMillis();

    size = randomLinkedListOfInt(SIZE).size();

    end = System.currentTimeMillis();
    System.out.println(String.format(LOG_INFO, (end - start), size));

    // randomHashSetOfInt
    start = System.currentTimeMillis();

    size = randomHashSetOfInt(SIZE).size();

    end = System.currentTimeMillis();
    System.out.println(String.format(LOG_INFO, (end - start), size));

    // randomSortedSetOfInt
    start = System.currentTimeMillis();

    size = randomSortedSetOfInt(SIZE).size();

    end = System.currentTimeMillis();
    System.out.println(String.format(LOG_INFO, (end - start), size));
  }

  private static List<Integer> randomArrayListOfInt(int size) {
    List<Integer> arrs = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      arrs.add(RandomUtils.nextInt(0, MAX_VAL));
    }
    return arrs;
  }

  private static List<Integer> randomLinkedListOfInt(int size) {
    List<Integer> arrs = new LinkedList<>();
    for (int i = 0; i < size; i++) {
      arrs.add(RandomUtils.nextInt(0, MAX_VAL));
    }
    return arrs;
  }

  private static Set<Integer> randomHashSetOfInt(int size) {
    Set<Integer> arrs = new HashSet<>();
    for (int i = 0; i < size; i++) {
      arrs.add(RandomUtils.nextInt(0, MAX_VAL));
    }
    return arrs;
  }

  private static Set<Integer> randomSortedSetOfInt(int size) {
    Set<Integer> arrs = new TreeSet<>();
    for (int i = 0; i < size; i++) {
      arrs.add(RandomUtils.nextInt(0, MAX_VAL));
    }
    return arrs;
  }
}
