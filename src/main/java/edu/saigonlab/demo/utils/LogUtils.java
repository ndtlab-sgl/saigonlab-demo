package edu.saigonlab.demo.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class LogUtils {

  public <T> void log(T obj) {
    System.out.println(obj);
  }
}
