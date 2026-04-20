import java.util.Scanner;
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        SistemaCadastro sistemaCadastro = new SistemaCadastro();

        boolean rodar = true;


        do {
            System.out.println("====Gerenciamento escolar====");
            System.out.println("Indique abaixo o que deseja cadastrar:");
            System.out.println("1 - Aluno.");
            System.out.println("2 - Professor.");
            System.out.println("3 - Diretor.");
            System.out.println("4 - Listar pessoas cadastradas.");
            System.out.println("0 - Finalizar");
            int opcaoEscolhida = sc.nextInt();
            sc.nextLine();

            switch (opcaoEscolhida){
                case 1:
                    sistemaCadastro.cadastrarAluno();
                    break;
                case 2:
                    sistemaCadastro.cadastrarProfessor();
                    break;
                case 3:
                    sistemaCadastro.cadastrarDiretor();
                    break;
                case 4:
                    sistemaCadastro.listarCadastros();
                    break;
                case 0:
                    rodar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }while (rodar);
    }
}
