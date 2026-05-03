public class Moto extends Veiculo{
    private int cilindrada;
    Moto(String tipo, String marca, String modelo, int ano, int cilindrada){
        super(tipo, marca, modelo, ano);
        setCilindrada(cilindrada);
    }

    public void setCilindrada(int cilindrada){
        if (cilindrada <= 0){
            throw new IllegalArgumentException("Valor inválido!");
        }else {
            this.cilindrada = cilindrada;
        }
    }

    public int getCilindrada(){
        return cilindrada;
    }

    @Override
    public String ligar(){
        return "\n====Moto==== " + " \nTipo: " + getTipo() + " \nMarca: " + getMarca() + " \nModelo: " + getModelo() + " \nAno: " + getAno() + " \nCilindrada: " + getCilindrada() + " \nLigou!" ;
    }
}
