public class Eletronico extends Produto{
    public Eletronico(String nome, double preco, String categoria){
        super(nome, preco, categoria);
    }

    double desconto = 5;
    @Override
    public double calcularDesconto(){

        double calcularDesconto = getPreco() * desconto / 100;
        double total = getPreco() - calcularDesconto;
        return total;
    }

    @Override
    public String exibirProduto(){
        return "ELetronico: " + getNome() + "\n" + "Categoria: " + getCategoria() + "\n" + "Preço original: R$ " + getPreco() + "\n" + "Desconto de: " + desconto + "%" + "\n"  + "Preço com desconto: R$ " + calcularDesconto();
    }

}
