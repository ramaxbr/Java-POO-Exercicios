public class ContaPoupanca extends Conta{
    public double saque;


    @Override
    public double sacar(double quantidade) {
        if(getSaldo() <= quantidade) {
            saque = (getSaldo() - quantidade);
        }
        return setSaldo(saque);
    }

    @Override
    public double calcularRendimento() {
        double rendimento = 0.5;
        saque = getSaldo() * rendimento;
        return saque;
    }

    double fazerDeposito(double valor){
        super.depositar(valor);
        return 0;
    }

}
