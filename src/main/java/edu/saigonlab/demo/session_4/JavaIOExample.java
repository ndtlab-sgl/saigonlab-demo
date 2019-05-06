package edu.saigonlab.demo.session_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaIOExample {

  public static void main(String[] args) throws IOException {
    final String path = "input.txt";

    //docVaKiemTraFile(path);

    //soSanhDuongDanFile(path, path);

    //soSanhDuongDanFile(path, "input1.txt");

    docVaGhiNoiDungBangFileXXXStream(path, "output.txt");

    docVaGhiNoiDungBangFileReaderAndWriter(path, "outputWriter.txt");
  }

  private static void docVaKiemTraFile(String path) {
    final File file = new File(path);
    if (file.exists()) {
      System.out.println("Ton tai file");
    } else {
      System.out.println("Khong ton tai file");
    }
  }

  private static void soSanhDuongDanFile(String path, String comparedPath) {
    File file1 = new File(path);
    File file2 = new File(comparedPath);
    if (file1.compareTo(file2) == 0) {
      System.out.println("Hai file giong nhau");
    } else {
      System.out.println("Hai file khong giong nhau");
    }
  }

  private static void docVaGhiNoiDungBangFileXXXStream(String path, String output) throws IOException {
    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {
      fis = new FileInputStream(path);
      fos = new FileOutputStream(output);

      int c;
      while ((c = fis.read()) != -1) {
        System.out.println("Writing..." + c);
        fos.write(c);
      }
    } finally {
      if (fis != null) {
        fis.close();
      }

      if (fos != null) {
        fos.close();
      }
    }
  }

  private static void docVaGhiNoiDungBangFileReaderAndWriter(String path, String output) throws IOException {
    FileReader fr = null;
    FileWriter fw = null;
    try {
      fr = new FileReader(path);
      fw = new FileWriter(output);

      int c;
      while ((c = fr.read()) != -1) {
        System.out.println("Writing..." + c);
        fw.write(c);
      }
    } finally {
      if (fr != null) {
        fr.close();
      }

      if (fw != null) {
        fw.close();
      }
    }
  }

}
