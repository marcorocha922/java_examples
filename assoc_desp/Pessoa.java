package assoc_desp;

import java.time.LocalDate;

public class Pessoa {
    String nome;
    String apelido;
    String nif;
    LocalDate data_nascimento;

    public Pessoa(String nome, String apelido, String nif, Integer ano, Integer mes, Integer dia){
        this.nome = nome;
        this.apelido = apelido;
        this.nif = nif;
        this.data_nascimento = LocalDate.of(ano, mes, dia);
    }

    public Pessoa(Pessoa p){
        this.nome = p.nome;
        this.apelido = p.apelido;
        this.nif = p.nif;
        this.data_nascimento = p.data_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNif() {
        return nif;
    }

    public String toString() {
        return "Nome: " + nome + " "+ apelido + " NIF: " + nif + " Data nascimento: " + data_nascimento;
    }

}
