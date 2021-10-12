package clube;

import java.util.Date;

public class Pessoa {
    String  nome;
    String  apelido;
    String  nif;
    Date    dt_nascimento;

    public Pessoa(String nome, String apelido, String nif, Date dt_nascimento){
        this.nome = nome;
        this.apelido = apelido;
        this.nif = nif;
        this.dt_nascimento = dt_nascimento;
    }

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