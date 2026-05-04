public class Boleto extends Pagamento{
   private String vencimento;
    Boleto(double valor, String dataPagamento, String vencimento){
        super(valor, dataPagamento);
        setVencimento(vencimento);
    }

    public void setVencimento(String vencimento) {
        if (vencimento == null || vencimento.isEmpty()){
            throw new IllegalArgumentException("Data de vencimento inválido!");
        }else {
            this.vencimento = vencimento;
        }
    }

    public String getVencimento() {
        return vencimento;
    }

    @Override
    public String toString() {
        return "\n===Boleto===" + " Valor: " + getValor() + "\n Data de pagamento: " + getDataPagamento() + "\n Vencimento: " + getVencimento();
    }

    @Override
    public String processarPagamento(){
        return "Pagamento realizado com sucesso via boleto bancário, no valor de + " + getValor();
    }
}
