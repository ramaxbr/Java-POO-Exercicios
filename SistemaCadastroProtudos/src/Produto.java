public abstract class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria){
        setNome(nome);
        setPreco(preco);
        setCategoria(categoria);
    }

    public abstract double calcularDesconto();
    public abstract String exibirProduto();

    //Setters
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vázio!");
        }
        this.nome = nome;
    }

    public void setPreco(double preco){
        if(preco <= 0){
            throw new IllegalArgumentException("O preço não pode ser 0!");
        }
            this.preco = preco;
    }

    public void setCategoria(String categoria){
        if (categoria == null || categoria.isEmpty()){
           throw new IllegalArgumentException("A categoria não pode ser vázia!");
        }
        this.categoria = categoria;
    }

    //Getters
    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }

    public String getCategoria(){
        return categoria;
    }
}
