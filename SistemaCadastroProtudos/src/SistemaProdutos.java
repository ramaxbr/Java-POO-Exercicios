import java.util.ArrayList;
import java.util.Scanner;

public class SistemaProdutos {
    ArrayList<Produto> listaProdutos = new ArrayList();
    Scanner sc = new Scanner(System.in);

    public void CadastrarProduto(){

        System.out.println("====Qual produto deseja cadastrar?");
        System.out.println("1- Livro.");
        System.out.println("2- Eletrônico.");
        System.out.println("3- Alimento.");
        int opcaoProduto = sc.nextInt();
        sc.nextLine();

        switch (opcaoProduto){
            case 1:
                CadastrarLivro();
                break;
            case 2:
                CadastrarEletronico();
                break;
            case 3:
                CadastrarAlimento();
                break;
            default:
                System.out.println("Opção inválida. (Menu Produto)");

        }
    }

    public void CadastrarLivro(){
        System.out.println("Digite o nome do Livro:");
        String nomeLivro = sc.nextLine();

        System.out.println("Digite o preço do livro:");
        double precoLivro = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a categoria do Livro:");
        String categoriaLivro = sc.nextLine();

        try {
            listaProdutos.add(new Livro(nomeLivro, precoLivro, categoriaLivro));
        }catch (IllegalArgumentException error){
            System.out.println(error.getMessage());
        }


    }

    public void CadastrarEletronico(){
        System.out.println("Digite o nome do eletrônico:");
        String nomeEletronico = sc.nextLine();

        System.out.println("Digite o preço do eletrônico:");
        double precoEletronico = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a categoria do eletrônico:");
        String categoriaEletronico = sc.nextLine();

        try{
            listaProdutos.add(new Eletronico(nomeEletronico, precoEletronico, categoriaEletronico));
        } catch (IllegalArgumentException error){
            System.out.println(error.getMessage());
        }


    }

    public void CadastrarAlimento(){
        System.out.println("Digite o nome do alimento:");
        String nomeAlimento = sc.nextLine();

        System.out.println("Digite o preço do alimento:");
        double precoAlimento = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a categoria do alimento:");
        String categoriaAlimento = sc.nextLine();

        try {
            listaProdutos.add(new Alimento(nomeAlimento, precoAlimento, categoriaAlimento));
        }catch (IllegalArgumentException error){
            System.out.println(error.getMessage());
        }


    }

    public void ListarProdutos(){
        for (Produto listar : listaProdutos){
            System.out.println(listar.exibirProduto());
        }

    }
}
