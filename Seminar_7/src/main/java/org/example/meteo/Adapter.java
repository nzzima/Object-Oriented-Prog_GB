package org.example.meteo;

import java.time.LocalDateTime;

public class Adapter implements MeteoSensor{

    private SensorTemperature sensorTemperature;

    public Adapter(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) sensorTemperature.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime result = LocalDateTime.of(sensorTemperature.year(), 1, 1, 0, 0);
        result.plusDays(sensorTemperature.day() - 1);
        result.plusSeconds(sensorTemperature.second());
        return result;
    }
}
