package com.arbly.aula4.vandavel;

public class Servico implements Vendavel{
    @Override
    public double precoFinal(int quantidade) {
        if (quantidade < 5)
            return 0;
        else
            return 10;
    }
}
