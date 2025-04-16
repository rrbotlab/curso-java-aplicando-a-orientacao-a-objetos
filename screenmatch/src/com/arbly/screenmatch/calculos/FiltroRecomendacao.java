package com.arbly.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        System.out.println("filtra: " + classificavel);
        if (classificavel.getClassificacao() >= 4)
            System.out.println("Está entre os preferidos no momento");
        else if (classificavel.getClassificacao() >= 2)
            System.out.println("Muito bem avaliado no momento");
        else
            System.out.println("Coloque na lista para assistir depois");
    }
}
