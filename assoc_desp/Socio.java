package assoc_desp;

import java.time.LocalDate;

import java.util.ArrayList;

public class Socio extends Pessoa {
    static int ult_num_socio = 0;
    int numero_socio;
    LocalDate data_inscricao;


    public Socio(Pessoa p){
        super(p);
        this.numero_socio = ++ult_num_socio;
        this.data_inscricao = LocalDate.now();
    }

    public Socio(Socio s){
        super(s);
        this.numero_socio = s.numero_socio;
        this.data_inscricao = s.data_inscricao;
    }

    //Método usado para possibilitar a criação de um atleta através de um sócio já existente.
    public static int findIndexSocio(ArrayList <Socio> socios, int num_socio){
        int i = 0, x = 0;
        for( Socio soc : socios){
            if(soc.numero_socio == num_socio){
                x = i;
            }
            i++;
        }
        return x;
    }

    public static int findIndexPessoa(ArrayList <Pessoa> pessoas, int num_socio){
        int i = 0, x = 0;
        for( Pessoa pes : pessoas){
            if(pes.getNumero_socio() == num_socio){
                x = i;
            }
            i++;
        }
        return x;
    }

    @Override
    public int getNumero_socio() {
        return numero_socio;
    }

    public String toString() {
        return super.toString() + " Nº Sócio: " + numero_socio + " Data de inscrição: " + data_inscricao;
    }

    @Override
    public Modalidade getModalidade() {
        Modalidade modalidade = new Modalidade();
        return modalidade;
    }
}
