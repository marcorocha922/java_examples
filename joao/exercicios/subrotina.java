package joao.exercicios;

/*
Vamos fazer um programa que faça o seguinte:
- solicita 5 notas de testes de uma disciplina a um aluno
(entre 0 e 20), mas aceitando casas decimais
- não vamos ainda pensar em tratamento de excepções, vamos aceitar
que os valores serão numéricos; no entanto, devem ser validados;
- consoante a média obtida, o programa deverá devolver se o aluno
foi aprovado (média >= 12), reprovado (média < 8) ou deva ir a uma
prova oral (média entre 8 - inclusivé - e 12 - exclusivé);
- em vez de fazer tudo dentro do "main", pede-se que crie 2
métodos (ou funções) dentro da classe do programa: um para calcular
a média, e outro para devolver um dos 3 valores ("Aprovado",
"Reprovado" ou "Prova Oral");
DICA: utilize ARRAYS
*/











import java.util.Scanner;

public class subrotina {

    static float calc_media(float[] arg_notas) {
        float soma = 0;
        int num_notas = arg_notas.length;
        for (int i = 0; i < num_notas; i++) {
            soma += arg_notas[i];
        }
        return (soma / num_notas);
    }

    static String resultado(float arg_media) {
        if (arg_media < 8) {
            return "Reprovado";
        } else if (arg_media < 12) {
            return "Prova Oral";
        } else {
            return "Aprovado";
        }
    }

    static void obter_notas(float[] arg_notas) {
        
    }
    public static void main(String[] args) {

        int n_notas = 5;
        float[] notas = new float[n_notas];
        float nota, media;

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < n_notas; i++) {
            do {
                System.out.printf("Nota (%d): ", i+1);
                nota = teclado.nextFloat();
            } while ((nota < 0) || (nota > 20));
            notas[i] = nota;
        }
        teclado.close();

        media = calc_media(notas);
        System.out.printf(
            "A sua média é %.2f valores, %s\n",
            media, resultado(media));
    }   
}
