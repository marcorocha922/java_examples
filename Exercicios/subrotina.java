package Exercicios;

import java.util.Scanner;

public class subrotina {

    static float calcMedia(float[] argNotas){
        float soma = 0;
        int numNotas = argNotas.length;
        for (int i=0; i<numNotas; i++){
            soma+=argNotas[i];
        }
        return (soma / numNotas);
    }

    static String resultado(float media){
        if(media >= 12){
            return "O Aluno ficou Aprovado";
        }else if(media >= 8){
            return "O Aluno vai a Oral";
        }else{
            return "O Aluno ficou Reprovado";
        }
    }

    static void obter_notas(float[] argNotas){
        int numNotas = argNotas.length;
        //Scanner do teclado
        Scanner teclado = new Scanner(System.in); 
        //colocação das notas
        for(int i=0; i<numNotas; i++){
            do{
                System.out.println("Insira a nota do " + (i+1) + "º teste[nota entre 0 e 20]: ");
                argNotas[i]= teclado.nextFloat();
            }while(argNotas[i] <=0 || argNotas[i] > 20 );
        // media+=notas[i];
        }
        //fecho teclado
        teclado.close();
    }
    public static void main(String[] args) {

        int nNotas = 5;
        float[] notas = new float[nNotas];
        float media=0;
        
        obter_notas(notas);
       
        media=calcMedia(notas);
        System.out.printf("A média dos %d testes é de: %.1f\nResultado: %s",nNotas, media, resultado(media));
    }
}
