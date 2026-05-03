public class Carro extends Veiculo {
    private int portas;
    Carro(String tipo, String marca, String modelo, int ano, int portas){
        super(tipo, marca, modelo, ano);
        setPortas(portas);
    }

    public void setPortas(int portas){
        if (portas <= 0){
            throw new IllegalArgumentException("Valor inválido!");
        }else if (portas > 4){
            throw new IllegalArgumentException("O carro não pode ter mais que 4 portas!");
        }else {
            this.portas = portas;
        }
    }

    public int getPortas(){
        return portas;
    }

    @Override
    public String ligar(){
        return "\n====Carro==== " + " \nTipo: " + getTipo() + " \nMarca: " + getMarca() + " \nModelo: " + getModelo() + " \nAno: " + getAno() + " \nCilindrada: " + getPortas() + " \nLigou!" ;
    }
}
