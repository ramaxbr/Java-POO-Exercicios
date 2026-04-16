public abstract class Conta {
    private double saldo;

    public abstract double sacar(double quantidade);

    public abstract double calcularRendimento();

    public double getSaldo(){
        return saldo;
    }







}
