package clube;

/*
A classe Atleta, tal como vimos, é uma classe derivada (ou herda...) da classe
Socio; isso significa que possui também (ou partilha) os atributos da classe
Socio (e, por conseguinte, os da classe Pessoa, claro).
*/
public class Atleta extends Socio {
    String modalidade;
    // deixei a modalidade ainda como string; devem ser vcs a criar a classe
    // Modalidade e suas 3 derivadas, conforme definimos na aula.

    /*
    Este construtor serve para criar um objeto da classe Atleta a partir de um
    objeto da classe Socio e um parametro que indique a modalidade.
    */
    public Atleta(Socio s, String modal) {
        super(s);
        this.modalidade = modal;
    }

    public String toString() {
        return super.toString() + "Modalidade: " + modalidade;
    }

}