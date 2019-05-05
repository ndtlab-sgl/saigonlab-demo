package edu.saigonlab.demo.session_3;

public class ToanTu {

  public static void main(String[] args) {

//    int d = 25;
//
//    System.out.println("d++ = " + (d++));
//    System.out.println("++d = " + (++d));

//    String[] arrs = new String[] {};
//    for (int i = 0; i <= arrs.length; i++) {
//      System.out.println("i = " + i);
//    }
//
//    List<String> list = new ArrayList<String>();
//
//    for (String item : list) {
//      item.contains("A");
//    }
//
//    List<String> list2 = new LinkedList<String>();
//    for (String item : list2) {
//      item.contains("A");
//    }
//    list2.stream().forEach(item -> {});

//    IDataValidation<String> userDataValidation = new UserDataValidation();
//    userDataValidation.validate("  ");

    IDataValidation<Integer> currencyDataValidation = new IDataValidation<Integer>() {
      public void validate(Integer input) {
        throw new IllegalArgumentException("Loi");
      }
    };
    currencyDataValidation.validate(10);
  }
}
