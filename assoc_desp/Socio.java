package assoc_desp;

import java.time.LocalDate;
//import java.util.Date;

public class Socio extends Pessoa {
    static int ult_num_socio = 0;
    int numero_socio;
    LocalDate data_inscricao = LocalDate.now();
    //String data_insc;

    public Socio(Pessoa p){
        super(p);
        this.numero_socio = ++ult_num_socio;
        //this.data_insc = this.data_inscricao.getDate() + " de " + this.data_inscricao.getMonth() + " de " + this.data_inscricao.getYear();
    }

    public Socio(Socio s){
        super(s);
        this.numero_socio = s.numero_socio;
        //this.data_insc = s.data_insc;
    }

    public int getNumero_socio() {
        return numero_socio;
    }

    public void setNumero_socio(int numero_socio) {
        this.numero_socio = numero_socio;
    }

    public String toString() {
        return super.toString() + " Nº Sócio: " + numero_socio + " Data de inscrição: " + data_inscricao.toString();
    }
}
