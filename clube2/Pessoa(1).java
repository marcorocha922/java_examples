package clube;

import java.util.Date;

/*
A classe Pessoa, tal como vimos, será a classe base do nosso sistema; isto vai
permitir no futuro podermos criar outro tipo de classes derivadas sem ser
sócios ou atletas.
*/
public class Pessoa {
    String  nome;
    String  apelido;
    String  nif;
    Date    dt_nascimento;

    /*
    Este construtor serve para criar um objeto da classe Pessoa a partir de
    dados diretos passados como parâmetros.
    */
    public Pessoa(String nome, String apelido, String nif, Date dt_nascimento){
        this.nome = nome;
        this.apelido = apelido;
        this.nif = nif;
        this.dt_nascimento = dt_nascimento;
    }

    /*
    Este construtor serve para criar um objeto da classe Pessoa a partir de
    outro objeto da classe Pessoa; a ideia é permitir que o construtor da
    classe Socio, que vai herdar da classe Pessoa, tenha uma forma simples de
    ser inicializado com um objeto da classe Pessoa pré-inicializado (ver o
    TestClube.java)
    */
    public Pessoa(Pessoa p) {
        this.nome = p.nome;
        this.apelido = p.apelido;
        this.nif = p.nif;
        this.dt_nascimento = p.dt_nascimento;        
    }

    public String toString(){
        return "Nome: " + nome +
               ", Apelido: " + apelido +
               ", NIF: " + nif +
               ", Dt.Nascimento: " + dt_nascimento.toString();
    }
}