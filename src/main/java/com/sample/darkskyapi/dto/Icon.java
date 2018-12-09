package com.sample.darkskyapi.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;

public enum Icon {
    CLEAR_DAY, CLEAR_NIGHT, CLOUDY, PARTLY_CLOUDY_DAY, PARTLY_CLOUDY_NIGHT, RAIN, WIND, FOG;
  // TODO unknown value を取得したらどうするか…
  @JsonValue
  public String toValue() {
    switch (this) {
      case CLEAR_DAY: return "clear-day";
      case CLEAR_NIGHT: return "clear-night";
      case CLOUDY: return "cloudy";
      case PARTLY_CLOUDY_DAY: return "partly-cloudy-day";
      case PARTLY_CLOUDY_NIGHT: return "partly-cloudy-night";
      case RAIN: return "rain";
      case WIND: return "wind";
      case FOG: return "fog";
    }
    return null;
  }

  @JsonCreator
  public static Icon forValue(String value) throws IOException {
    if (value.equals("clear-day")) {
      return CLEAR_DAY;
    }
    if (value.equals("clear-night")) return CLEAR_NIGHT;
    if (value.equals("cloudy")) return CLOUDY;
    if (value.equals("partly-cloudy-day")) return PARTLY_CLOUDY_DAY;
    if (value.equals("partly-cloudy-night")) return PARTLY_CLOUDY_NIGHT;
    if (value.equals("rain")) return RAIN;
    if (value.equals("wind")) return WIND;
    if (value.equals("fog")) return FOG;
    throw new IOException("Cannot deserialize Icon");
  }
}