import com.arbly.aula4.conversortemperatura.ConversorTemperaturaPadrao;

public class TesteTemperatura {

    public static void main(String[] args) {
        ConversorTemperaturaPadrao t = new ConversorTemperaturaPadrao();

        System.out.println("25C em F: " + t.celsiusParaFahrenheit(25));
        System.out.println("87F em C: " + t.fahrenheitParaCelsius(87));

    }

}
