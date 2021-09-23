package filmes;

import java.util.ArrayList;
import java.util.Scanner;

public class VerFilmes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        //D. Criação de um objecto da classe Filme com os dados pedidos. 
        Filme f1 = new Filme("Casino Royale", "Eon Productions", "M/13");

        int num_filmes;
        char op;

        //Dada a possibilidade ao utilizador de inserir os filmes que quiser.
        System.out.println("Quantos filmes pretende adicionar?");
        num_filmes = teclado.nextInt();

        //Criação do array com o numero certo de filmes.
        Filme[] filmes = new Filme[num_filmes];
        ArrayList<Filme> filmes1 = new ArrayList<Filme>();

        //Possibilidade de inserir ou nao a cls etária. Deste modo usamos os dois construtores. 
        //Apenas avança quando a opção é uma das duas possiveis.
        do{
            System.out.println("Pretende adicionar classificação etária? [s]im \\ [n]ão");
            op = teclado.next().toUpperCase().charAt(0);
            teclado.nextLine();
        }while(op != 'S' && op != 'N');


        //Inicialização de todos os objectos dentro do array, da maneira que o utilizador escolheu acima. 
        //Na opção com cls etária, esta é escolhida através de opções. Isto acontece porque existe um número 
        //curto de opçóes por onde escolher, o que torna o processo ao utilizador mais fácil, e porque 
        //assim contorno um outro problema que tinha, que era o input não ser depois bem reconhecido no método getM6.
        switch(op){
            case 'S':
            {
                for (int i = 0; i < num_filmes; i++){
                    System.out.println("\n\nNome do filme: ");
                    String nome = teclado.nextLine();
                    System.out.println("\nEstudio: ");
                    String estudio = teclado.nextLine();
                    int cls_num;
                    String cls = "";
                    //System.out.println("Classificação etária: ");
                    // String cls = teclado.nextLine();
                    do{
                        System.out.println("\nClassificação etária: [1] - M/6; [2] - M/13; [3] - M/18");
                        
                        cls_num = teclado.nextInt();
                        teclado.nextLine();
                    }while(cls_num != 1 && cls_num != 2 && cls_num != 3);

                    
                    switch (cls_num) {
                        case 1:
                            cls = "M/6";
                            break;
                        case 2:
                            cls = "M/13";
                            break;
                        case 3:
                            cls = "M/18";
                            break;
                        default:
                            System.out.println("Classificação etária não reconhecida.");
                            break;
                    }

                    filmes[i] = new Filme(nome, estudio, cls);
                    filmes1.add(new Filme(nome, estudio, cls));
                }
                break;
            }
            case 'N':
            {
                for (int i = 0; i < num_filmes; i++){
                    System.out.println("\n\nNome do filme: ");
                    String nome = teclado.nextLine();
                    System.out.println("\nEstudio: ");
                    String estudio = teclado.nextLine();
                    filmes[i] = new Filme(nome, estudio);
                    filmes1.add(new Filme(nome, estudio));
                }
                break;
            }

        }

        //Método mostra_filme para ver o filme da alinea D.
        System.out.println("\n\nFilme f1: ");
        f1.mostra_filme();

        //Método lista para ver todos os filmes dentro do array criado pelo utilizador.
        System.out.println("\n\nLista de filmes: ");
        Filme.lista(filmes);
        for(Filme flm : filmes1){
            flm.mostra_filme();
        }

        //Criação do array de filmes cls M/6, e o método lista para mostrar também esse array.
        Filme[] filmes_m6 = Filme.getM6(filmes);
        System.out.println("\n\nFilmes M/6: ");
        Filme.lista(filmes_m6);
        
        ArrayList<Filme> filmes_m6_v2 = Filme.getM6_v2(filmes);
        for(Filme flm : filmes_m6_v2){
            flm.mostra_filme();
        }
        
        
        teclado.close();
    }
}
