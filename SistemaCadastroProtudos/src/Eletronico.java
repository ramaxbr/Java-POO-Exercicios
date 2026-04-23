public class Eletronico extends Produto{
    public Eletronico(String nome, double preco, String categoria){
        super(nome, preco, categoria);
    }

    @Override
    public double calcularDesconto(){
        double desconto = 5;
        double calcularDesconto = getPreco() * desconto / 100;
        double total = getPreco() - calcularDesconto;
        return total;
    }

}
