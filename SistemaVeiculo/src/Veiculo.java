public class Veiculo {
    private String tipo;
    private String marca;
    private String modelo;
    private int ano;

    Veiculo(String tipo, String marca, String modelo, int ano){
        setTipo(tipo);
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
    }

    //setters
    public void setTipo(String tipo){
        if (tipo == null || tipo.isEmpty()){
            throw new IllegalArgumentException("Tipo de véiculo inválido!");
        }else {
            this.tipo = tipo;
        }
    }

    public void setMarca(String marca){
        if (marca == null || marca.isEmpty()){
            throw new IllegalArgumentException("Marca de veículo inválida!");
        }else {
            this.marca = marca;
        }
    }

    public void setModelo(String modelo){
        if (modelo == null || modelo.isEmpty()){
            throw new IllegalArgumentException("Modelo de veículo inválido!");
        }else {
            this.modelo = modelo;
        }
    }

    public void setAno(int ano){
        if (ano <= 0){
            throw new IllegalArgumentException("Valor inválido!");
        }else {
            this.ano = ano;
        }
    }

    //getters
    public String getTipo(){
        return tipo;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }



    public String ligar(){
        return "";
    }





}
