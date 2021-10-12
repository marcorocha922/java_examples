package clube;

public class Socio extends Pessoa {
    static int ult_num_socio = 0;
    int num_socio;

    public Socio(Pessoa p){
        super(p);
        this.num_socio = ++ult_num_socio;
    }

    public Socio(Socio s) {
        super(s);
        this.num_socio = s.num_socio;
    }

    public String toString() {
        return super.toString() + "Num.Sócio: " + num_socio;
    }
}
