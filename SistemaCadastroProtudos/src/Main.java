import java.util.Scanner;
public class Main {
    static void main() {
    Scanner sc = new Scanner(System.in);
    SistemaProdutos sistemaProdutos = new SistemaProdutos();

    boolean rodar = true;

    do{
        System.out.println("====Gerenciamento de produtos====");
        System.out.println("=Escolha uma opção=");
        System.out.println("1- Cadastrar Produto.");
        System.out.println("2- Listar produtos.");
        System.out.println("0- Encerrar programa.");
        int opcaoMenu = sc.nextInt();
        sc.nextLine();

        switch (opcaoMenu){
            case 1:
                sistemaProdutos.CadastrarProduto();
                break;
            case 2:
                sistemaProdutos.ListarProdutos();
                break;
            case 0:
                System.out.println("Programa encerrado.");
                rodar = false;
                break;
            default:
                System.out.println("Opção inválida!");
        }


    }while(rodar);

    }
}
