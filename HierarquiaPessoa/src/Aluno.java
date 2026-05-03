public class Aluno extends Pessoa {
    public int matricula;

    Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public String apresentar(){
        return "Aluno: " + getNome() + " Idade: " + getIdade() + " Matrícula: " + matricula;
    }


}
