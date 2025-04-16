package com.example.aula5.desafio.modelos;

public class Podcast extends Audio {
    private String apresentacaoNome;
    private String descricao;

    public String getApresentacaoNome() {
        return apresentacaoNome;
    }

    public void setApresentacaoNome(String apresentacaoNome) {
        this.apresentacaoNome = apresentacaoNome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500)
            return 10;
        else
            return 8;
    }
}
