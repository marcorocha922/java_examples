package Exercicios;

import java.util.Scanner;

public class meses_array {
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

        //apresentação do mês
        System.out.print(meses[mes-1]);
    }
}
