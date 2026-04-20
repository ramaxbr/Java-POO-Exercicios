public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        setDisciplina(disciplina);
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    @Override
    public String apresentar(){
        return "Sou o professor " + getNome() + ", tenho " + getIdade() + " anos " + "e realizo a disciplina: " + getDisciplina() + ".";
    }


}
