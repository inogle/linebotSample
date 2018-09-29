package com.sample.rainforcast.dto;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PrecipTypeEnum {
    RAIN;

    @JsonValue
    public String toValue() {
        switch (this) {
        case RAIN: return "rain";
        }
        return null;
    }

    @JsonCreator
    public static PrecipTypeEnum forValue(String value) throws IOException {
        if (value.equals("rain")) return RAIN;
        throw new IOException("Cannot deserialize PrecipTypeEnum");
    }
}