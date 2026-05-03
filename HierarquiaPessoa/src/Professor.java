public class Professor extends Pessoa{
    public String disciplina;
    Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public String apresentar(){
        return "Professor: " + getNome() + " Idade: " + getIdade() + " Discíplina: " + disciplina;
    }

}
