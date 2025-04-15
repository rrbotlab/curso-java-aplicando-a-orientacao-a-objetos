package com.arbly.aula4.tabuada;
// Crie uma classe com.arbly.aula4.tabuada.TabuadaMultiplicacao que implementa uma interface
// com.arbly.aula4.tabuada.Tabuada com o método mostrarTabuada() para exibir a tabuada de um número.
// A classe deve receber o número como parâmetro.


public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int n) {
        System.out.println("\nTabuada do " + n);
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " x " + n + " = " + i*n);
        }
    }
}
