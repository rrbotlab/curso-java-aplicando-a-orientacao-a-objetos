package com.arbly.screenmatch.calculos;

import com.arbly.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo n){
        tempoTotal += n.getDuracaoEmMinutos();
    }

}
