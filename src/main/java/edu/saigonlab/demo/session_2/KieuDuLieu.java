package edu.saigonlab.demo.session_2;

import lombok.Data;

@Data
public class KieuDuLieu {

  private int a = 1;

  private int b;

  public KieuDuLieu() {

  }

  public KieuDuLieu(int aTemp) {
    this.a = aTemp;
  }

  public KieuDuLieu(int aTemp, int bTemp) {
    this.a = aTemp;
    this.b = bTemp;
  }

  public static void main(String[] args) {
    String s = "saigon";
    s = s.concat("edulab");

    System.out.println(s);
  }

}
