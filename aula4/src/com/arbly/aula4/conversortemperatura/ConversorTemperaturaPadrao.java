package com.arbly.aula4.conversortemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double C) {
        return (C * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double F) {
        return (F - 32) * 1/1.8;
    }
}
