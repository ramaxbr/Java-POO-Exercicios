import java.lang.foreign.ValueLayout;

public class Pix extends Pagamento {
    private String metodoPagamento;
    Pix(double valor, String dataPagamento, String metodoPagamento){
        super(valor, dataPagamento);
        setMetodoPagamento(metodoPagamento);
    }
    public void setMetodoPagamento(String metodoPagamento){
        if (metodoPagamento == null || metodoPagamento.isEmpty()){
            throw new IllegalArgumentException("Data inválida!");
        }else{
            this.metodoPagamento = metodoPagamento;
        }
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    @Override
    public String toString() {
        System.out.println("Método utilizado: ");
        return "\n===PIX===" + " Valor: " + getValor() + "\n Data de pagamento: " + getDataPagamento() + "\n Método Pagamento: " + getMetodoPagamento();
    }

    @Override
    public String processarPagamento() {
        return "Pagamento realizado com sucesso via PIX, no valor de + " + getValor();
    }
}
