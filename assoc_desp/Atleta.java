package assoc_desp;

public class Atleta extends Socio{
    Futsal futsal;

    public Atleta(Socio s, Futsal f){
        super(s);
        this.futsal = f;
    }

    // public Modalidade getModalidade() {
    //     return modalidade;
    // }

    // public void setModalidade(Modalidade modalidade) {
    //     this.modalidade = modalidade;
    // }

    public String toString() {
        return super.toString() + " Modalidade: " + futsal.nome + " Posição: " + futsal.posicao + " Pé dominante: " + futsal.tipo;
    }

    
    
}
