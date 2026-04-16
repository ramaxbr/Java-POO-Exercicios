import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean rodar = true;

        System.out.println(contaPoupanca.getSaldo());

        while (rodar){

        System.out.println("====Sistema Bancário====");
        System.out.println("Digite alguma opção:");
        System.out.println("1- Consultar saldo");
        System.out.println("2- Realizar depósito.");
        System.out.println("3- Realizar saque em conta corrente.");
        System.out.println("4- Realizar saque em conta poupança.");
        System.out.println("0- Finalizar Programa.");
        numero = sc.nextInt();
        sc.nextLine();

        switch (numero){
            case 1:
                System.out.printf("Seu saldo na CONTA CORRENTE é de: R$ %.2f \n", contaCorrente.getSaldo());
                System.out.printf("Seu saldo na CONTA POUPANÇA é de: R$ %.2f \n", contaPoupanca.getSaldo());
                System.out.printf("O rendimento da sua conta poupança é de R$ %.2f \n", contaPoupanca.calcularRendimento());

            break;
            case 2:
                System.out.println("Digite o valor que deseja depositar na CONTA CORRENTE: ");
                double depositoContaCorrente = sc.nextDouble();
                contaCorrente.depositar(depositoContaCorrente);
                sc.nextLine();
                System.out.println("Digite o valor que deseja depositar na CONTA POUPANÇA: ");
                double depositoContaPoupanca = sc.nextDouble();
                contaPoupanca.depositar(depositoContaPoupanca);
                sc.nextLine();

                System.out.printf("Seu saldo na CONTA CORRENTE é de: R$ %.2f \n" , contaCorrente.getSaldo());
                System.out.printf("Seu saldo na CONTA POUPANCA é de: R$ %.2f \n", contaPoupanca.getSaldo());

                break;
            case 3:
                System.out.println("Digite quanto você quer sacar.");
                double saqueContaC = sc.nextDouble();
                contaCorrente.sacar(saqueContaC);
                sc.nextLine();
                System.out.printf("Seu saldo é: R$ %.2f. Taxa de saque: R$ %.2f \n", contaCorrente.getSaldo(), contaCorrente.taxa);
                break;
            case 4:
                System.out.println("Digite quanto você quer sacar.");
                double saqueContaP = sc.nextDouble();
                contaPoupanca.sacar(saqueContaP);
                sc.nextLine();
                System.out.printf("Seu saldo é: R$ %.2f \n", contaPoupanca.getSaldo());
                break;
            case 0:
                rodar = false;
                break;
            default:
                System.out.println("Valor inválido.");
        }
    }
    }
}
