package assoc_desp;

public class TenisMesa extends Modalidade {
    String tipo;
    int esquerda, direita;

    public TenisMesa(String tipo, int esquerda, int direita) {
        super.nome_modalidade = "Ténis de Mesa";
        super.coletivo = false;
        this.tipo = tipo;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(int esquerda) {
        this.esquerda = esquerda;
    }

    public int getDireita() {
        return direita;
    }

    public void setDireita(int direita) {
        this.direita = direita;
    }

    public String toString(){
        return "Mão: " + tipo + " Esquerda: " + esquerda + " Direita: " + direita;
    }

}
