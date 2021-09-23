package livros_e_autores;

import java.util.ArrayList;

public class Livro {
    //Definição das variaveis base
    private String nome;
    private Autor autor;
    private double preco;
    private int qtdStock = 0;

    //Criação de um array de autores para livros com mais de um autor
    private ArrayList<Autor> autores;

    //Criação da string editora para adicionar o nome da editora do livro.
    private String editora;

    //Série de 5 construtores diferentes, variando entre autor unico ou arraylist de autores e ainda com editora ou sem editora.
    Livro(String n, Autor a, double p){
        nome = n;
        autor = a;
        preco = p;
    }

    Livro(String n, Autor a, double p, int q){
        nome = n;
        autor = a;
        preco = p;
        qtdStock = q;
    }

    Livro(String n, Autor a, double p, int q, String e){
        nome = n;
        autor = a;
        preco = p;
        qtdStock = q;
        editora = e;
    }

    Livro(String n, ArrayList<Autor> a, double p, int q){
        nome = n;
        autores = a;
        preco = p;
        qtdStock = q;
    }

    Livro(String n, ArrayList<Autor> a, double p, int q, String e){
        nome = n;
        autores = a;
        preco = p;
        qtdStock = q;
        editora = e;
    }

    public String getNome(){
        return nome;
    }

    public Autor getAutor(){
        return autor;
    }

    public double getPreco(){
        return preco;
    }

    public String getEditora(){
        return editora;
    }

    public void setPreco(double p){
        preco = p;
    }

    public int getQtdStock(){
        return qtdStock;
    }

    public void setQtdStock(int q){
        qtdStock = q;
    }

    public String toString(){
        return "\"\'" + nome + "\', de " + autor.toString() + "\"\n" + "Preço: " + preco + "\nStock: " + qtdStock;
    }

    public String getNomeAutor(){
        return autor.getNome();
    }

    public String getEmailAutor(){
        return autor.getEmail();
    }

    public String getOrigemAutor(){
        return autor.getOrigem();
    }

    //metodo que retorna uma string com o nome do livro e todos os nomes dos autores, usando o arraylist de autores. 
    public String toStringAutores(){
        String auts = "";
        for(Autor aut : autores){
                   auts += aut.getNome() + ", ";
                }
        return "\"\'" + nome + "\', de " + auts + "\"";
    }
}
