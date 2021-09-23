package joao.exercicios;

/*
Faça um programa que solicite 2 valores inteiros ao utilizador, e
apresente os números ímpares entre esses 2 valores.
O programa só deve aceitar números positivos; se algum valor for
negativo, o programa deve avisar o utilizador e voltar a pedir-lhe
o respetivo valor.
DICAS: repetir pedido até que a condição desejada se verifique...
Exemplo:
> primeiro numero: 4
> segundo numero: 13
> 4
> 5 7 9 11
> 13
ou...
> 4 --> 5 7 9 11 <-- 13

Especificação "português estruturado"
INÍCIO
    faz
        ler valor 1
    enquanto valor 1 <= 0
    faz
        ler valor 2
    enquanto valor 2 <= 0

    escreve valor1 + "-->"
    para v entre valor1 e valor2
        se (v % 2) == 1
            escreve o v
    escreve "<--" + valor2
FIM
*/

import java.util.Scanner;

public class impares_intervalo {
    public static void main(String[] args) {
        int val1, val2;
        
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Primeiro valor (> 0): ");
            val1 = teclado.nextInt();
        } while (val1 <= 0);
        do {
            System.out.print("Segundo valor (> 0): ");
            val2 = teclado.nextInt();
        } while (val2 <= 0);
        teclado.close();

        // se o primeiro valor for maior que o segundo, trocar
        // um com o outro; val1 fica com o valor que estava em
        // val2, e val2 fica com o valor que estava em val1
        if (val1 > val2) {    // val1 = 7; val2 = 3
            int swap = val2;  // swap = 3; val2 = 3; val1 = 7
            val2 = val1;      // val2 = 7; val1 = 7; swap = 3
            val1 = swap;      // val1 = 3; val2 = 7; swap = 3
        }
        
        System.out.println(
            "Números ímpares entre " + val1 + " e " + val2 + ":");
        System.out.print(val1 + " --> ");
        for (int i = val1 + 1; i < val2; i++) {
            if ((i % 2) == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("<-- " + val2);
    }
}
