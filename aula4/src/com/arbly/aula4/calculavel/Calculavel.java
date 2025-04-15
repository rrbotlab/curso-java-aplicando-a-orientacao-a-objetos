package com.arbly.aula4.calculavel;

// Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes
// Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.

public interface Calculavel {
    double calcularPrecoFinal(double preco);
}
