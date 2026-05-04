public class Pagamento {
    private double valor;
    private String dataPagamento;

    Pagamento(double valor, String dataPagamento){
        setValor(valor);
        setDataPagamento(dataPagamento);
    }

    //Setters
    public void setValor(double valor){
        if (valor <= 0){
          throw new IllegalArgumentException("Valor inválido!");
        }else {
            this.valor = valor;
        }
    }

    public void setDataPagamento(String dataPagamento){
        if (dataPagamento == null || dataPagamento.isEmpty()){
            throw new IllegalArgumentException("Data inválida!");
        }else{
            this.dataPagamento = dataPagamento;
        }
    }

    //Getters

    public double getValor(){
        return valor;
    }

    public String getDataPagamento(){
        return dataPagamento;
    }

    public String toString(){
        return "";
    }

    public String processarPagamento(){
        return "";
    }
}
