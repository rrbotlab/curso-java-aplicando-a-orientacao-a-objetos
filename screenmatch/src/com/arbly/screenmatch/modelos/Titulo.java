package com.arbly.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somalDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    // metodos
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
    }

    public void avalia(double nota){
        somalDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somalDasAvaliacoes / totalDeAvaliacoes;
    }


    // getters
    public String getNome() {
        return this.nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }



    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

}
