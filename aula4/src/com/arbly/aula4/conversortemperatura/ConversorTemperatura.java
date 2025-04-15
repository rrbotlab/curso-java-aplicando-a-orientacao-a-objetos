package com.arbly.aula4.conversortemperatura;

// Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
// Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e
// exibe os resultados.

public interface ConversorTemperatura {
    double celsiusParaFahrenheit(double C);
    double fahrenheitParaCelsius(double F);
}
