package edu.saigonlab.demo.session_2;


public class StringBufferTest {

  public static void main(String... args) {
    long start = System.currentTimeMillis();
    doString();
    System.out.println("" + (System.currentTimeMillis() - start) + "ms");

    start = System.currentTimeMillis();
    doStringBuffer();
    System.out.println("" + (System.currentTimeMillis() - start) + "ms");


    start = System.currentTimeMillis();
    doStringBuilder();
    System.out.println("" + (System.currentTimeMillis() - start) + "ms");

  }

  private static void doString() {
    String s = "";

    for (int i = 0; i < 100000L ; i++) {
      s += "a";
    }
  }

  private static void doStringBuffer() {
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < 100000L ; i++) {
      sb.append("a");
    }
  }

  private static void doStringBuilder() {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < 100000L ; i++) {
      sb.append("a");
    }
  }
}
