import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorPessoa {

    ArrayList<Pessoa> listaPessoa = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void cadastrarPessoa(){
        System.out.println("Digite o nome da pessoa que deseja cadastrar:");
        String nome = sc.nextLine();

        System.out.println("Digite a idade dessa pessoa:");
        int idade = sc.nextInt();
        sc.nextLine();

        try {
            listaPessoa.add(new Pessoa(nome, idade));
        }catch (IllegalArgumentException error){
            System.out.println(error.getMessage());
        }
    }

    public void listarPessoa(){
        for (Pessoa listar : listaPessoa){
            System.out.println("Pessoa cadastrada: ");
            System.out.println(listar.toString());
        }
    }



}
