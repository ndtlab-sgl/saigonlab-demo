package edu.saigonlab.demo.session_4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIOSampleStreamReader {

  public static void main(String[] args) throws IOException {
    readInputStream();
  }

  private static void readInputStream() throws IOException {
    InputStreamReader isr = null;
    try {
      isr = new InputStreamReader(System.in);
      System.out.println("Nhan 'q' de thoat.");

      char c;
      do {
        c = (char) isr.read();
        System.out.print(c);
      } while (c != 'q');

    } finally {
      if (isr != null) {
        isr.close();
      }
    }
  }
}
