package com.example.aula5.desafio.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){

        if(audio.getClassificacao() >= 9)
            System.out.println(audio.getTitulo() + " é classificado como excelente!");
        else
            System.out.println(audio.getTitulo() + " é bem avaliado!");

    }
}
