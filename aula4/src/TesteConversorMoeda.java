import com.arbly.aula4.conversormoeda.ConversorMoeda;

public class TesteConversorMoeda {

    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        System.out.println("Valor em R$ " + conversorMoeda.converterDolarParaReal(100));

    }
}
