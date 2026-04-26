public class Alimento extends Produto{
    public Alimento(String nome, double preco, String categoria){
        super(nome, preco, categoria);
    }

    double desconto = 2;
    @Override
    public double calcularDesconto(){
        double calcularDesconto = getPreco() * desconto / 100;
        double total = getPreco() - calcularDesconto;
        return total;
    }

    @Override
    public String exibirProduto(){
        return "Alimento: " + getNome() + "\n" + "Categoria: " + getCategoria() + "\n" + "Preço original: R$ " + getPreco() + "\n" + "Desconto de: " + desconto + "%" + "\n" + "Preço com desconto: R$ " + calcularDesconto();
    }
}
