package ru.shudn.temperature_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import ru.shudn.temperature_api.model.Status;
import ru.shudn.temperature_api.model.TemperatureDto;
import ru.shudn.temperature_api.model.TemperatureUnit;

import java.util.Random;


@Service
@RequiredArgsConstructor
public class TemperatureService {

    private Random random = new Random();

    public TemperatureDto getTemperature(String location, int sensorId) {
        float value = random.nextInt(41) + 10;

        if (!StringUtils.hasText(location)) {
            switch (sensorId) {
                case 1:
                    location = "Living Room";
                    break;
                case 2:
                    location = "Bedroom";
                    break;
                case 3:
                    location = "Kitchen";
                    break;
                default:
                    location = "Unknown";
            }
        }

        if (sensorId == 0) {
            switch (location) {
                case "Living Room":
                    sensorId = 1;
                    break;
                case "Bedroom":
                    sensorId = 2;
                    break;
                case "Kitchen":
                    sensorId = 3;
                    break;
            }
        }

        return TemperatureDto.builder()
                .location(location)
                .sensorId(sensorId)
                .status(Status.ACTIVE)
                .value(value)
                .unit(TemperatureUnit.CELSIUS)
                .build();
    }

}
