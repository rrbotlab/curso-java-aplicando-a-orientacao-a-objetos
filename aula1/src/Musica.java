
// Crie uma classe Musica com atributos titulo, artista, anoLancamento, totalAvaliacao e numAvaliacoes, e métodos para
//        exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double totalAvaliacao;
    private int numAvaliacoes;

    public void exibeFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Número de avaliações: " + numAvaliacoes);
    }

    public void avaliar(double nota){
        totalAvaliacao += nota;
        numAvaliacoes++;
    }

    public double mediaAvaliacoes(){
        return totalAvaliacao / numAvaliacoes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

}
