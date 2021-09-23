package livros_e_autores;

public class Autor {
    private String nome;
    private String email;
    private String origem;

    Autor(String nome, String email, String origem){
        this.nome = nome;
        this.email = email;
        this.origem = origem;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getOrigem(){
        return origem;
    }

    public void setEmail(String emai){
        email = emai;
    }

    public String toString(){
        return nome + " (" + origem + "), " +  email;
    }
}
