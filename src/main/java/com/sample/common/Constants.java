package com.sample.common;

/**
 * 定数管理クラス.
 */
public final class Constants {
  // Dark Sky API用 prefixURL
  public static final String darkskyApiPrefixUrl = "https://api.darksky.net/forecast/";
  // Dark Sky API用 SecretKey
  public static final String darkskyApiSecretKey = "18f9443e488e62e7c55ad8d85117be1a";
  // Line API用 SecretKey
  public static final String lineApiSecretKey
      = "lLt3OgiwUVo9gnfUkL2PK+DJDutDdEjFqqUEdTRr26bm505diQhqiPX5EEdPMdk3fLWgx9S47UhDkNrt5nW4ar7WsN54eye4QXDC1t/QHxEsgExb/e9Q9hPZ70/oIXhEs4W952/aTwXCj9ZHpL0brgdB04t89/1O/w1cDnyilFU=";
  // Line API用？ UserId
  public static final String lineUserId = "Ue3f058707d9179ae8df54a07888dd1aa";
  
  // 稼働時間の設定
  public static int startWorkHour = 7;
  public static int endWorkHour = 22;
  public static int overtime = 24;
}
