public class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    //Setters
    public void setNome(String nome){
            if (nome == null || nome.isEmpty()) {
                throw new IllegalArgumentException("O nome não pode ser vázio");
            } else {
                this.nome = nome;
        }
    }

    public void setIdade(int idade){
            if(idade <= 0) {
                throw new IllegalArgumentException("O valor não pode ser igual a 0.");
            }else {
                this.idade = idade;
            }
    }

    //Getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " Idade: "+ getIdade();
    }
}

