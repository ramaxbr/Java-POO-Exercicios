import java.util.Scanner;

public class Conta {
    Scanner sc = new Scanner(System.in);
    String titular = "Rafhael";
    double saldo = 0;

    public void depositar(){
        while (true) {
            System.out.println("Quanto você quer depositar?");
            double valorDeposito = sc.nextDouble();
            sc.nextLine();

            if (valorDeposito <= 0) {
                System.out.printf("Seu deposito não pode ser esse valor! \n" );
                continue;
            }else {
                saldo = valorDeposito + saldo;
                System.out.printf("Deposito realizado! Saldo atual: R$ %s", saldo);
                break;
            }
        }
    }

    public void sacar(){
        while (true) {
            System.out.println("Quanto você quer sacar?");
            double valorSaque = sc.nextDouble();
            sc.nextLine();

            if (valorSaque > saldo) {
                System.out.printf("Saldo insuficiente! Seu saldo é: R$ %s", saldo);
                System.out.println();
                continue;
            }else if (valorSaque == 0) {
                    System.out.printf("O valor do saque não pode ser zerado! \n");
                    continue;
            }else {
                saldo = saldo - valorSaque;
                System.out.printf("Saque realizado! Saldo atual: R$ %s", saldo);
                break;
            }
         }
        }

    public void exibirSaldo(){
        System.out.println("Seu saldo atual é: R$ " + saldo + ".");
    }


}
