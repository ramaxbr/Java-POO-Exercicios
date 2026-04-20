import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCadastro {
    Scanner sc = new Scanner(System.in);
    ArrayList<Pessoa> listarPessoa = new ArrayList<>();

    public void cadastrarAluno(){
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a matrícula: ");
        int matricula = sc.nextInt();
        sc.nextLine();

        listarPessoa.add(new Aluno(nome, idade, matricula));
    }

    public void cadastrarProfessor(){
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a disciplina: ");
        String disciplina = sc.nextLine();

        listarPessoa.add(new Professor(nome, idade, disciplina));
    }

    public void cadastrarDiretor(){
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o tempo de experiência: ");
        int tempoDeGestao = sc.nextInt();
        sc.nextLine();

        listarPessoa.add(new Diretor(nome, idade, tempoDeGestao));
    }

    public void listarCadastros(){
        for(Pessoa listar : listarPessoa){
            System.out.println(listar.apresentar());
        }

    }


}
