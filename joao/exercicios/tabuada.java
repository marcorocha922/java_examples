/*
Criar um progarma para escrever a tabuada...
Para já, o número do qual vamos escrever a tabuada, deve
estar como uma variável inteira dentro do próprio programa...
Já iremos aprender como ler dados escritos pelo utilizador,
a partir do teclado.

ex.: numero = 7

7 x 1 = 7
7 x 2 = 14
...
7 x 9 = 63
7 x 10 = 70

Dica: utilize uma estrutura de LOOP/repetição
*/

package joao.exercicios;

import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {        
        int n;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduza um valor 1: ");
        n = teclado.nextInt();
        teclado.close();

        System.out.println("Tabuada do número " + n);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %2d\n", n, i, n*i);
        }
    }
    
}
