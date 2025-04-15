// Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters
// para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual
//  e reduz o preço do produto.


public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public double aplicarDesconto(double desconto){
        return precoProduto - (precoProduto * (desconto/100));
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
}
