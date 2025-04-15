package com.arbly.aula4.calculavel;

public class ProdutoFisico implements Calculavel{

    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 1.12;
    }
}
