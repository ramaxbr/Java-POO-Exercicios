public class ContaCorrente extends Conta {
    public double saque;
    double saldo = getSaldo();

    public double depositar(double deposito){
        setSaldo(deposito);
        return 0;
    }

    public double setSaldo(double quantidade){
        saldo = quantidade;
        return 0;
    }
    @Override
    public double sacar(double quantidade) {
        int taxa = 2;
        if(getSaldo() <= quantidade) {
           saque = taxa - (getSaldo() - quantidade);
        }
        return setSaldo(saque);
    }

    @Override
    public double calcularRendimento() {
        return 0;
    }
//    public double consultarSaldo(){
//        return getSaldo();
//}

double fazerDeposito(double valor){
        super.depositar(valor);
        return 0;
}

}
