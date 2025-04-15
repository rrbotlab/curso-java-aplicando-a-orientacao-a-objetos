// Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
// Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e
// exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias
// específicas, utilizando-a na classe principal para definir preços e mostrar informações.


public class Carro {

    private String modelo;
    private double precoAno2017;
    private double precoAno2018;
    private double precoAno2019;

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPrecos(double precoAno2017, double precoAno2018, double precoAno2019){
        this.precoAno2017 = precoAno2017;
        this.precoAno2018 = precoAno2018;
        this.precoAno2019 = precoAno2019;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo........: " + modelo);
        System.out.println("Preço Ano 2017: " + precoAno2017);
        System.out.println("Preço Ano 2018: " + precoAno2018);
        System.out.println("Preço Ano 2019: " + precoAno2019);
        System.out.println("Menor Preço...: " + calcularMenorPreco());
        System.out.println("Maior Preço...: " + calcularMaiorPreco());
    }

    private double calcularMenorPreco(){

        if (precoAno2017 < precoAno2018 && precoAno2017 < precoAno2019)
            return precoAno2017;

        if (precoAno2018 < precoAno2017 && precoAno2018 < precoAno2019)
            return precoAno2018;

        else
            return precoAno2019;


    }

    private double calcularMaiorPreco(){

        if (precoAno2017 > precoAno2018 && precoAno2017 > precoAno2019)
            return precoAno2017;

        if (precoAno2018 > precoAno2017 && precoAno2018 > precoAno2019)
            return precoAno2018;

        else
            return precoAno2019;
    }


}
