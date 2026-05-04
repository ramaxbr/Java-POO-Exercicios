public class cartaoCredito extends Pagamento{
    private int parcelamento;
    cartaoCredito(double valor, String dataPagamento, int parcelamento){
        super(valor, dataPagamento);
        setParcelamento(parcelamento);
    }

    public void setParcelamento(int parcelamento) {
        if (parcelamento <= 0){
            throw new IllegalArgumentException("Parcelamento inválido!");
        }else {
            this.parcelamento = parcelamento;
        }
    }

    public int getParcelamento() {
        return parcelamento;
    }

    @Override
    public String processarPagamento(){
        return "\n===Cartão de crédito===" + " Valor: " + getValor() + "\n Data de pagamento: " + getDataPagamento() + "\n Parcelas: " + getParcelamento();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
