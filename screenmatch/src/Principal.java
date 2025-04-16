import com.arbly.screenmatch.calculos.CalculadoraDeTempo;
import com.arbly.screenmatch.calculos.FiltroRecomendacao;
import com.arbly.screenmatch.modelos.Episodio;
import com.arbly.screenmatch.modelos.Filme;
import com.arbly.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Taxi Driver");
        meuFilme.setAnoDeLancamento(1973);
        meuFilme.setDuracaoEmMinutos(118);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.avalia(8.2);
        meuFilme.avalia(7.1);
        meuFilme.avalia(6.8);

        meuFilme.exibeFichaTecnica();

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Taxi Driver");
        meuFilme2.setAnoDeLancamento(1973);
        meuFilme2.setDuracaoEmMinutos(118);
        meuFilme2.setIncluidoNoPlano(true);

        meuFilme2.avalia(6.2);
        meuFilme2.avalia(5.1);
        meuFilme2.avalia(4.8);

        Serie serie = new Serie();
        serie.setNome("Além da Imaginação");
        serie.setAnoDeLancamento(2008);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(false);
        serie.setTemporadas(7);
        serie.setEpisodiosPorTemporada(8);
        serie.setMinutosPorEpisodio(35);

        System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(serie);
        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme2);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(50);

        filtro.filtra(episodio);

    }
}
