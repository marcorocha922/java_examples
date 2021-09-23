package Exercicios;

import java.util.Scanner;

public class media_notas {
    public static void main(String[] args) {

        float[] notas = new float[5];
        float media=0;
        String nome;

        System.out.print("Qual o nome do aluno?: ");

        Scanner teclado = new Scanner(System.in);
        nome = teclado.nextLine();
        
        for( int i=0; i<5; i++){
            System.out.print("\nNota :");
            notas[i]=teclado.nextFloat();
            media+=notas[i];
        }

        teclado.close();
        media/=5;
        System.out.printf("Média de notas do aluno %s é de %.1f valores.", nome, media);
    }
}
