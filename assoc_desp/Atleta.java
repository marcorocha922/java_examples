package assoc_desp;

public class Atleta extends Socio {
    Futsal futsal;
    TenisMesa tenisMesa;
    Corrida corrida;
    String modalidade_praticada;

    public Atleta(Socio s, Futsal f) {
        super(s);
        this.futsal = f;
        this.modalidade_praticada = "Futsal";
    }

    public Atleta(Socio s, TenisMesa t) {
        super(s);
        this.tenisMesa = t;
        this.modalidade_praticada = "Ténis de Mesa";
    }

    public Atleta(Socio s, Corrida c) {
        super(s);
        this.corrida = c;
        this.modalidade_praticada = "Corrida";
    }

    public String getInfoSocio() {
        return super.toString();
    }

    public String toString(){
        return super.toString() + " Modalidade: " + this.modalidade_praticada;
    }

}
