public class Diretor extends Pessoa {
    private int tempoDeGestao;
    public Diretor(String nome, int idade, int tempoDeGestao){
        super(nome, idade);
        setTempoDeGestao(tempoDeGestao);
    }

    public void setTempoDeGestao(int tempoDeGestao) {
        this.tempoDeGestao = tempoDeGestao;
    }

    public int getTempoDeGestao(){
        return tempoDeGestao;
    }

    @Override
    public String apresentar(){
        return "Sou diretor e meu nome é: " + getNome() + ", tenho " + getIdade() + " anos e minha experiência é de " + getTempoDeGestao() + " anos de gestão" + ".";
    }
}
