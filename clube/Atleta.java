package clube;

public class Atleta extends Socio {
    String modalidade; // deixei a modalidade como string, por enquanto ;)

    public Atleta(Socio s, String modal) {
        super(s);
        this.modalidade = modal;
    }

    public String toString() {
        return super.toString() + "Modalidade: " + modalidade;
    }

}