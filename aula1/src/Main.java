public class Main {

    public static void main(String[] args) {
        Pessoa person = new Pessoa();
        Calculadora calc = new Calculadora();
        Musica musica = new Musica();
        Carro carro = new Carro();
        Aluno aluno = new Aluno();

        System.out.println("\nClasse Pessoa");
        person.showMessage();

        System.out.println("\nClasse Calculadora");
        System.out.println(calc.dobro(43));

        System.out.println("\nClasse Musica");
        musica.setTitulo("Hotel California");
        musica.setArtista("Eagles");
        musica.setAnoLancamento(1976);
        musica.exibeFichaTecnica();
        musica.avaliar(8.7);
        musica.avaliar(8.5);
        musica.avaliar(9.1);
        musica.avaliar(8.9);
        musica.exibeFichaTecnica();
        System.out.println(musica.mediaAvaliacoes());

        System.out.println("\nClasse Carro");
        carro.setModelo("Civic");
        carro.setCor("Cinza");
        carro.setAnoFabricacao(2018);
        carro.exibirFichaTecnica();
        System.out.println(carro.idade());

        System.out.println("\nClass Aluno");
        aluno.setNome("Mário de Andrade");
        aluno.setIdade(8);
        aluno.informacoesAluno();
        System.out.println("Nome/idade: " + aluno.getNome() + "/" + aluno.getIdade());

    }
}
