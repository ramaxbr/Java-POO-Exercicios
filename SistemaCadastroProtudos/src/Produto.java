public abstract class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria){
        this.nome= nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public abstract double calcularDesconto();

    //Setters
    public void setNome(String nome) {
        if (toString() == null || toString().isEmpty()) {
            System.out.println("O nome não pode ser vazio!");
        } else {
            this.nome = nome;
        }
    }

    public void setPreco(double preco){
        if(preco <= 0){
            System.out.println("O preço não pode ser 0!");
        }else {
            this.preco = preco;
        }
    }

    public void setCategoria(String categoria){
        if (toString() == null || toString().isEmpty()){
            System.out.println("Categoria não pode ser vazia!");
        }else{
            this.categoria = categoria;
        }
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
