import com.arbly.aula4.calculavel.Livro;
import com.arbly.aula4.calculavel.ProdutoFisico;

public class TesteCalculavel {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico();
        Livro livro = new Livro();

        System.out.println("Produto físico +12% : " + produtoFisico.calcularPrecoFinal(175));
        System.out.println("Livro preço final...: " + livro.calcularPrecoFinal(85));

    }
}
