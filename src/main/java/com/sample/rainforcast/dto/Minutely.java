package com.sample.rainforcast.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Minutely {
    private String summary;
    private Icon icon;
    private MinutelyDatum[] data;

    @JsonProperty("summary")
    public String getSummary() { return summary; }
    @JsonProperty("summary")
    public void setSummary(String value) { this.summary = value; }

    @JsonProperty("icon")
    public Icon getIcon() { return icon; }
    @JsonProperty("icon")
    public void setIcon(Icon value) { this.icon = value; }

    @JsonProperty("data")
    public MinutelyDatum[] getData() { return data; }
    @JsonProperty("data")
    public void setData(MinutelyDatum[] value) { this.data = value; }
}