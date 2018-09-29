package com.sample.rainforcast.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MinutelyDatum {
    private long time;
    private double precipIntensity;
    private double precipProbability;
    private Double precipIntensityError;
    private PrecipTypeEnum precipType;

    @JsonProperty("time")
    public long getTime() { return time; }
    @JsonProperty("time")
    public void setTime(long value) { this.time = value; }

    @JsonProperty("precipIntensity")
    public double getPrecipIntensity() { return precipIntensity; }
    @JsonProperty("precipIntensity")
    public void setPrecipIntensity(double value) { this.precipIntensity = value; }

    @JsonProperty("precipProbability")
    public double getPrecipProbability() { return precipProbability; }
    @JsonProperty("precipProbability")
    public void setPrecipProbability(double value) { this.precipProbability = value; }

    @JsonProperty("precipIntensityError")
    public Double getPrecipIntensityError() { return precipIntensityError; }
    @JsonProperty("precipIntensityError")
    public void setPrecipIntensityError(Double value) { this.precipIntensityError = value; }

    @JsonProperty("precipType")
    public PrecipTypeEnum getPrecipType() { return precipType; }
    @JsonProperty("precipType")
    public void setPrecipType(PrecipTypeEnum value) { this.precipType = value; }
}