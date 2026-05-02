import java.util.Scanner;

public class Funcionario {
    Scanner sc = new Scanner(System.in);

    String nomeFuncionario;
    double salario;

    Funcionario(String nomeFuncionario, double salario){
        this.nomeFuncionario = nomeFuncionario;
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Funcionário: " + nomeFuncionario + " Salário: " + salario;
    }
}
