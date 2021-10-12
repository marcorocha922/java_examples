package assoc_desp;

public class Modalidade {
    String nome;
    Boolean coletivo;

    Modalidade(String nome, Boolean coletivo){
        this.nome = nome;
        this.coletivo = coletivo;
    }

    public Modalidade(){
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
