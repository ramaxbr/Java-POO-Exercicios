public class Livro extends Produto{
    Livro(String nome, double preco, String categoria){
        super(nome, preco, categoria);
    }
    double desconto = 10;

    @Override
    public double calcularDesconto() {
        double calcularDesconto = getPreco() * desconto / 100;
        double total = getPreco() - calcularDesconto;
        return total;
    }

   @Override
    public String exibirProduto(){
        return "Livro: " + getNome() + "\n" + "Categoria: " + getCategoria() + "\n" + "Preço original: R$ " + getPreco() + "\n" + "Desconto de: " + desconto + "%" + "\n" + "Preço com desconto: R$ " + calcularDesconto();
    }
}
