package edu.saigonlab.demo.session_3;

public class UserDataValidation implements IDataValidation<String> {

  @Override
  public void validate(String input) {
    if (input == null || input.isEmpty()) {
      throw new IllegalArgumentException("Loi");
    }
    //
    System.out.println("Khong loi");
  }
}
