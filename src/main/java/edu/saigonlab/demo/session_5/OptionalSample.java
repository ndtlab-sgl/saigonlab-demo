package edu.saigonlab.demo.session_5;

import edu.saigonlab.demo.utils.LogUtils;
import java.time.LocalDateTime;
import java.util.Optional;

public class OptionalSample {

  public static void main(String[] args) {

    LogUtils.log("######################## Optional ####################");
    Optional.ofNullable(getTime(true)).map(LocalDateTime::getHour).ifPresent(LogUtils::log);
    Optional.ofNullable(getTime(false)).map(LocalDateTime::getHour).ifPresent(LogUtils::log);

    LogUtils.log("\n");
    LogUtils.log("######################## Normally ####################");
    LogUtils.log(getTime(true).getHour());
    LogUtils.log(getTime(false).getHour());

  }

  private static LocalDateTime getTime(boolean flg) {
    return flg ? LocalDateTime.now() : null;
  }
}
