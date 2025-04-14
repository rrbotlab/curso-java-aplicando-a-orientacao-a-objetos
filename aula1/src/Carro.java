// Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

import java.time.LocalDate;

public class Carro {
    private String modelo;
    private String cor;
    private int anoFabricacao;

    public void exibirFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
    }

    public int idade(){
        LocalDate localDate = LocalDate.now();
        return localDate.getYear() - anoFabricacao;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
