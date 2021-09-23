package Exercicios;

import java.util.Scanner;

public class meses_switch {
    public static void main(String[] args) {
        //Declaração do array e variavel
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio",   
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro",      
            "Dezembro" };
        int mes;
        
        //Scanner do teclado
        Scanner teclado = new Scanner(System.in); 

        //Introdução do valor para o mês
        System.out.print("Coloque o número do mês que pretende [1 a 12]: ");
        mes = teclado.nextInt();
        while(mes<=0 || mes>12){
            System.out.print("AVISO! O valor tem de ser entre 1 e 12: ");
            mes = teclado.nextInt();
        }

        //Fechar o teclado
        teclado.close();

        //apresentação do mês em switch
        switch(mes){
            case 1: {
                System.out.print("\nJaneiro");break;
            }
            case 2: {
                System.out.print("\nFevereiro");break;
            }
            case 3: {
                System.out.print("\nMarço");break;
            }
            case 4: {
                System.out.print("\nAbril");break;
            }
            case 5: {
                System.out.print("\nMaio");break;
            }
            case 6: {
                System.out.print("\nJunho");break;
            }
            case 7: {
                System.out.print("\nJulho");break;
            }
            case 8: {
                System.out.print("\nAgosto");break;
            }
            case 9: {
                System.out.print("\nSetembro");break;
            }
            case 10: {
                System.out.print("\nOutubro");break;
            }
            case 11: {
                System.out.print("\nNovembro");break;
            }
            case 12: {
                System.out.print("\nDezembro");break;
            }
        }

        //apresentação do mês em array
        System.out.println("\n\n" + meses[mes-1]);

    }
}
