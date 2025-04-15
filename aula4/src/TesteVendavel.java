import com.arbly.aula4.vandavel.Produto;
import com.arbly.aula4.vandavel.Servico;

public class TesteVendavel {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Servico servico = new Servico();

        int quantProdutos = 50;
        int quantServicos = 6;

        System.out.println("Produto, desconto para " + quantProdutos + " unidades: " + produto.precoFinal(quantProdutos) + "%");
        System.out.println("Serviço, desconto para " + quantServicos + " contratos.: " + servico.precoFinal(quantServicos) + "%");

    }
}
