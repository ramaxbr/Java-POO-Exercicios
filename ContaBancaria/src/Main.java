import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        boolean rodar = true;
        int opcao = 0;

        System.out.printf("Bem vindo %s ao sistema!", conta.titular);
do {
    System.out.println("\n ====Conta bancária====");
    System.out.println("Selecione uma opção:");
    System.out.println("1- Exibir saldo.");
    System.out.println("2- Realizar depósito.");
    System.out.println("3- Realizar saque.");
    System.out.println("0- Sair.");
    opcao = sc.nextInt();
    sc.nextLine();

    switch (opcao){
        case 1:
            conta.exibirSaldo();
            break;
        case 2:
            conta.depositar();
            break;
        case 3:
            conta.sacar();
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
