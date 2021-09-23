package joao.exercicios;

/*
Escreve um programa que, a partir de um valor inteiro dado pelo
utilizador, o programa apresente o nome do mês que lhe corresponde.
Ainda sem se preocupar com excepções (para as situações em que
devemos controlar ao máximo o que o utilizador escreve), deve, no
entanto, validar se o número inteiro que o utilizador introduziu
é válido... e, caso não seja, deve ficar claro que o utilizador
deve introduzir um valor entre x e y.
DICA: resolva este exercício com 2 versões; a primeira, deve usar
a estrutura SWITCH; na segunda versão deve usar ARRAYS.
*/














import java.util.Scanner;

public class meses_ano {
    public static void main(String[] args) {
        int mes;
        String mesString = "";

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Número do mês (1-12): ");
            mes = teclado.nextInt();
        } while ((mes < 1) || (mes > 12));
        teclado.close();

        switch (mes) {
            case 1:  mesString = "janeiro";
                     break;
            case 2:  mesString = "fevereiro";
                     break;
            case 3:  mesString = "março";
                     break;
            case 4:  mesString = "abril";
                     break;
            case 5:  mesString = "maio";
                     break;
            case 6:  mesString = "junho";
                     break;
            case 7:  mesString = "julho";
                     break;
            case 8:  mesString = "agosto";
                     break;
            case 9:  mesString = "setembro";
                     break;
            case 10: mesString = "outubro";
                     break;
            case 11: mesString = "novembro";
                     break;
            case 12: mesString = "dezembro";
                     break;
        }
        System.out.println("Pela primeira versão...");
        System.out.println("-----------------------");
        System.out.println(
            "O mês correspondente é: " + mesString);
        
        // usando ARRAYS
        String[] meses_ano = {
            "janeiro", "fevereiro", "março", "abril", "maio",
            "junho", "julho", "agosto", "setembro", "outubro",
            "novembro", "dezembro"
        };
        System.out.println("Pela segunda versão...");
        System.out.println("-----------------------");
        System.out.println(
            "O mês correspondente é: " + meses_ano[mes-1]);
    }

}
