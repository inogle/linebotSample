package com.sample.darkskyapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Currently {
    private long time;
    private String summary;
    private Icon icon;
    private Long nearestStormDistance;
    private Long nearestStormBearing;
    private double precipIntensity;
    private double precipProbability;
    private double temperature;
    private double apparentTemperature;
    private double dewPoint;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private double windGust;
    private long windBearing;
    private double cloudCover;
    private long uvIndex;
    private double visibility;
    private double ozone;
    private Icon precipType;

    @JsonProperty("time")
    public long getTime() { return time; }
    @JsonProperty("time")
    public void setTime(long value) { this.time = value; }

    @JsonProperty("summary")
    public String getSummary() { return summary; }
    @JsonProperty("summary")
    public void setSummary(String value) { this.summary = value; }

    @JsonProperty("icon")
    public Icon getIcon() { return icon; }
    @JsonProperty("icon")
    public void setIcon(Icon value) { this.icon = value; }

    @JsonProperty("nearestStormDistance")
    public Long getNearestStormDistance() { return nearestStormDistance; }
    @JsonProperty("nearestStormDistance")
    public void setNearestStormDistance(Long value) { this.nearestStormDistance = value; }

    @JsonProperty("nearestStormBearing")
    public Long getNearestStormBearing() { return nearestStormBearing; }
    @JsonProperty("nearestStormBearing")
    public void setNearestStormBearing(Long value) { this.nearestStormBearing = value; }

    @JsonProperty("precipIntensity")
    public double getPrecipIntensity() { return precipIntensity; }
    @JsonProperty("precipIntensity")
    public void setPrecipIntensity(double value) { this.precipIntensity = value; }

    @JsonProperty("precipProbability")
    public double getPrecipProbability() { return precipProbability; }
    @JsonProperty("precipProbability")
    public void setPrecipProbability(double value) { this.precipProbability = value; }

    @JsonProperty("temperature")
    public double getTemperature() { return temperature; }
    @JsonProperty("temperature")
    public void setTemperature(double value) { this.temperature = value; }

    @JsonProperty("apparentTemperature")
    public double getApparentTemperature() { return apparentTemperature; }
    @JsonProperty("apparentTemperature")
    public void setApparentTemperature(double value) { this.apparentTemperature = value; }

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

    @JsonProperty("visibility")
    public double getVisibility() { return visibility; }
    @JsonProperty("visibility")
    public void setVisibility(double value) { this.visibility = value; }

    @JsonProperty("ozone")
    public double getOzone() { return ozone; }
    @JsonProperty("ozone")
    public void setOzone(double value) { this.ozone = value; }

    @JsonProperty("precipType")
    public Icon getPrecipType() { return precipType; }
    @JsonProperty("precipType")
    public void setPrecipType(Icon value) { this.precipType = value; }
}