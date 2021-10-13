package clube;

/*
A classe Socio, tal como vimos, é uma classe derivada (ou herda...) da classe
Pessoa; isso significa que possui também (ou partilha) os atributos da classe
Pessoa.
*/
public class Socio extends Pessoa {
    static int ult_num_socio = 0;
    // esta variável é especial; declarada desta forma é considerada uma
    // variável de Classe (e não de instância ou objeto); é uma forma elegante
    // de podermos controlar a numeração de sócios dentro da classe Socio (ver
    // construtor respetivo).

    int num_socio;

    /*
    Este construtor serve para criar um objeto da classe Socio a partir de um
    objeto da classe Pessoa previamente criado (ver TestClube.java).
    */
    public Socio(Pessoa p){
        super(p);
        this.num_socio = ++ult_num_socio;
        // o valor e a alteração de uma variável "static" (de classe) é COMUM
        // a toda a classe, ou seja, não muda de instância para instância; é,
        // por isso, possível incrementar a numeração de sócios por cada sócio
        // que seja criado. 
    }

    /*
    Este construtor serve para criar um objeto da classe Socio a partir de um
    objeto da classe Socio previamente criado (ver TestClube.java); a ideia é
    permitir que o construtor da classe Atleta, que vai herdar da classe Socio,
    tenha uma forma simples de ser inicializado com um objeto da classe Socio
    previamente criado (ver o TestClube.java)
    */
    public Socio(Socio s) {
        super(s);
        this.num_socio = s.num_socio;
    }

    public String toString() {
        return super.toString() + "Num.Sócio: " + num_socio;
    }
}
