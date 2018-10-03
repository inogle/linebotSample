package com.sample.darkskyapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Daily {
    private String summary;
    private PrecipTypeEnum icon;
    private DailyDatum[] data;

    @JsonProperty("summary")
    public String getSummary() { return summary; }
    @JsonProperty("summary")
    public void setSummary(String value) { this.summary = value; }

    @JsonProperty("icon")
    public PrecipTypeEnum getIcon() { return icon; }
    @JsonProperty("icon")
    public void setIcon(PrecipTypeEnum value) { this.icon = value; }

    @JsonProperty("data")
    public DailyDatum[] getData() { return data; }
    @JsonProperty("data")
    public void setData(DailyDatum[] value) { this.data = value; }
}

