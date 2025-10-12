package ru.shudn.temperature_api.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class TemperatureDto {

    private String location;
    private int sensorId;
    private float value;
    private TemperatureUnit unit;
    private Status status;

}
