package assoc_desp;

public class Modalidade {
    String nome_modalidade;
    Boolean coletivo;

    public Modalidade(String nome_modalidade, Boolean coletivo){
        this.nome_modalidade = nome_modalidade;
        this.coletivo = coletivo;
    }

    public Modalidade(){
        super();
    }

    public String getNome() {
        return nome_modalidade;
    }

    public void setNome(String nome_modalidade) {
        this.nome_modalidade = nome_modalidade;
    }

    public void addDistancias(String distancia) {
    }

    public String toString() {
        return "\nModalidade : " + nome_modalidade;
    }

    
}
