package edu.saigonlab.demo.session_5;

import edu.saigonlab.demo.utils.LogUtils;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateSample {

  public static void main(String[] args) {

    LogUtils.log("######################## LocalDate ####################");
    localDate();
    LogUtils.log("\n");
    LogUtils.log("######################## LocalDateTime ####################");
    localDateTime();
  }

  public static void localDate() {
    // now
    LocalDate localDate = LocalDate.now();
    LogUtils.log("LocalDate.now() = " + localDate);

    // minusDays
    localDate = localDate.minusDays(1);
    LogUtils.log("localDate.minusDays(1) = " + localDate);

    // plusDays
    localDate = localDate.plusDays(1);
    LogUtils.log("localDate.plusDays(1) = " + localDate);

    // of
    localDate = LocalDate.of(2018, Month.APRIL, 1);
    LogUtils.log("LocalDate.of(2018, Month.APRIL, 1) = " + localDate);
  }

  public static void localDateTime() {
    // now
    LocalDateTime localDateTime = LocalDateTime.now();
    LogUtils.log("LocalDateTime.now() = " + localDateTime);

    // minusDays
    localDateTime = localDateTime.minusDays(1);
    LogUtils.log("localDateTime.minusDays(1) = " + localDateTime);

    // plusDays
    localDateTime = localDateTime.plusDays(1);
    LogUtils.log("localDateTime.plusDays(1) = " + localDateTime);

    // of
    localDateTime = LocalDateTime.of(2018, Month.APRIL, 1, 2, 4);
    LogUtils.log("LocalDateTime.of(2018, Month.APRIL, 1, 2, 4) = " + localDateTime);
  }

}
