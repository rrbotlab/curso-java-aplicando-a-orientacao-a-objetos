import com.arbly.aula4.calculadoraretangular.CalculadoraSalaRetangular;

public class TesteCalculadoraRetangular {
    public static void main(String[] args) {
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();

        System.out.println("Area.....: " + sala.calcularArea(7,18));
        System.out.println("Perímetro: " + sala.calcularPerimetro(7, 18));

    }
}
