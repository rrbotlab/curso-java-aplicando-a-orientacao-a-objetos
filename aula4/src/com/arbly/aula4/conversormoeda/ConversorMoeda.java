package com.arbly.aula4.conversormoeda;

// Crie uma classe com.arbly.aula4.conversormoeda.ConversorMoeda que implementa uma interface
// com.arbly.aula4.conversormoeda.ConversaoFinanceira com o método converterDolarParaReal() para converter
// um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public double converterDolarParaReal(double valor) {
        return valor * 5.85;
    }
}
