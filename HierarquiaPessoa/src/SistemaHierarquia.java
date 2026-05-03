import java.util.ArrayList;
import java.util.Scanner;

public class SistemaHierarquia {
    Scanner sc = new Scanner(System.in);
    ArrayList <Pessoa> listarPessoa = new ArrayList<>();

    public void CadastrarAluno(){
       while (true){
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a matricula do aluno: ");
        int matricula = sc.nextInt();
        sc.nextLine();

        try{
            listarPessoa.add(new Aluno(nome, idade, matricula));
        }catch (IllegalArgumentException error){
            System.out.println(error.getMessage());
            continue;
        }
        break;
       }
    }

    public void CadastrarProfessor(){
        while (true){
            System.out.println("Digite o nome do Professor: ");
            String nome = sc.nextLine();

            System.out.println("Digite a idade do Professor: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite a disciplina do Professor: ");
            String disciplina = sc.nextLine();

            try{
                listarPessoa.add(new Professor(nome, idade, disciplina));
            }catch (IllegalArgumentException error){
                System.out.println(error.getMessage());
                continue;
            }
            break;
        }
    }

    public void listarPessoas(){
        for (Pessoa listar : listarPessoa){
            System.out.println(listar.apresentar());
        }
    }



}
