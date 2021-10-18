package assoc_desp;

public class Atleta extends Socio {
    Modalidade modalidade;

    public Atleta(Socio s, Modalidade modal){
        super(s);
        this.modalidade = modal;
    }

    public String getInfoSocio() {
        return super.toString();
    }

    public String toString(){
        return super.toString() + modalidade;
    }

    @Override
    public Modalidade getModalidade() {
        return modalidade;
    }
  

}
