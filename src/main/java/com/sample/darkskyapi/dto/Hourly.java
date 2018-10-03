package com.sample.darkskyapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hourly {
    private String summary;
    private Icon icon;
    private Currently[] data;

    @JsonProperty("summary")
    public String getSummary() { return summary; }
    @JsonProperty("summary")
    public void setSummary(String value) { this.summary = value; }

    @JsonProperty("icon")
    public Icon getIcon() { return icon; }
    @JsonProperty("icon")
    public void setIcon(Icon value) { this.icon = value; }

    @JsonProperty("data")
    public Currently[] getData() { return data; }
    @JsonProperty("data")
    public void setData(Currently[] value) { this.data = value; }
}
