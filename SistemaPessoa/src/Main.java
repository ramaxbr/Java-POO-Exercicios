import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        GerenciadorPessoa p = new GerenciadorPessoa();
        GerenciadorFuncionario f = new GerenciadorFuncionario();

        System.out.println("====Cadastrar pessoa===");
        p.cadastrarPessoa();
        p.listarPessoa();

        System.out.println("====Cadastrar funcionário====");
        f.registrarFuncionario();
        f.registrarAumento();
        f.exibirFuncionario();



    }
}
