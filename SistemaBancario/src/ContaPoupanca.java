public class ContaPoupanca extends Conta{

    public double depositar(double deposito){
        setSaldo(getSaldo() + deposito);
        return getSaldo();
    }

    @Override
    public double sacar(double quantidade) {
        if(getSaldo() >= quantidade) {
            double novoSaldo = (getSaldo() - quantidade);
            setSaldo(novoSaldo);
        }else{
            System.out.println("Saldo insuficiente.");
        }
        return 0;
    }
    @Override
    public double calcularRendimento() {
        double rendimento = 0.5;
        double novoSaldo = getSaldo() * rendimento;
        return novoSaldo;
    }

}
