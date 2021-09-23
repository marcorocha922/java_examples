package joao.exercicios;

/*
Faça um programa que solicite o nome de um aluno, e as 5 notas
(entre 0 a 20) da disciplina de Geometria Descritiva; no final
deve devolver-lhe a média da disciplina, arredondada até à primeira
casa decimal.
*/

import java.util.Scanner;

public class media_notas {

    public static void main(String[] args) {
        int n_notas = 5;
        float nota, soma = 0, media = 0;

        // apresentação do título do meu programa ao utilizador
        System.out.println("Cálculo da média...");
        System.out.println("-------------------");

        // criação do "objeto" teclado para a entrada de dados
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome do Formando: ");
        String nome = teclado.nextLine();
        System.out.println("-------------------");
        System.out.println("Notas do formando " + nome);

        // ciclo para leitura e acúmulo das notas
        for (int i = 1; i <= n_notas; i++) {
            System.out.printf("Introduza a nota seguinte (%d): ", i);
            nota = teclado.nextFloat();
            soma += nota; // somar tudo primeiro
        }
        teclado.close();

        media = soma / n_notas; // calcular a média aritmética

        System.out.printf("A média final é: %.1f\n", media);

    }

}
