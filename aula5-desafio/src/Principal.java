import com.example.aula5.desafio.modelos.MinhasPreferidas;
import com.example.aula5.desafio.modelos.Musica;
import com.example.aula5.desafio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Until it sleeps");
        musica.setInterprete("Metallica");

        for (int i=0; i < 1000; i++ ){
            musica.reproduz();
        }

        for (int i=0; i < 50; i++)
            musica.curte();

        Podcast podcast = new Podcast();
        podcast.setTitulo("Não ouço podcast");
        podcast.setApresentacaoNome("John Doe");

        for (int i=0; i < 5000; i++ ){
            podcast.reproduz();
        }

        for (int i=0; i < 1000; i++)
            podcast.curte();

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(musica);
        minhasPreferidas.inclui(podcast);



    }
}
