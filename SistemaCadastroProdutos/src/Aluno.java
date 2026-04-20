public class Aluno extends Pessoa{
    private int matricula;

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
       if (matricula >= 0){
           this.matricula = matricula;
       }else {
           System.out.println("Matrícula incorreta.");
       }
    }

    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        setMatricula(matricula);
    }

    @Override
    public String apresentar(){
        return "Sou o aluno " + getNome() + ", tenho " + getIdade() + " anos, " + "e minha matrícula é: "+ getMatricula() + ".";
    }




}
