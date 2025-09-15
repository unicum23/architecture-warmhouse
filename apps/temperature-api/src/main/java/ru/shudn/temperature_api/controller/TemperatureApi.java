package ru.shudn.temperature_api.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.shudn.temperature_api.model.TemperatureDto;
import ru.shudn.temperature_api.service.TemperatureService;

import java.util.Objects;


@Slf4j
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class TemperatureApi {

    private final TemperatureService temperatureService;

    @GetMapping("/temperature")
    public TemperatureDto getTemperature(@RequestParam(required = false) String location) {
        return temperatureService.getTemperature(location, 0);
    }

    @GetMapping("/temperature/{sensorId}")
    public TemperatureDto getTemperature(@PathVariable Integer sensorId) {
        return temperatureService.getTemperature("", Objects.requireNonNullElse(sensorId, 0));
    }

}
