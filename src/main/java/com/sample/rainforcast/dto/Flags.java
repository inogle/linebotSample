package com.sample.rainforcast.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Flags {
    private String[] sources;
    private double nearestStation;
    private String units;

    @JsonProperty("sources")
    public String[] getSources() { return sources; }
    @JsonProperty("sources")
    public void setSources(String[] value) { this.sources = value; }

    @JsonProperty("nearest-station")
    public double getNearestStation() { return nearestStation; }
    @JsonProperty("nearest-station")
    public void setNearestStation(double value) { this.nearestStation = value; }

    @JsonProperty("units")
    public String getUnits() { return units; }
    @JsonProperty("units")
    public void setUnits(String value) { this.units = value; }
}