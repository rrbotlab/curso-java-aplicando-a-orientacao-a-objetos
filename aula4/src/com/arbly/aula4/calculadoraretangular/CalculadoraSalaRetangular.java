package com.arbly.aula4.calculadoraretangular;

// Crie uma classe com.arbly.aula4.calculadoraretangular.CalculadoraSalaRetangular que implementa uma interface
// com.arbly.aula4.calculadoraretangular.CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para
// calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.
// Considerando comprimento onde diz altura.


public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public double calcularArea(double largura, double comprimento) {
        return largura * comprimento;
    }

    @Override
    public double calcularPerimetro(double largura, double comprimento) {
        return (largura * 2) + (comprimento * 2);
    }
}
