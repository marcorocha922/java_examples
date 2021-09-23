package livros_e_autores;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Arraylist de editoras que será usado para todas acções neste main
        ArrayList<Editora> editoras = new ArrayList<Editora>();

        //Criação de algumas editoras para haver um ponto de partida
        editoras.add(new Editora("Editorial Rocha"));
        editoras.add(new Editora("Marco Editora"));
        editoras.add(new Editora("Letras e Rochas"));
        editoras.add(new Editora("Livros Marcados"));

        //Adicionar alguns livros às editoras, também para haver ponto de partida
        editoras.get(0).addLivro(new Livro("Livro 1", new Autor("Autor 1", "autor1@gmail.com", "País 1"), 15, 150, editoras.get(0).getNome()));
        editoras.get(1).addLivro(new Livro("Livro 2", new Autor("Autor 2", "autor2@gmail.com", "País 2"), 16, 160, editoras.get(1).getNome()));
        editoras.get(2).addLivro(new Livro("Livro 3", new Autor("Autor 3", "autor3@gmail.com", "País 3"), 17, 170, editoras.get(2).getNome()));
        editoras.get(3).addLivro(new Livro("Livro 4", new Autor("Autor 4", "autor4@gmail.com", "País 4"), 18, 180, editoras.get(3).getNome()));
        editoras.get(0).addLivro(new Livro("Livro 5", new Autor("Autor 5", "autor5@gmail.com", "País 5"), 19, 190, editoras.get(0).getNome()));



        int op1 = 0, op2 = 0, i, esc = 0, sair = 1;

        do{
            do{
                i = 1;
                do{
                    System.out.println("[1] - Pesquisar livro; [2] - Adicionar livro; [3] - Sair");
                    op1 = teclado.nextInt();
                    if(op1 < 1 || op1 > 3){
                        System.out.println("Opção não reconhecida. Por favor escolha 1, 2 ou 3.");
                    }
                }while(op1 < 1 || op1 > 3);
        
                switch(op1){
                    case 1:{
                        for(Editora ed : editoras){
                            for(Livro lv : ed.getLivros()){
                                System.out.println("[" + i + "] - " + lv.getNome());
                                i++;
                            }
                        }
                        do{
                            System.out.println("Escolha o livro:");
                            op2 = teclado.nextInt();
                            if(op2 < 1 || op2 > i - 1){
                                System.out.println("Opção não reconhecida.");
                            }
                        }while(op2 < 1 || op2 > i - 1);
        
                        int l = 0;
                        for(int j = 0; j < editoras.size(); j++){
                            for(int x = 0; x < editoras.get(j).getLivros().size(); x++){
                                l++;
                                if(l == op2){
                                    System.out.println("\n\n**** " + editoras.get(j).getLivros().get(x).toString() + " ****");
                                    System.out.println("\n[1] - Alterar preço; [2] - Alterar stock; [3] - Alterar email do autor; [4] - Sair");
                                    int ops = teclado.nextInt();
        
                                    switch(ops){
                                        case 1:{
                                            System.out.println("\nIntroduza o novo valor: ");
                                            editoras.get(j).getLivros().get(x).setPreco(teclado.nextDouble());
                                            break;
                                        }
                                        case 2:{
                                            System.out.println("\nIntroduza o novo stock: ");
                                            editoras.get(j).getLivros().get(x).setQtdStock(teclado.nextInt());
                                            break;
                                        }
                                        case 3:{
                                            teclado.nextLine();
                                            System.out.println("\nIntroduza o novo email: ");
                                            editoras.get(j).getLivros().get(x).getAutor().setEmail(teclado.nextLine());
                                            break;
                                        }
                                        case 4:
                                            sair = 2;
                                            op1 = 3;
                                            break;
                                    }
                                    break;
                                }
                            }
                        }
                       break; 
                    }
                    case 2:{
                            do{
                                System.out.println("Adicionar um livro a uma editora da base de dados [1] ou de uma editora nova [2]: ");
                                op2 = teclado.nextInt();
                                if(op2 < 1 || op2 > 2){
                                    System.out.println("Opção não reconhecida. Por favor escolha 1 ou 2.");
                                }
                            }while(op2 < 1 || op2 > 2);
                    
                            switch(op2){
                                case 1:{
                                    //Usar editora já criada
                                    System.out.println("Escolha o número da editora: ");
                                    for(Editora edi : editoras){
                                        System.out.println("[" + i + "] - " + edi.getNome());
                                        i++;
                                    }
                                    do{
                                        esc = teclado.nextInt();
                                        if(esc < 1 || esc > editoras.size()){
                                            System.out.println("Editora não reconhecida. Por favor escolha novamente.");
                                        }
                                    }while(esc < 1 || esc > editoras.size());
                                    break;
                                }
                    
                                case 2:{
                                    //Criação de uma editora
                                    teclado.nextLine();
                                    System.out.println("Nome de editora: ");
                                    editoras.add(new Editora(teclado.nextLine()));
                                    esc = editoras.size();
                                    break;
                                }
                            }
                    
                            System.out.println("*****" + editoras.get(esc - 1).getNome() + "*****");
                            System.out.println("***** DADOS DO AUTOR *****");
                            if(op2 == 1){
                                teclado.nextLine();//Gastar o enter que vem do nextInt na opcao 1
                            }
                            
                            //Criação de um autor para a criação de um livro
                            String nome_autor, email, origem;
                            System.out.println("Nome do autor: ");
                            nome_autor = teclado.nextLine();
                            System.out.println("Email do autor: ");
                            email = teclado.nextLine();
                            System.out.println("Nacionalidade do autor: ");
                            origem = teclado.nextLine();
                            Autor a1 = new Autor(nome_autor, email, origem);
                    
                            System.out.println("***** DADOS DO LIVRO *****");
                            //Criação de um Livro com o autor previamente definido
                            String nome_livro;
                            double preco;
                            int qtd;
                            System.out.println("Nome do Livro: ");
                            nome_livro = teclado.nextLine();
                            System.out.println("Preço: ");
                            preco = teclado.nextDouble();
                            System.out.println("Quantidade de stock: ");
                            qtd = teclado.nextInt();
                    
                            editoras.get(esc - 1).addLivro(new Livro(nome_livro, a1, preco, qtd, editoras.get(esc - 1).getNome()));
                            
                            do{
                                System.out.println("Pretende: [1] - Voltar ao início; [2] - Ver os dados que acabou de inserir e voltar ao início; [3] - Sair");
                                op2 = teclado.nextInt();
                                if(op2 < 1 || op2 > 3){
                                    System.out.println("Opção não reconhecida. Por favor escolha 1, 2 ou 3.");
                                }
                            }while(op2 < 1 || op2 > 3);
                    
                            if(op2 == 2){
                                //Print na consola de todos os dados do Livro, com o autor também, através do arraylist de editoras apenas.
                                System.out.println("Nome da editora: " + editoras.get(esc - 1).getNome());
                                System.out.println("Livro e autor: " + editoras.get(esc - 1).getLivros().get(editoras.get(esc - 1).getLivros().size()- 1 ).toString());
                                System.out.println("Preço: " + editoras.get(esc - 1).getLivros().get(editoras.get(esc - 1).getLivros().size()- 1).getPreco() + "€ Quantidade: " + editoras.get(esc - 1).getLivros().get(editoras.get(esc - 1).getLivros().size()- 1).getQtdStock());
                            }
    
                            if(op2 == 3){
                                sair = 2;
                                op1 = 3;
                            }
                        break;
                    }
    
                    case 3:{
                        sair = 2;
                        break;
                    }
                }
            }while(sair == 1);

            }while(op1 != 3);
            
        teclado.close();
    }
}
