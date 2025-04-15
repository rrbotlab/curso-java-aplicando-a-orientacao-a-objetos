## Anotações

- **Herança**
  Essa é a grande vantagem da herança: reaproveitamento de código com flexibilidade para sobrescrever 
comportamentos.
  Em Java, é importante notar que a herança múltipla não é permitida
- As anotações, também conhecidas como annotations -> @override @deprecated
- **Poliformismo**
- O modificador protected é útil em situações em que uma classe precisa permitir que suas subclasses acessem 
diretamente seus atributos, sem a necessidade de restringir o acesso apenas pelos métodos getters e setters.

  O problema de ter códigos duplicados em várias classes, utilizando a herança como solução;
  A palavra-chave extends, utilizada para indicar que uma classe herda de outra;
  Como sobrescrever um método sendo herdado, com o uso opcional da anotação @Override;
  Como aplicar o conceito de polimorfismo no código, evitando métodos duplicados.


## Exercícios

    Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
    Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
    Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
    Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.


