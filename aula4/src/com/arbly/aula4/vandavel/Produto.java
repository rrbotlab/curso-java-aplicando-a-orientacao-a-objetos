package com.arbly.aula4.vandavel;

public class Produto implements Vendavel {

    @Override
    public double precoFinal(int quantidade) {
        if (quantidade < 10)
            return 0;
        else if (quantidade < 100) {
            return 12;
        }
        else
            return 18;
    }
}
