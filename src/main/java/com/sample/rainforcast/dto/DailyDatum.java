package com.sample.rainforcast.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DailyDatum {
    private long time;
    private String summary;
    private String icon;
    private long sunriseTime;
    private long sunsetTime;
    private double moonPhase;
    private double precipIntensity;
    private double precipIntensityMax;
    private long precipIntensityMaxTime;
    private double precipProbability;
    private PrecipTypeEnum precipType;
    private double temperatureHigh;
    private long temperatureHighTime;
    private double temperatureLow;
    private long temperatureLowTime;
    private double apparentTemperatureHigh;
    private long apparentTemperatureHighTime;
    private double apparentTemperatureLow;
    private long apparentTemperatureLowTime;
    private double dewPoint;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private double windGust;
    private long windGustTime;
    private long windBearing;
    private double cloudCover;
    private long uvIndex;
    private long uvIndexTime;
    private double visibility;
    private double ozone;
    private double temperatureMin;
    private long temperatureMinTime;
    private double temperatureMax;
    private long temperatureMaxTime;
    private double apparentTemperatureMin;
    private long apparentTemperatureMinTime;
    private double apparentTemperatureMax;
    private long apparentTemperatureMaxTime;

    @JsonProperty("time")
    public long getTime() { return time; }
    @JsonProperty("time")
    public void setTime(long value) { this.time = value; }

    @JsonProperty("summary")
    public String getSummary() { return summary; }
    @JsonProperty("summary")
    public void setSummary(String value) { this.summary = value; }

    @JsonProperty("icon")
    public String getIcon() { return icon; }
    @JsonProperty("icon")
    public void setIcon(String value) { this.icon = value; }

    @JsonProperty("sunriseTime")
    public long getSunriseTime() { return sunriseTime; }
    @JsonProperty("sunriseTime")
    public void setSunriseTime(long value) { this.sunriseTime = value; }

    @JsonProperty("sunsetTime")
    public long getSunsetTime() { return sunsetTime; }
    @JsonProperty("sunsetTime")
    public void setSunsetTime(long value) { this.sunsetTime = value; }

    @JsonProperty("moonPhase")
    public double getMoonPhase() { return moonPhase; }
    @JsonProperty("moonPhase")
    public void setMoonPhase(double value) { this.moonPhase = value; }

    @JsonProperty("precipIntensity")
    public double getPrecipIntensity() { return precipIntensity; }
    @JsonProperty("precipIntensity")
    public void setPrecipIntensity(double value) { this.precipIntensity = value; }

    @JsonProperty("precipIntensityMax")
    public double getPrecipIntensityMax() { return precipIntensityMax; }
    @JsonProperty("precipIntensityMax")
    public void setPrecipIntensityMax(double value) { this.precipIntensityMax = value; }

    @JsonProperty("precipIntensityMaxTime")
    public long getPrecipIntensityMaxTime() { return precipIntensityMaxTime; }
    @JsonProperty("precipIntensityMaxTime")
    public void setPrecipIntensityMaxTime(long value) { this.precipIntensityMaxTime = value; }

    @JsonProperty("precipProbability")
    public double getPrecipProbability() { return precipProbability; }
    @JsonProperty("precipProbability")
    public void setPrecipProbability(double value) { this.precipProbability = value; }

    @JsonProperty("precipType")
    public PrecipTypeEnum getPrecipType() { return precipType; }
    @JsonProperty("precipType")
    public void setPrecipType(PrecipTypeEnum value) { this.precipType = value; }

    @JsonProperty("temperatureHigh")
    public double getTemperatureHigh() { return temperatureHigh; }
    @JsonProperty("temperatureHigh")
    public void setTemperatureHigh(double value) { this.temperatureHigh = value; }

    @JsonProperty("temperatureHighTime")
    public long getTemperatureHighTime() { return temperatureHighTime; }
    @JsonProperty("temperatureHighTime")
    public void setTemperatureHighTime(long value) { this.temperatureHighTime = value; }

    @JsonProperty("temperatureLow")
    public double getTemperatureLow() { return temperatureLow; }
    @JsonProperty("temperatureLow")
    public void setTemperatureLow(double value) { this.temperatureLow = value; }

    @JsonProperty("temperatureLowTime")
    public long getTemperatureLowTime() { return temperatureLowTime; }
    @JsonProperty("temperatureLowTime")
    public void setTemperatureLowTime(long value) { this.temperatureLowTime = value; }

    @JsonProperty("apparentTemperatureHigh")
    public double getApparentTemperatureHigh() { return apparentTemperatureHigh; }
    @JsonProperty("apparentTemperatureHigh")
    public void setApparentTemperatureHigh(double value) { this.apparentTemperatureHigh = value; }

    @JsonProperty("apparentTemperatureHighTime")
    public long getApparentTemperatureHighTime() { return apparentTemperatureHighTime; }
    @JsonProperty("apparentTemperatureHighTime")
    public void setApparentTemperatureHighTime(long value) { this.apparentTemperatureHighTime = value; }

    @JsonProperty("apparentTemperatureLow")
    public double getApparentTemperatureLow() { return apparentTemperatureLow; }
    @JsonProperty("apparentTemperatureLow")
    public void setApparentTemperatureLow(double value) { this.apparentTemperatureLow = value; }

    @JsonProperty("apparentTemperatureLowTime")
    public long getApparentTemperatureLowTime() { return apparentTemperatureLowTime; }
    @JsonProperty("apparentTemperatureLowTime")
    public void setApparentTemperatureLowTime(long value) { this.apparentTemperatureLowTime = value; }

    @JsonProperty("dewPoint")
    public double getDewPoint() { return dewPoint; }
    @JsonProperty("dewPoint")
    public void setDewPoint(double value) { this.dewPoint = value; }

    @JsonProperty("humidity")
    public double getHumidity() { return humidity; }
    @JsonProperty("humidity")
    public void setHumidity(double value) { this.humidity = value; }

    @JsonProperty("pressure")
    public double getPressure() { return pressure; }
    @JsonProperty("pressure")
    public void setPressure(double value) { this.pressure = value; }

    @JsonProperty("windSpeed")
    public double getWindSpeed() { return windSpeed; }
    @JsonProperty("windSpeed")
    public void setWindSpeed(double value) { this.windSpeed = value; }

    @JsonProperty("windGust")
    public double getWindGust() { return windGust; }
    @JsonProperty("windGust")
    public void setWindGust(double value) { this.windGust = value; }

    @JsonProperty("windGustTime")
    public long getWindGustTime() { return windGustTime; }
    @JsonProperty("windGustTime")
    public void setWindGustTime(long value) { this.windGustTime = value; }

    @JsonProperty("windBearing")
    public long getWindBearing() { return windBearing; }
    @JsonProperty("windBearing")
    public void setWindBearing(long value) { this.windBearing = value; }

    @JsonProperty("cloudCover")
    public double getCloudCover() { return cloudCover; }
    @JsonProperty("cloudCover")
    public void setCloudCover(double value) { this.cloudCover = value; }

    @JsonProperty("uvIndex")
    public long getUvIndex() { return uvIndex; }
    @JsonProperty("uvIndex")
    public void setUvIndex(long value) { this.uvIndex = value; }

    @JsonProperty("uvIndexTime")
    public long getUvIndexTime() { return uvIndexTime; }
    @JsonProperty("uvIndexTime")
    public void setUvIndexTime(long value) { this.uvIndexTime = value; }

    @JsonProperty("visibility")
    public double getVisibility() { return visibility; }
    @JsonProperty("visibility")
    public void setVisibility(double value) { this.visibility = value; }

    @JsonProperty("ozone")
    public double getOzone() { return ozone; }
    @JsonProperty("ozone")
    public void setOzone(double value) { this.ozone = value; }

    @JsonProperty("temperatureMin")
    public double getTemperatureMin() { return temperatureMin; }
    @JsonProperty("temperatureMin")
    public void setTemperatureMin(double value) { this.temperatureMin = value; }

    @JsonProperty("temperatureMinTime")
    public long getTemperatureMinTime() { return temperatureMinTime; }
    @JsonProperty("temperatureMinTime")
    public void setTemperatureMinTime(long value) { this.temperatureMinTime = value; }

    @JsonProperty("temperatureMax")
    public double getTemperatureMax() { return temperatureMax; }
    @JsonProperty("temperatureMax")
    public void setTemperatureMax(double value) { this.temperatureMax = value; }

    @JsonProperty("temperatureMaxTime")
    public long getTemperatureMaxTime() { return temperatureMaxTime; }
    @JsonProperty("temperatureMaxTime")
    public void setTemperatureMaxTime(long value) { this.temperatureMaxTime = value; }

    @JsonProperty("apparentTemperatureMin")
    public double getApparentTemperatureMin() { return apparentTemperatureMin; }
    @JsonProperty("apparentTemperatureMin")
    public void setApparentTemperatureMin(double value) { this.apparentTemperatureMin = value; }

    @JsonProperty("apparentTemperatureMinTime")
    public long getApparentTemperatureMinTime() { return apparentTemperatureMinTime; }
    @JsonProperty("apparentTemperatureMinTime")
    public void setApparentTemperatureMinTime(long value) { this.apparentTemperatureMinTime = value; }

    @JsonProperty("apparentTemperatureMax")
    public double getApparentTemperatureMax() { return apparentTemperatureMax; }
    @JsonProperty("apparentTemperatureMax")
    public void setApparentTemperatureMax(double value) { this.apparentTemperatureMax = value; }

    @JsonProperty("apparentTemperatureMaxTime")
    public long getApparentTemperatureMaxTime() { return apparentTemperatureMaxTime; }
    @JsonProperty("apparentTemperatureMaxTime")
    public void setApparentTemperatureMaxTime(long value) { this.apparentTemperatureMaxTime = value; }
}