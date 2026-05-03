import java.util.Scanner;

public class Main {
    static void main() {
        SistemaVeiculo sv = new SistemaVeiculo();
        Scanner sc = new Scanner(System.in);

        System.out.println("====Registro de veículo====");
        sv.CadastrarVeiculo();
        sv.listarVeiculos();

    }
}
