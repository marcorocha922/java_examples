package filmes;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private String estudio;
    private String cls_etaria;   

    //A e B. Dois construtores, com dois tipos diferentes de inicialização de variaveis.
    Filme(String t, String e, String c){
        titulo = t;
        estudio = e;
        cls_etaria = c;
    }

    Filme(String t, String e){
        titulo = t;
        estudio = e;
        cls_etaria = "M/6";
    }

    //Método que permite mostrar as variaveis de uma instancia. 
    public void mostra_filme(){
        System.out.println("Título: " + titulo + "|\tEstudio: " + estudio + "|\tFaixa etária: " + cls_etaria);
    }

    //Método para criar um array de filmes M/6, recebendo como parametro um outro array de filmes maior.
    //Este método provavelmente está muito mais extenso do que seria necessário, mas encontrei alguns 
    //problemas enquanto o estava a fazer e esta foi a única maneira que encontrei de o colocar a funcionar bem.
    public static Filme [] getM6(Filme [] arr_filmes){
        int pos = 0;

        Filme [] m6 = new Filme [arr_filmes.length]; 

        for(int i=0; i<arr_filmes.length; i++){
            m6[i] = new Filme("", "", "");
        }

        for(int i=0; i<arr_filmes.length; i++){
            if(arr_filmes[i].cls_etaria == "M/6"){
                m6[pos] = arr_filmes[i];
                pos++;
            }
        }

        return m6;
    }

    public static ArrayList<Filme> getM6_v2(Filme [] arr_filmes){
        ArrayList<Filme> m6 = new ArrayList<Filme>();
        for(int i = 0; i < arr_filmes.length; i++){
            if(arr_filmes[i].cls_etaria == "M/6"){
                m6.add(arr_filmes[i]);
            }
        }
        return m6;
    }

    //Este foi uma versão anterior do método acima, em que percebi que um dos problemas era a 
    //não inicialização de todos os objectos dentro do novo array
    // public static Filme [] getM6 (Filme [] arr_filmes){
    //     Filme [] m6 = new Filme [arr_filmes.length];
    //     for(int i = 0; i < arr_filmes.length; i++){
    //         if(arr_filmes[i].cls_etaria == "M/6"){
    //             m6 [i] = arr_filmes[i];
    //         }
    //     }
    //     return m6;
    // }


    //Método para mostrar todos os filmes dentro de um array, usando o método criado acima para uma instancia. 
    //O if dentro do for foi uma solução para não mostrar objectos em branco quando o método é chamado para o array de M/6.
    public static void lista(Filme [] arr_filmes){
        for(int i=0; i<arr_filmes.length; i++){
            if(arr_filmes[i].titulo != ""){
                arr_filmes[i].mostra_filme();
            }
        }
    }
}
