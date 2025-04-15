## Anotações

Em Java, interfaces são uma forma de definir um contrato que as classes devem seguir, sendo que ele define 
quais métodos devem ser implementados pelas classes que o implementarem. Interfaces permitem que diferentes 
classes possam ser tratadas de maneira padronizada, via polimorfismo, tornando assim o código fácil de estender 
com novos comportamentos.

    No Java uma classe pode herdar de somente uma única classe;
    Conceito de interfaces no Java;
    Que numa interface todos os métodos são públicos, não sendo então necessário utilizar a palavra reservada public na declaração deles;
    Que também é possível aplicar o polimorfismo com o uso de interfaces, similar ao que foi demonstrado com a utilização da herança em aulas anteriores.

## Exercícios

    Crie uma classe com.arbly.aula4.conversormoeda.ConversorMoeda que implementa uma interface com.arbly.aula4.conversormoeda.ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
    Crie uma classe com.arbly.aula4.calculadoraretangular.CalculadoraSalaRetangular que implementa uma interface com.arbly.aula4.calculadoraretangular.CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.
    Crie uma classe com.arbly.aula4.tabuada.TabuadaMultiplicacao que implementa uma interface com.arbly.aula4.tabuada.Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
    Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
    Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
    Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

