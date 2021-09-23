package livros_e_autores;

import java.util.ArrayList;

public class TesteLivro {
    public static void main(String[] args) {
        //Criação de uma editora
        Editora e1 = new Editora("Editorial Rocha");

        //Criação de um Autor unico a1, e um arraylist de autores para a alinea 3 do extra. 
        Autor a1 = new Autor("Marco Rocha", "marcorocha@gmail.com" , "Portugal");
       
        ArrayList<Autor> autores = new ArrayList<Autor>();
        autores.add(new Autor("Marco Rocha", "marcorocha@gmail.com" , "Portugal"));
        autores.add(new Autor("André Rocha", "andrerocha@gmail.com" , "Portugal"));
        autores.add(new Autor("Alves Rocha", "alvesrocha@gmail.com" , "Portugal"));
        autores.add(new Autor("Marco andré", "marcoandre@gmail.com" , "Portugal"));

        //Criação de dois livros, um com autor a1, e outro com arraylist de autores, e add ao arraylist de livros da editora e1.
        Livro l1 = new Livro("Java", a1, 10, 1000, e1.getNome());
        e1.addLivro(l1);
        Livro l2 = new Livro("Java Avançado", autores, 10, 1000, e1.getNome());
        e1.addLivro(l2);

        //Print na consola dos dados do livro l1 através do metodos de retorno de uma só variavel.
        System.out.println(l1.getNome() + " " + l1.getAutor().getNome()+ " " + l1.getEditora() + " " + l1.getPreco() + " " +l1.getQtdStock() + "\n");

        //Redefinição de duas variaveis do livro l1.
        l1.setPreco(15);
        l1.setQtdStock(1500);

        //Print dos dados actualizados do livro l1, e uso do método toString do livro que usa o toString do autor. 
        System.out.println(l1.getNome() + " " + l1.getAutor().getNome()+ " " + l1.getEditora() + " " + l1.getPreco() + " " +l1.getQtdStock() + "\n");
        System.out.println(l1.toString()+ "\n");

        //Print do nome e email do autor do livro l1, atraves de metodos do livro.
        System.out.println(l1.getAutor().getNome() + " " + l1.getAutor().getEmail() + "\n");

        //Print dos nomes de todos os autores do livro l2 e a editora.
        System.out.println(l2.toStringAutores()+l2.getEditora() + "\n");

        //Print na consola dos nomes dos livros da editora e1.
        System.out.println(e1.nomeLivros());

    }
}
