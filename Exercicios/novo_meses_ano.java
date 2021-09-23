package Exercicios;

import java.util.Scanner;

public class novo_meses_ano {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int mes;

        String[] mes2 = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        do{
            System.out.println("Insira um valor entre 1 e 12: ");
            mes = teclado.nextInt();
        }while(mes<1 || mes >12);

        teclado.close();

        switch(mes){
            case 1: {
                System.out.println("Janeiro");
                break;
            }
            case 2: {
                System.out.println("Feveiro");
                break;
            }
            case 3: {
                System.out.println("Março");
                break;
            }
            case 4: {
                System.out.println("Abril");
                break;
            }
            case 5: {
                System.out.println("Maio");
                break;
            }
            case 6: {
                System.out.println("Junho");
                break;
            }
            case 7: {
                System.out.println("Julho");
                break;
            }
            case 8: {
                System.out.println("Agosto");
                break;
            }
            case 9: {
                System.out.println("Setembro");
                break;
            }
            case 10: {
                System.out.println("Outubro");
                break;
            }
            case 11: {
                System.out.println("Novembro");
                break;
            }
            case 12: {
                System.out.println("Dezembro");
                break;
            }
        }

        for(int i=mes; i<=mes; i++){
            System.out.println(mes2[i-1]);
        }
    }
}
