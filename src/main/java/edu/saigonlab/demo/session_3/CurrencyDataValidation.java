package edu.saigonlab.demo.session_3;

public class CurrencyDataValidation implements IDataValidation<Integer> {

  public void validate(Integer input) {
    if (input == null || input <= 0) {
      throw new IllegalArgumentException("Loi");
    }
  }
}
