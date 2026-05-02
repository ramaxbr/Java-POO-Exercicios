import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorFuncionario {
    Scanner sc = new Scanner(System.in);
    ArrayList <Funcionario> listaFuncionario = new ArrayList<>();
    Funcionario f;

    public void registrarFuncionario(){
        System.out.println("Qual será o nome do funcinário:");
        String nome = sc.nextLine();

        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome inválido!");
        }

        System.out.println("Quanto será o salário deste funcionário?");
        double renda = sc.nextDouble();
        sc.nextLine();
        if (renda <= 0){
            throw new IllegalArgumentException("Valor inválido!");
        }

        try{
            listaFuncionario.add(new Funcionario(nome, renda));
        }catch (IllegalArgumentException error){
            System.out.println(error.getMessage());
        }

    }

    public void registrarAumento(){
        System.out.println("Digite o percentual do aumento.");
        double percentual = sc.nextDouble();
        sc.nextLine();

        if(percentual <= 0){
            throw new IllegalArgumentException("O valor não pode ser zerado!");
        }else {
            for (Funcionario f : listaFuncionario) {
                double calculo = f.salario * percentual / 100;
                f.salario += calculo;
            }
        }
    }

    public void exibirFuncionario(){
        for (Funcionario listarFuncionario : listaFuncionario){
            System.out.println(listarFuncionario);
        }


    }

}
