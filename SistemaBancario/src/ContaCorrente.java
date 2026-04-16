public class ContaCorrente extends Conta {
    double taxa = 2;
    public double depositar(double deposito){
        setSaldo(getSaldo() + deposito);
        return getSaldo();
    }

    public double sacar(double quantidade) {
        if(getSaldo() >= quantidade) {
           double novoSaldo = (getSaldo() - quantidade) - taxa;
           setSaldo(novoSaldo);
        }else{
            System.out.println("Saldo insuficiente.");
        }
        return  getSaldo();
    }

    @Override
    public double calcularRendimento() {
        return 0;
    }

    //    public double consultarSaldo(){
//        return getSaldo();
//}

//double fazerDeposito(double valor){
//        super.depositar(valor);
//        return 0;
//}

}
