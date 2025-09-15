package ru.shudn.temperature_api.model;

import lombok.Getter;


@Getter
public enum TemperatureUnit {
    CELSIUS("°C", "Celsius"),
    FAHRENHEIT("°F", "Fahrenheit"),
    KELVIN("K", "Kelvin");

    private final String symbol;
    private final String displayName;

    TemperatureUnit(String symbol, String displayName) {
        this.symbol = symbol;
        this.displayName = displayName;
    }

}
