package livros_e_autores;

import java.util.ArrayList;

public class Editora {
    //Definição das variaveis da classe editora, com nome e um arraylist do tipo Livro.
    private String nome;
    private ArrayList<Livro> livros = new ArrayList<Livro>();

    //Construtor. Começa com o nome apenas.
    Editora(String n){
        nome = n;
    }

    //Quando um livro é criado, este metodo é chamado para o adicionar ao arraylist de uma determinada editora. 
    public void addLivro(Livro l){
        livros.add(l);
    }

    public String getNome(){
        return nome;
    }

    //Devolve uma arraylist com todos os livros de uma editora.
    public ArrayList<Livro> getLivros(){
        return livros;
    }

    //Devolve uma string com os nomes de todos os livros de uma editora.
    public String nomeLivros(){
        String l = "";
        for(Livro lv : livros){
           l += lv.getNome() + ", ";
        }

        return l;
    }

    
}
