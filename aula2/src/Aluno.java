// Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para
// acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.

public class Aluno {
    private String nome;
    private double totalizaNotas;
    private int numeroDeNotas;

    public double calcularMedia(){
        return totalizaNotas / numeroDeNotas;
    }

    public void incluirNota(double nota){
        totalizaNotas += nota;
        numeroDeNotas++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
