package assoc_desp;

public class Futsal extends Modalidade{

    String posicao;
    String tipo;

    public Futsal(String posicao, String tipo) {
        this.nome_modalidade = "Futsal";
        this.coletivo = true;
        this.posicao = posicao;
        this.tipo = tipo;
    }

    public String getPosicao(){
        return posicao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String toString(){
        return super.toString() + " Posição: " + posicao + " Pé dominante: "+ tipo;
    }
}
