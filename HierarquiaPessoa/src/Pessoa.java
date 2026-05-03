public class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    public void setNome(String nome){
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome inválido!");
        }else {
            this.nome = nome;
        }
    }

    public void setIdade(int idade){
        if (idade <= 0){
            throw new IllegalArgumentException("Idade inválida!");
        }else {
            this.idade = idade;
        }
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

public String apresentar(){
        return "";
}

}
