package assoc_desp;

import java.time.LocalDate;

public class Pessoa {
    String nome;
    String apelido;
    String nif;
    //Variável LocalDate para as datas. Pela pesquisa que fiz, percebi que este era o melhor tipo de variável, e mais actual.
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

    //Método que poderá ser usado no futuro, numa melhoria do programa
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getNumero_socio() {
        int i = 0;
        return i;
    }

    public String getNif() {
        return nif;
    }

    public Modalidade getModalidade() {
        Modalidade modalidade = new Modalidade();
        return modalidade;
    }

    public String toString() {
        return "Nome: " + nome + " "+ apelido + " NIF: " + nif + " Data nascimento: " + data_nascimento;
    }

}
