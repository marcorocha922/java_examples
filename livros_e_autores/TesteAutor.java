package livros_e_autores;

import java.util.ArrayList;

public class TesteAutor {
    public static void main(String[] args) {

        //Criação de um Autor unico a1, e um arraylist de autores para a alinea 3 do extra. 
        Autor a1 = new Autor("Marco Rocha", "marcorocha@gmail.com" , "Portugal");
       
        ArrayList<Autor> autores = new ArrayList<Autor>();
        autores.add(new Autor("Marco Rocha", "marcorocha@gmail.com" , "Portugal"));
        autores.add(new Autor("André Rocha", "andrerocha@gmail.com" , "Portugal"));
        autores.add(new Autor("Alves Rocha", "alvesrocha@gmail.com" , "Portugal"));
        autores.add(new Autor("Marco andré", "marcoandre@gmail.com" , "Portugal"));

        //Print na consola das variaveis do autor a1.
        System.out.println(a1.getNome() + " " +  a1.getOrigem() + " " + a1.getEmail() + "\n");

        //Redefinição do email do autor a1
        a1.setEmail("rochamarco@gmail.com");

        //Print na consola de todos os dados do autor a1, com o email actualizado.
        System.out.println(a1 + "\n");
    }
}
