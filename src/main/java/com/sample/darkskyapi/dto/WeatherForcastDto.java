package com.sample.darkskyapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherForcastDto {
 private double latitude;
 private double longitude;
 private String timezone;
 private Currently currently;
 private Minutely minutely;
 private Hourly hourly;
 private Daily daily;
 private Flags flags;
 private long offset;

 @JsonProperty("latitude")
 public double getLatitude() { return latitude; }
 @JsonProperty("latitude")
 public void setLatitude(double value) { this.latitude = value; }

 @JsonProperty("longitude")
 public double getLongitude() { return longitude; }
 @JsonProperty("longitude")
 public void setLongitude(double value) { this.longitude = value; }

 @JsonProperty("timezone")
 public String getTimezone() { return timezone; }
 @JsonProperty("timezone")
 public void setTimezone(String value) { this.timezone = value; }

 @JsonProperty("currently")
 public Currently getCurrently() { return currently; }
 @JsonProperty("currently")
 public void setCurrently(Currently value) { this.currently = value; }

 @JsonProperty("minutely")
 public Minutely getMinutely() { return minutely; }
 @JsonProperty("minutely")
 public void setMinutely(Minutely value) { this.minutely = value; }

 @JsonProperty("hourly")
 public Hourly getHourly() { return hourly; }
 @JsonProperty("hourly")
 public void setHourly(Hourly value) { this.hourly = value; }

 @JsonProperty("daily")
 public Daily getDaily() { return daily; }
 @JsonProperty("daily")
 public void setDaily(Daily value) { this.daily = value; }

 @JsonProperty("flags")
 public Flags getFlags() { return flags; }
 @JsonProperty("flags")
 public void setFlags(Flags value) { this.flags = value; }

 @JsonProperty("offset")
 public long getOffset() { return offset; }
 @JsonProperty("offset")
 public void setOffset(long value) { this.offset = value; }
}

