public class Main {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        IdadePessoa idadePessoa = new IdadePessoa();
        Produto produto = new Produto();
        Aluno aluno = new Aluno();
        Livro livro = new Livro();

        System.out.println("\nClasse ContaBancaria");
        conta.titular = "Tio Patinhas";
        conta.setNumeroConta(1);
        conta.setSaldo(2548541);
        System.out.println(conta.titular);
        System.out.println(conta.getNumeroConta());
        System.out.println(conta.getSaldo());

        System.out.println("\nClasse IdadePessoa");
        idadePessoa.setIdade(6);
        idadePessoa.setNome("Cebolinha");
        System.out.println(idadePessoa.getNome());
        idadePessoa.verificarIdade();

        System.out.println("\nClasse Produto");
        produto.setNomeProduto("Oleo moto 30w5 motul");
        produto.setPrecoProduto(52.50);
        System.out.println(produto.getNomeProduto());
        System.out.println(produto.getPrecoProduto());
        System.out.println("Preçco com desconto: " + produto.aplicarDesconto(10));

        System.out.println("\nClasse Aluno");
        aluno.setNome("Chaves");
        aluno.incluirNota(5.1);
        aluno.incluirNota(4.8);
        aluno.incluirNota(6.0);
        aluno.incluirNota(4.2);
        System.out.println(aluno.getNome());
        System.out.println(aluno.calcularMedia());

        System.out.println("\nClasse Livro");
        livro.setTitulo("A Arte da Guerra");
        livro.setAutor("Sun Tzu");
        livro.exibirDetalhes();

    }
}
